//19000464
object Q3 extends App{
 def TotCost(x:Int): Double=
 {
  val cost=x*24.95*0.6
  var totCost=0.0
  if(x > 50){
   totCost = cost +0.75f*(x-50)+150
  }
  else{
   totCost = cost + 3*x
  }
  return totCost
 }

 println("total wholesale cost for 60 copies: Rs"+TotCost(60))
}