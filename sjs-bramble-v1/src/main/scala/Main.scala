import org.scalajs.dom
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import scala.util.Random

class PosAngle (val x:Double, val y:Double, val a:Double) {
  def rotateAdvance(da: Double, l: Double) = new PosAngle(x+l*Math.cos(a+da), y+l*Math.sin(a+da), a+da)
  def distTo2(cx: Double, cy: Double) = Math.pow((cx-x), 2) + Math.pow((cy-y), 2)
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
    // no introspection in scalajs (they say), so we do write this code
    this.seed = params.getOrElse("seed", this.seed).asInstanceOf[Int]
    this.baseLength = params.getOrElse("baseLength", this.baseLength).asInstanceOf[Int]
    this.baseWidth = params.getOrElse("baseWidth", this.baseWidth).asInstanceOf[Int]
    this.factorLength = params.getOrElse("factorLength", this.factorLength).asInstanceOf[Float]
    this.factorWidth = params.getOrElse("factorWidth", this.factorWidth).asInstanceOf[Float]

    this.forbiddenX = params.getOrElse("forbiddenX", this.forbiddenX).asInstanceOf[Double]
    this.forbiddenY = params.getOrElse("forbiddenY", this.forbiddenY).asInstanceOf[Double]
    this.forbiddenRadius = params.getOrElse("forbiddenRadius", this.forbiddenRadius).asInstanceOf[Double]

    this.depth = params.getOrElse("depth", this.depth).asInstanceOf[Int]
    this.fluffyDepth = params.getOrElse("fluffyDepth", this.fluffyDepth).asInstanceOf[Int]
  }

  @JSExport
  def render(canvas: html.Canvas): Unit = {
    var ctx = canvas.getContext("2d").asInstanceOf[dom.CanvasRenderingContext2D]

    ctx.save()

    ctx.clearRect(0, 0, canvas.width, canvas.height)

    ctx.strokeStyle = "red"
    ctx.beginPath()
    ctx.lineWidth = 2
    ctx.arc(forbiddenX, forbiddenY, forbiddenRadius,  0, 2 * Math.PI)
    ctx.stroke()

    ctx.strokeStyle = "green"
    ctx.translate(canvas.width/2, canvas.height)
    ctx.rotate(-Math.PI / 2)

    val r = new Random()
    r.setSeed(seed)
    // TODO breadth first randomized (so adding levels keeps the base shape)
    // ^ not so conveninent from a ux point of view, with the current behavior of fluffyDepth

    def go(d: Int, width: Float, len: Float, pa: PosAngle):Unit = {
      if (d < 1) return
      if (pa.distTo2(forbiddenX, forbiddenY) < Math.pow(forbiddenRadius, 2)) return
      ctx.save()
      ctx.beginPath()
      ctx.moveTo(0, 0)
      ctx.lineTo(len, 0)
      ctx.lineWidth = width
      ctx.stroke()
      ctx.translate(len, 0)

      val subw = factorWidth*width
      val subl = factorLength*len

      {
        val a = -Math.PI/9+(r.nextFloat()-0.5)/10
        ctx.rotate(a)
        go(d-1, subw, subl, pa.rotateAdvance(a, subl))
        ctx.rotate(-a)
      }
      if (d <= fluffyDepth+1) // 2 branches at the first levels
      {
        val a = (r.nextFloat()-0.5)/10
        ctx.rotate(a)
        go(d-1, subw, subl, pa.rotateAdvance(a, subl))
        ctx.rotate(-a)
      }
      {
        val a = +Math.PI/9+(r.nextFloat()-0.5)/10
        ctx.rotate(a)
        go(d-1, subw, subl, pa.rotateAdvance(a, subl))
        ctx.rotate(-a)
      }

      ctx.restore()
    }

    go(depth, baseWidth, baseLength, new PosAngle(canvas.width/2, canvas.height, 0).rotateAdvance(-Math.PI/2, baseLength))

    ctx.restore()
  }
}