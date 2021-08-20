class Account ( x:String , y: Int , z : Double){

  val NIC : String = x
  val AccountNumber : Int = y
  var Balance : Double = z

  def withdraw( amount : Double ) = this.Balance -= amount

  def deposit ( amount : Double ) = this.Balance += amount

  def transfer( amount : Double , that : Account ): Unit = {
    this.Balance =  this.Balance - amount
    that.Balance = that.Balance + amount
  }


  @Override
  override def toString() : String = "NIC : " + this.NIC + "\n Account Number : " + this.AccountNumber + "\n Balance : " + this.Balance

}
