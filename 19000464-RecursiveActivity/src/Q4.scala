//Can you write a recursive function to determine even and odd numbers?
object Q4 extends App {
  def checkeven(x:Int):Boolean= {
    x % 2 match {
      case 0 => true
      case _ => false

    }
  }
  def checkodd(x:Int):Boolean= !(checkeven(x:Int))

  println(checkeven(5))
  println(checkodd(6))
  println(checkeven(2))

}
