object q3 extends App{

  val acc_1 = new Account("996623531v",10001001,8000.00)
  val acc_2 = new Account("997645321v",10001110,5000.00)

  println("\nBefore transfer money : Balance of Account 1 = "+acc_1.balance);
  println("Before transfer money : Balance of Account 2 = "+acc_2.balance);

  println("\nTransfer 5000 from Account 1 to Account 2\n");
  acc_1.transfer(acc_2,2000)

  println("New Balance of Account 1 = "+acc_1.balance);
  println("New Balance of Account 2 = "+acc_2.balance);
}

class Account(id:String,num:Int,bal:Double){

  val nic:String = id
  val acc_num:Int = num
  var balance:Double = bal

  def withdraw(c:Double):Unit={
    this.balance=this.balance-c
  }

  def deposit(c:Double):Unit={
    this.balance=this.balance+c
  }

  def transfer(a:Account,b:Double):Unit=
  {
    if(this.balance>b){
      this.withdraw(b)
      a.deposit(b)
    }
    else
      println("Your balance is insufficient");
  }

}
