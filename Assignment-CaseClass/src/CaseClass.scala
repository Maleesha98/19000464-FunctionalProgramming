//implement case class
case class Point(a:Int,b:Int){

  def x:Int =a
  def y:Int =b

  //add(+) should add two given points
  def +( that:Point) : Point = Point( this.x + that.x , this.y + that.y )
  //move should move a point by a given distance dx and dy
  def move( dx : Int , dy : Int ) :Point = Point( this.x + dx , this.y + dy )
  //distance should return the distance between two given points
  def distance( that : Point ) : Double = math.sqrt( math.pow( ( this.x - that.x ) , 2) + math.pow( ( this.y - that.y) , 2))
  //invert should switch the x and y coordinates
  def invert : Point = Point( this.y , this.x )
}

object CaseClass extends App {

  val p1 = Point(1, 1)
  val p2 = Point(2, 3)

  val p4 = p1.copy()
  val p5 = p2.copy(b = 5)

  println(p1)
  println(p2)

  println(p1 == p4)
  println(p2 == p5)

  println(p1 + p2)

  println(p1.move(10, 20))

  println(p1 distance p2)

  println(p2.invert)

}






