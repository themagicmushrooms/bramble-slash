import scala.language.experimental.macros
import scala.reflect.ClassTag
import scala.reflect.macros.blackbox.Context

object Macros {

  def autoFieldImpl[T: c.WeakTypeTag](c: Context)(f: c.Tree) = {
    import c.universe._
    val q"""this $tr""" = f
    val ty = c.symbolOf[T]
    var trstr = Literal(Constant(tr.toString()))
    c.Expr[Unit](q"""this.$tr = params.getOrElse($trstr, this.$tr).asInstanceOf[$ty] ; println(this.$tr)""")

    //this.seed = params.getOrElse("seed", this.seed).asInstanceOf[Int]

  }

  def autoField[T](f: T): Unit = macro Macros.autoFieldImpl[T]
}
