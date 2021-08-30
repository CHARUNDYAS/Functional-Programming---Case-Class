// SCS2204 Functional Programming
// Assignment - Case Class
// 19000561

case class Point(x:Int, y:Int) {
  def +(p:Point) = Point(x + p.x, y + p.y)
  def *(d:Int) = Point(x*d, y*d)
  def -(p:Point) = Point(x - p.x, y - p.y)
  def invert(p:Point) = Point(x = p.y, y = p.x)
}

object caseClass {
  def main(args: Array[String]): Unit = {
    val p1 = Point(1,2)
    val p2 = Point(5,6)
    val p3 = p1 + p2
    val p4 = p1 * 5
    val p5 = p1 - p2
    val p6 =  p1 invert p1

    val  dist = scala.math.sqrt((p5.x*p5.x) + (p5.y*p5.y))

    println("\n The first point : ( " + p1.x + " , " + p1.y + " )")
    println(" The second point  : ( " + p2.x + " , " + p2.y + " )")
    println(" The addition of the points : ( " + p3.x + " , " + p3.y + " )\n")
    println(" The point : ( " + p1.x + " , " + p1.y + " )")
    println(" After movement, the point : ( " + p4.x + " , " + p4.y + " )")
    println("\n The first point : ( " + p1.x + " , " + p1.y + " )")
    println(" The second point  : ( " + p2.x + " , " + p2.y + " )")
    println(" The distance between the points : " + dist)
    println("\n The point : ( " + p1.x + " , " + p1.y + " )")
    println(" After inversion, the point : ( " + p6.x + " , " + p6.y + " )")
  }
}
