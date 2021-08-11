object q1 extends App {

  val r1=new Rational(2,3)
  val r2=new Rational(3,4)
  val r3=new Rational(8)

  println()
  print("The negative of 2/3 is : "+r1.neg+"\n")
  print("The negative of 3/4 is : "+r2.neg+"\n")
  print("The negative of 8/1 is : "+r3.neg)

}

class Rational(x:Int,y:Int){

  require(y>0,"y should be greater than zero")

  def this(x:Int)=this(x,1)

  private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b)
  private val g=gcd(x,y)

  def numer: Int =x/g
  def denumer: Int = y/g

  def neg=new Rational(-this.numer,this.denumer)

  override def toString: String = numer+"/"+denumer

}
