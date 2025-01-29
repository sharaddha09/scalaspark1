package assingment1LOGICALOPERATORS

object first {
  def main(args:Array[String]):Unit={
   //println("hello world")
   val a=20
    //print(a)
    val b=30
    val c=a+b
    //println(a)
    //print(c)
   var d=40
        d= 50
        d=60
    //println(d)
//var arr= array(10,20,30,40)
    var number=14
    if(number%2==0)
      println("even and positive")
    else {
      print("odd")
     // Range Check with OR:
      //2)//Create a Scala program to determine if a given value is either less than -10 or greater than 10.
    //Sample Data:

    }
     number = -15
    if(number< -10 || number>10)
    println("true")
    else
    print("false")
   // 3)Odd Number Check with AND:
      //Implement a Scala function to check if a given number is odd and not divisible by 3.
    //Sample Data:
      number= 27
    if(number%2!=0 && number%3!=0)
      println("odd and not division by 3")
    else
      println("even")
    //4)Divisibility by 4 OR 6: Write a Scala program to check if a given number is divisible by either 4 or 6.

      number=18
    if(number%4==0 || number%6==0)
      print("it is divisible by 4 or 6")
    else
      print("it is not divisible by 4 or 6")

    val arr = Array(10, 20, 30, 40, 50)

      println("Array elements are:")
    for (i <- arr) {
      println(i)
      var arr = Array(1, 2, 3, 4, 5)
      arr(2) = 99
      println("Updated array elements are:")
      for (i <- arr) {
        println(i)
      }
      arr = Array(5, 10, 15, 20, 25)
    }
  }

}
