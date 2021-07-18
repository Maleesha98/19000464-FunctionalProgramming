//Q1
//Can you write a recursive function prime(n) that returns true for a prime number and false for the other?
//
//For example prime(5) should return true and prime(8) should return false.
object Prime extends App {

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
  println(isprime(5))
  println(isprime(10))
}
