//Can you write a recursive function to get the addition of all even numbers less than given n.
object Sum extends App {

  def addEven(n: Int): Int =
    n match {
      case 0 => 0
      case 1 => 0
      case n if (n < 0) => 0
      case n => (n + addEven(n - 2))
    }
  def sumEven(n:Int):Int =
    if(n%2 ==0 )
       addEven(n-2)
    else
      addEven(n-1)

  println(sumEven(10))

}
