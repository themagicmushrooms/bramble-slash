
import org.scalajs.dom
import org.scalajs.dom.Event
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

class BabyGame() {

  var _canvas: HTMLCanvasElement = null
  var _engine: BABYLON.Engine = null
  var _scene: BABYLON.Scene = null
  var _camera: BABYLON.FreeCamera = null
  var _light: BABYLON.Light = null

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
    this._light = new BABYLON.HemisphericLight("light1", new BABYLON.Vector3(0,1,0), this._scene)

    // create a built-in "sphere" shape; with 16 segments and diameter of 2
    val sphere = BABYLON.MeshBuilder.CreateSphere("sphere", js.Dynamic.literal(segments = 16, diameter = 2), this._scene)

    // move the sphere upward 1/2 of its height
    sphere.position.y = 1;

    // create a built-in "ground" shape
    val ground = BABYLON.MeshBuilder.CreateGround("ground", js.Dynamic.literal(width = 6, height = 6, subdivisions = 2), this._scene)
  }

  def doRender() = {
    // run the render loop
    this._engine.runRenderLoop(() => {
      this._scene.render()
    })

    // the canvas/window resize event handler
    dom.window.addEventListener("resize", (e: Event) => {
      println("RESIZE")
      this._engine.resize()
    })
  }
}

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