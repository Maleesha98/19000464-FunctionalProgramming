object Q2 extends App{

  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)
  println(x)
  println(y)
  println(z)
//subtract values
  val sub1= x-y
  val sub2= sub1-z
  println(sub2)


}
 class Rational_2(x:Int,y:Int){

   //attributes
   def numer = x
   def denom = y

   //rational numbers adding method
   def +(r:Rational_2) = new Rational_2(this.numer * r.denom +r.numer * this.denom, denom * r.denom)
   //negative method
   def neg = new Rational_2(-this.numer,this.denom)
   //rational numbers subtraction method
   def -(r:Rational_2)= this + r.neg



   override def toString: String = numer+ "/" + denom

 }