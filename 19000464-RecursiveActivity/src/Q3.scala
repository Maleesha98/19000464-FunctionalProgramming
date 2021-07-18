//Can you write a recursive function returns the addition of numbers from1 to n?
//
//For example sum(5) should print 15
object addition extends App {
  def add(n:Int):Int= {
    if (n == 1) 1
    else (n + add(n - 1))
  }
  println(add(3))


}
