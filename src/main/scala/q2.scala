object q2 extends App{

  val x=new rational_num(3,4)
  val y=new rational_num(5,8)
  val z=new rational_num(2,7)

  print("\nThe value of x-y-z is => ")
  println(x-y-z)

}

  class rational_num(x:Int,y:Int){

    require(y>0,"y should be greater than zero")

    private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b)
    private val g=gcd(x,y)

    def numer: Int =x/g
    def denumer: Int = y/g

    def neg = new rational_num(-this.numer,this.denumer)
    def +(r:rational_num) = new rational_num(this.numer*r.denumer + r.numer*this.denumer,denumer*r.denumer)
    def -(r:rational_num) = this+r.neg

    override def toString: String = numer+"/"+denumer
}
