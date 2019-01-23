package learn

/**
  * @author: Arthas
  * @date: 2019-01-23 17:02
  * @description: 算术运算符
  */
object Operator {

  def main(args: Array[String]): Unit = {
    var a = 10;
    var b = 20;
    var c = 25;
    var d = 25;

    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a * b))
    println("b / a = " + (b / a))
    println("b % a = " + (b % a))
    println("c % a = " + (c % a))

    //关系运算符
    println("a == b = " + (a == b))
    println("a != b = " + (a != b))
    println("a > b = " + (a > b))
    println("a < b = " + (a < b))
    println("b >= a = " + (b >= a))
    println("b <= a = " + (b <= a))


    var e = true;
    var f = false;

    println("e && f = " + (e && f));

    println("e || f = " + (e || f));

    println("!(e && f) = " + !(e && f));
  }

}
