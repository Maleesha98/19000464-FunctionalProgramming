object Q4 extends App{

  //defining account details as a list
  var Bank : List[Account] = List( new Account("986231307V", 1 , -100), new Account("996754320V",2,100) , new Account("986547321V",3,1000) )

  //List of Accounts with negative balances
  val FindNegativeBalance = ( n : Int , a : List[Account]) => a.filter( x => x.AccountNumber.equals( n ))

  //calculate overdrafts
  val Overdraft = ( a : List[Account] ) => a.filter( x => x.Balance < 0)
 
  //Calculate the sum of all account balances
  val balance = ( a: List[Account] ) => a.map( x => (x,x.Balance) ).reduce( (a , c) => ( c._1 , a._2 + c._2) )

  //Calculate interest of accounts
  val interest = ( a : List[Account] ) => a.map( x => {
    x.Balance match {
      case a if a >= 0 => x deposit x.Balance * 0.05
      case _ => x withdraw Math.abs(x.Balance) * 0.01

    }
    x
  })

  println("Bank: " + Bank )
  println()
  println("Find Negative Balance: " + FindNegativeBalance( 1 , Bank))
  println()
  println("Overdraft: " + Overdraft( Bank ))
  println()
  println("Balance: " + balance( Bank )._2 )
  println()

  Bank = interest( Bank )

  println("Bank: " + Bank )
  println("Balance: " + balance( Bank )._2  )

}

