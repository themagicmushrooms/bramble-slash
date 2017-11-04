import org.scalajs.dom
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import scala.util.Random

@JSExport
class BSTest (
  var seed: Int = 20171104,
  var name: String = "TREE",
  var baseWidth: Int = 10,
  var baseLength: Int = 50,
  var factorWidth: Float = 0.7f,
  var factorLength: Float = 0.9f,
  var fluffyDepth: Int = 5,
  var depth: Int = 9
) {

  @JSExport
  def injectParams(params: js.Dictionary[Any]): Unit = {
    this.seed = params.getOrElse("seed", this.seed).asInstanceOf[Int]
    this.baseLength = params.getOrElse("baseLength", this.baseLength).asInstanceOf[Int]
    this.baseWidth = params.getOrElse("baseWidth", this.baseWidth).asInstanceOf[Int]
    this.factorLength = params.getOrElse("factorLength", this.factorLength).asInstanceOf[Float]
    this.factorWidth = params.getOrElse("factorWidth", this.factorWidth).asInstanceOf[Float]
    this.depth = params.getOrElse("depth", this.depth).asInstanceOf[Int]
    this.fluffyDepth = params.getOrElse("fluffyDepth", this.fluffyDepth).asInstanceOf[Int]
  }

  @JSExport
  def render(canvas: html.Canvas): Unit = {
    var ctx = canvas.getContext("2d").asInstanceOf[dom.CanvasRenderingContext2D]

    ctx.save()

    ctx.clearRect(0, 0, canvas.width, canvas.height)
    ctx.strokeStyle = "green"

    ctx.translate(canvas.width/2, canvas.height)
    ctx.rotate(-Math.PI / 2)

    val r = new Random()
    r.setSeed(seed)
    // TODO breadth first randomized (so adding levels keeps the base shape)
    // ^ not so conveninent from a ux point of view, with the current behavior of fluffyDepth

    def go(d: Int, width: Float, len: Float):Unit = {
      if (d < 1) return
      ctx.save()
      ctx.beginPath()
      ctx.moveTo(0, 0)
      ctx.lineTo(len, 0)
      ctx.lineWidth = width
      ctx.stroke()
      ctx.translate(len, 0)

      ctx.rotate(-Math.PI/9-r.nextFloat()/10)
      go(d-1, factorWidth*width, factorLength*len)
      ctx.rotate(Math.PI/9+r.nextFloat()/10)
      if (d <= fluffyDepth+1) // 2 branches at the first levels
        go(d-1, factorWidth*width, factorLength*len)
      ctx.rotate(Math.PI/9+r.nextFloat()/10)
      go(d-1, factorWidth*width, factorLength*len)

      ctx.restore()
    }

    go(depth, baseWidth, baseLength)

    ctx.restore()
  }
}