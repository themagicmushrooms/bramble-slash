import org.scalajs.dom
import org.scalajs.dom.html

import scala.scalajs.js.annotation.JSExport

@JSExport
object BBTest {

  @JSExport
  def main(canvas: html.Canvas): Unit = {
    val ctx = canvas.getContext("2d")
      .asInstanceOf[dom.CanvasRenderingContext2D]


    ctx.clearRect(0, 0, canvas.width, canvas.height)
    ctx.fillStyle = "green";
    ctx.fillRect(100, 100, 30, 10)
  }
}