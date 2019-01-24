package learn

/**
  * @author: Arthas
  * @date: 2019-01-23 17:47
  * @description: 方法和函数
  */
object MethodAndFunctionDemo {

  //定义一个方法
  //方法m1参数要求是一个函数，函数的参数必须是两个Int类型
  //返回值类型也是Int类型
  def m1(f: (Int, Int) => Int): Int = {
    f(2, 6)
  }

  //定义一个函数f1,参数是两个Int类型，返回一个Int类型
  val f1 = (x: Int, y: Int) => x + y

  //定义一个函数f2
  val f2 = (m: Int, n: Int) => m * n


  def main(args: Array[String]): Unit = {
    //调用m1方法，并传入f1函数
    val r1 = m1(f1)
    println(r1)

    //调用m1方法，传入f2函数
    val r2 = m1(f2)
    println(r2)
  }

}
