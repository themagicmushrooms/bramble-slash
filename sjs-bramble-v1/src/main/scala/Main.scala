import org.scalajs.dom
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

@JSExport
class BSTest (
  var seed: Int = 20171104,
  var base: Int = 10,
  var name: String = "TREE"
) {

  @JSExport
  def injectParams(params: js.Dictionary[Any]): Unit = {
    this.base = params.getOrElse("base", this.base).asInstanceOf[Int]
  }

  @JSExport
  def render(canvas: html.Canvas): Unit = {
    val ctx = canvas.getContext("2d")
      .asInstanceOf[dom.CanvasRenderingContext2D]

    println(seed, base, name)
    ctx.clearRect(0, 0, canvas.width, canvas.height)
    ctx.fillStyle = "green";
    ctx.fillRect(100, 100, 3*base, base)
  }
}