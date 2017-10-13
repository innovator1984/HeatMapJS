package example
// import scala.scalajs.js.annotation.JSExport

case class Point(x: Int, y: Int) {
  def +(p: Point) = Point(x + p.x, y + p.y)
  def /(d: Int) = Point(x / d, y / d)
}

// @JSExport
object ScalaJSExample {
    // READ http://www.lihaoyi.com/hands-on-scala-js/
}
