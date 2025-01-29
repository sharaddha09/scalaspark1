package assingment1LOGICALOPERATORS

object multiplerangecheck {
def Multiplerangecheck(num:Int):Boolean = {
  (num>=1 && num<=10) ||  (num>=20 && num<=30)
}
  def main(args:Array[String]):Unit ={
   /* 6)Multiple Range Check:
      Write a Scala function to check if a given number is in the range [1, 10] or [20, 30].
    Sample Data:
      Number: 25*/
    var num = 25
    println(Multiplerangecheck(num))

  }
}
