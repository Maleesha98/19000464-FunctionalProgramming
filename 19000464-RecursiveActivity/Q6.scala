//The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, . . .
//
//Each subsequent number is the sum of the previous two.
//
//Write a recursive function print fist n Fibonacci numbers for given n.

object Q6 extends App {
   def fibonacci(n:Int):Int=
     n match{
       case 0 =>0
       case 1=> 1
       case _ => fibonacci(n-1)+fibonacci(n-2)
     }

  def sequence(x:Int):Unit= {
    if(x>0) sequence(x-1)
    println(fibonacci(x))
  }

  sequence(10)
}
