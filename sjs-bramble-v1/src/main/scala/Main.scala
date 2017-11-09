import language.experimental.macros
import org.scalajs.dom
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import scala.util.Random
import scala.collection.mutable.ArrayBuffer

class PosAngle (val x:Double, val y:Double, val a:Double) {
}

class Point(val x: Double, val y: Double) {
  def squareDistanceTo(cx: Double, cy: Double) = Math.pow((cx - x), 2) + Math.pow((cy - y), 2)
  def add(v: Vector) = new Point(x + v.x, y + v.y)
}

class Vector(val x: Double, val y: Double) {
  def normalize() = {
    val norm = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))
    new Vector(x / norm, y / norm)
  }
  def scale(factor: Double) = new Vector(x * factor, y * factor)
  def rotate(angle: Double) = new Vector(x * Math.cos(angle) - y * Math.sin(angle), y * Math.cos(angle) + x * Math.sin(angle))
}

class BranchSegment(val from: Point, val to: Point) {
  def extend(angle: Double, lengthFactor: Double) = {
    val straightExtension = new Vector(to.x - from.x, to.y - from.y)
    val extension = straightExtension.rotate(angle).scale(lengthFactor)
    new BranchSegment(
      to,
      to.add(extension)
    )
  }
}

@JSExport
class BSTest (
  var seed: Int = 20171104,
  var name: String = "TREE",
  var baseWidth: Int = 10,
  var baseLength: Int = 50,
  var factorWidth: Float = 0.7f,
  var factorLength: Float = 0.9f,
  var forbiddenX: Double = 400,
  var forbiddenY: Double = 135,
  var forbiddenRadius: Double = 25,
  var fluffyDepth: Int = 5,
  var depth: Int = 9
) {

  @JSExport
  def injectParams(params: js.Dictionary[Any]): Unit = {
    Macros.autoField(this.seed)
    Macros.autoField(this.baseWidth)
    Macros.autoField(this.baseLength)

    Macros.autoField(this.factorWidth)
    Macros.autoField(this.factorLength)

    Macros.autoField(this.forbiddenX)
    Macros.autoField(this.forbiddenY)
    Macros.autoField(this.forbiddenRadius)

    Macros.autoField(this.depth)
    Macros.autoField(this.fluffyDepth)
  }

  @JSExport
  def render(canvas: html.Canvas): Unit = {
    var ctx = canvas.getContext("2d").asInstanceOf[dom.CanvasRenderingContext2D]

    ctx.save()

    ctx.clearRect(0, 0, canvas.width, canvas.height)

    drawForbiddenCircle(ctx)

    drawTree(canvas, ctx)

    ctx.restore()
  }

  def drawTree(canvas: html.Canvas, ctx: dom.CanvasRenderingContext2D): Unit = {
    ctx.strokeStyle = "green"

    val r = new Random()
    r.setSeed(seed)
    // TODO breadth first randomized (so adding levels keeps the base shape)
    // ^ not so conveninent from a ux point of view, with the current behavior of fluffyDepth

    def isBranchAllowed(firstSegment: BranchSegment): Boolean = {
      firstSegment.from.squareDistanceTo(forbiddenX, forbiddenY) > Math.pow(forbiddenRadius, 2)
    }

    def drawBranch(depth: Int, firstSegmentWidth: Float, firstSegment: BranchSegment): Unit = {
      if (depth < 1) return
      if (!isBranchAllowed(firstSegment)) return
      ctx.save()
      ctx.beginPath()
      ctx.moveTo(firstSegment.from.x, firstSegment.from.y)
      ctx.lineTo(firstSegment.to.x, firstSegment.to.y )
      ctx.lineWidth = firstSegmentWidth
      ctx.stroke()

      val childrenWidth = factorWidth * firstSegmentWidth

      def drawChild(relativeAngle: Double) = {
        drawBranch(depth - 1, childrenWidth, firstSegment.extend(relativeAngle, factorLength))
      }

      val childrenAngles = ArrayBuffer[Double](
        -Math.PI / 9 + (r.nextFloat() - 0.5) / 10,
        +Math.PI / 9 + (r.nextFloat() - 0.5) / 10)
      // One more central child branch when it starts getting fluffy
      if (depth <= fluffyDepth + 1) {
        childrenAngles += (r.nextFloat() - 0.5) / 10
      }

      childrenAngles map drawChild

      ctx.restore()
    }

    val firstSegment = new BranchSegment(
      new Point(canvas.width / 2, canvas.height),
      new Point(canvas.width / 2, canvas.height - baseLength))
    drawBranch(depth, baseWidth, firstSegment)
  }

  def drawForbiddenCircle(ctx: dom.CanvasRenderingContext2D): Any = {
    ctx.strokeStyle = "red"
    ctx.beginPath()
    ctx.lineWidth = 2
    ctx.arc(forbiddenX, forbiddenY, forbiddenRadius, 0, 2 * Math.PI)
    ctx.stroke()
  }

}