object q4 extends App {

  //dummy accounts to demonstrate
  var Acc_1 = new bank_acount("996632531v", 10000, 2000)
  var Acc_2 = new bank_acount("987635421v", 10001, 5000)
  var Acc_3 = new bank_acount("913467823v", 10002, -4500)
  var Acc_4 = new bank_acount("976354235v", 10003, 4000)
  var Acc_5 = new bank_acount("967352437v", 10004, -1500)

  //list of bank accounts
  val bank = List(Acc_1, Acc_2, Acc_3, Acc_4, Acc_5)

  //4.0
  //print all the account details
  println("All the account details => ")
  bank.foreach(println)

  //4.1
  //print accounts with negative balance
  println("\nList of Accounts with negative balances => ")
  val overdraft=(b:List[bank_acount])=> b.filter(x=>x.balance<0)
  overdraft(bank).foreach(println)

  //4.2
  //print sum of the accounts
  println("\nTotal of all account balances => ")
  def sum(a : List[bank_acount]):Double = a.map(_.balance).sum
  println(sum(bank))

  //4.3
  //balance after calculating interest
  println("\nSum of all accounts before interest => ")
  bank.foreach(x => if(x.balance > 0) x.new_balance(0.05) else x.new_balance(0.1))
  bank.foreach(println)

}

class bank_acount(id: String, num: Int, bal: Double) {

  val nic: String = id
  val acc_num: Int = num
  var balance: Double = bal

  def new_balance(interest: Double):Unit= this.balance = this.balance + this.balance*interest

  override def toString = "NIC:" + nic + ", Account_number:" + acc_num + ", Account_balance:" + balance
}
