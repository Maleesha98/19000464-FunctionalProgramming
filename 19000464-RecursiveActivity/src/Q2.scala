import PrimeSequence.printprime
//Q2
//Can you write a recursive function primeSeq(n) that prints all 	prime number which less than n?
//
//For example prime(10) should print 2,3,5, and 7 on the terminal.

object PrimeSequence extends App {

  def isprime(a:Int,b:Int=2):Boolean= {
    a match{
      case a if (a==b) =>true
      case a if gcd(a,b)>1 => false
      case a  =>isprime(a,b+1)
    }

  }
  def gcd(a:Int,b:Int):Int=
    b match{
      case 0 => a
      case b if (b>a) =>gcd(b,a)
      case b => gcd(b,a%b)
    }
  /*def printprime(x:Int,i:Int=1):Unit=
    x>i match{
      case false => println("No prime numbers")
      case true if  isprime(i+1) => println(i+1)
      case true if x>=i => printprime(x, i)
    }*/
  def printprime(x:Int,i:Int=2):Any= {
    if (x>i)
      if(isprime(i)) println(i) else printprime(x,i+1)
  }
  printprime(10)



}
