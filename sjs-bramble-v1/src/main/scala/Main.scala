import language.experimental.macros

import org.scalajs.dom
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import scala.util.Random
import scala.collection.mutable.ArrayBuffer

class PosAngle (val x:Double, val y:Double, val a:Double) {
  def rotateAdvance(da: Double, l: Double) = new PosAngle(x+l*Math.cos(a+da), y+l*Math.sin(a+da), a+da)
  def squareDistanceTo(cx: Double, cy: Double) = Math.pow((cx-x), 2) + Math.pow((cy-y), 2)
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
    ctx.translate(canvas.width / 2, canvas.height)
    ctx.rotate(-Math.PI / 2)

    val r = new Random()
    r.setSeed(seed)
    // TODO breadth first randomized (so adding levels keeps the base shape)
    // ^ not so conveninent from a ux point of view, with the current behavior of fluffyDepth

    def isBranchAllowed(branchOrigin: PosAngle, branchLength: Float): Boolean = {
      branchOrigin.squareDistanceTo(forbiddenX, forbiddenY) > Math.pow(forbiddenRadius, 2)
    }

    def drawBranch(depth: Int, firstSegmentWidth: Float, firstSegmentLength: Float, branchOrigin: PosAngle): Unit = {
      if (depth < 1) return
      if (!isBranchAllowed(branchOrigin, firstSegmentLength)) return
      ctx.save()
      ctx.beginPath()
      ctx.moveTo(0, 0)
      ctx.lineTo(firstSegmentLength, 0)
      ctx.lineWidth = firstSegmentWidth
      ctx.stroke()
      ctx.translate(firstSegmentLength, 0)

      val childrenWidth = factorWidth * firstSegmentWidth
      val childrenLength = factorLength * firstSegmentLength

      def drawChild(relativeAngle: Double) = {
        ctx.rotate(relativeAngle)
        drawBranch(depth - 1, childrenWidth, childrenLength, branchOrigin.rotateAdvance(relativeAngle, childrenLength))
        ctx.rotate(-relativeAngle)
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

    drawBranch(depth, baseWidth, baseLength, new PosAngle(canvas.width / 2, canvas.height, -Math.PI / 2))
  }

  def drawForbiddenCircle(ctx: dom.CanvasRenderingContext2D): Any = {
    ctx.strokeStyle = "red"
    ctx.beginPath()
    ctx.lineWidth = 2
    ctx.arc(forbiddenX, forbiddenY, forbiddenRadius, 0, 2 * Math.PI)
    ctx.stroke()
  }

}