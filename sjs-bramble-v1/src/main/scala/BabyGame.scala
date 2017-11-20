
import org.scalajs.dom
import org.scalajs.dom.Event
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import js.Dynamic.{ global => g }
import js.JSConverters._

import scala.math.{ Pi => π }

import BABYLON.{Vector3, Mesh, MeshBuilder, Quaternion}

import scala.util.Random

class BabyGame() {

  var _canvas: HTMLCanvasElement = null
  var _engine: BABYLON.Engine = null
  var _scene: BABYLON.Scene = null
  var _camera: BABYLON.FreeCamera = null
  var _light: BABYLON.HemisphericLight = null
  var t: Double = 0
  val r = new Random()
  //r.setSeed(123)

  def this(canvasSelector: String) = {
    this()
    this._canvas = dom.document.querySelector(canvasSelector).asInstanceOf[HTMLCanvasElement]
    this._engine = new BABYLON.Engine(this._canvas, true)
  }

  def createScene() = {
    this._scene = new BABYLON.Scene(this._engine)

    // create a FreeCamera, and set its position to (x:0, y:5, z:-10)
    this._camera = new BABYLON.FreeCamera("camera1", new BABYLON.Vector3(0, 5,-10), this._scene)

    // target the camera to scene origin
    this._camera.setTarget(BABYLON.Vector3.Zero())

    // attach the camera to the canvas
    this._camera.attachControl(this._canvas.asInstanceOf[HTMLElement], false)


    // create a basic light, aiming 0,1,0 - meaning, to the sky
    //this._light = new BABYLON.HemisphericLight("light1", new BABYLON.Vector3(0, 1, 0), this._scene)

    //Light direction is up and left
    val light0 = new BABYLON.HemisphericLight("hemiLight", new BABYLON.Vector3(-1, 1, 0), _scene);
    light0.diffuse = new BABYLON.Color3(0, 1, 0);
    light0.specular = new BABYLON.Color3(1, 0, 0);
    light0.groundColor = new BABYLON.Color3(0.3, 0.1, 0.1);
    _light = light0

    /*var light1 = new BABYLON.HemisphericLight("hemiLight", new BABYLON.Vector3(-1, 1, 0), _scene);
    light1.diffuse = new BABYLON.Color3(1, 1, 1);
    light1.specular = new BABYLON.Color3(1, 1, 1);
    light1.groundColor = new BABYLON.Color3(0, 0, 0);*/


    createTree()



    // create a built-in "ground" shape
    val ground = BABYLON.MeshBuilder.CreateGround("ground", js.Dynamic.literal(width = 6, height = 6, subdivisions = 2), this._scene)
    val groundMaterial = new BABYLON.StandardMaterial("myMaterial", _scene)
    groundMaterial.diffuseColor = new BABYLON.Color3(0.7, 0.5, 0.1);
    groundMaterial.specularColor = new BABYLON.Color3(0.5, 0.6, 0.87);
    groundMaterial.emissiveColor = new BABYLON.Color3(0.1, 0.1, 0.1);
    groundMaterial.ambientColor = new BABYLON.Color3(0.23, 0.98, 0.53);
    ground.material = groundMaterial;

  }

  def createTree() = {

    val trunk = new BranchSegment2(
      Vector3.Zero(),
      new Vector3(-π / 2, 0, 0),
      1,
      0.2)
    render(trunk, 6)

  }

  lazy val branchBlueprint = {
    val sectionShape = Array(
      new BABYLON.Vector3(0, 0.5, 0),
      new BABYLON.Vector3(0.1, 0.1, 0),
      new BABYLON.Vector3(0.5, 0, 0),
      new BABYLON.Vector3(0.1, -0.1, 0),
      new BABYLON.Vector3(0, -0.5, 0),
      new BABYLON.Vector3(-0.1, -0.1, 0),
      new BABYLON.Vector3(-0.5, 0, 0),
      new BABYLON.Vector3(-0.1, 0.1, 0),
      new BABYLON.Vector3(0, 0.5, 0)
    )
    val path = js.Array(
      new BABYLON.Vector3(0, 0, 0),
      new BABYLON.Vector3(0, 0, 1)
    )
    val options = js.Dictionary("shape" -> sectionShape.toJSArray, "path" -> path, "sideOrientation" -> Mesh.DOUBLESIDE)
    val mesh = MeshBuilder.ExtrudeShape("section", options, null)
    mesh.setEnabled(false)
    mesh
  }

  def render(segment: BranchSegment2, depth: Int): Unit = {

    //g.console.log("render depth=" + depth)

    val mesh = branchBlueprint.clone("branch", null)
    mesh.scaling = new Vector3(segment.width, segment.width, segment.length)
    mesh.rotation = segment.orientation
    mesh.position = segment.from


    if (depth > 1) {

      val displacement = mesh.getDirection(new Vector3(0, 0, 1))
      val endPos = segment.from.add(displacement)

      val sphere = BABYLON.MeshBuilder.CreateSphere("sphere", js.Dynamic.literal(segments = 16, diameter = segment.width), this._scene)
      sphere.position = endPos

      val nbChildren = 3
      val childLengthFactor = 0.8
      val childWidthFactor = 0.5
      for(childNum <- 1 to nbChildren) {
        val inclination = π / 3 + (r.nextFloat() - 1) * π / 6
        val longitudeMin = 2 * π * (childNum - 1) / nbChildren
        val longitudeRange = 2 * π / nbChildren
        val longitude = longitudeMin + r.nextFloat() * longitudeRange
        val childOrientation = rotateBranch(segment.orientation, inclination, longitude)
        val child = new BranchSegment2(endPos, childOrientation, segment.length * childLengthFactor, segment.width * childWidthFactor)
        render(child, depth - 1)
      }
    }

  }

  def rotateBranch(originalOrientation: Vector3, inclination: Double, longitude: Double): Vector3 = {
    val originalQuaternion = Quaternion.RotationYawPitchRoll(originalOrientation.y, originalOrientation.x, originalOrientation.z)
    val rollToLongitude = Quaternion.RotationYawPitchRoll(0, 0, longitude)
    val incline = Quaternion.RotationYawPitchRoll(inclination, 0, 0)
    val cancelRoll = Quaternion.RotationYawPitchRoll(0, 0, -longitude)
    originalQuaternion.multiply(rollToLongitude).multiply(incline).multiply(cancelRoll).toEulerAngles()
  }

  def update() = {
    t = t + 0.1
    _light.direction = new Vector3(math.cos(t), -1, math.sin(t))
  }

  def doRender() = {
    // run the render loop
    this._engine.runRenderLoop(() => {
      this.update()
      this._scene.render()
    })

    // the canvas/window resize event handler
    dom.window.addEventListener("resize", (e: Event) => {
      println("RESIZE")
      this._engine.resize()
    })
  }
}

class BranchSegment2(val from: Vector3, val orientation: Vector3, val length: Double, val width: Double) {}

@JSExport
class BabyGameJS {

  @JSExport
  def go() = {
    dom.window.addEventListener("DOMContentLoaded", (e: Event) => {
      // Create the game using the 'renderCanvas'
      val game = new BabyGame("#canvasBabylon")

      // Create the scene
      game.createScene()

      // start animation
      game.doRender()
    })
  }

}