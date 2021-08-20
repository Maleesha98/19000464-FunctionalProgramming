object Q1 extends App{
  val x = new Rational(4,5)
  println(x.neg)
}

class Rational(x: Int,y: Int){

    //define numerator and denominator
    def numer= x
    def denom=y

    //negative method
    def neg:Rational= new Rational(-this.numer, this.denom)

    override def toString: String = numer+ "/" + denom
}





