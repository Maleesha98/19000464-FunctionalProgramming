//Data Structure for Account and create a method transfer which transfer the money from this account to a given account
class Account ( x:String , y: Int , z : Double){

  val NIC : String = x
  val AccountNumber : Int = y
  var Balance : Double = z

  def deposit ( amount : Double ) = this.Balance += amount

  def transfer( amount : Double , that : Account ): Unit = {
    this.Balance =  this.Balance - amount
    that.Balance = that.Balance + amount
  }
  
  def withdraw( amount : Double ) = this.Balance -= amount


  @Override
  override def toString() : String = "NIC : " + this.NIC + "\n Account Number : " + this.AccountNumber + "\n Balance : " + this.Balance

}
