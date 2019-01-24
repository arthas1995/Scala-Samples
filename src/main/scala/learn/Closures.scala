package learn

/**
  * @author: Arthas
  * @date: 2019-01-24 11:16
  * @description: scala 闭包 是一个函数，返回值依赖于声明在函数外部的一个或多个变量。
  */
object Closures {


  def main(args: Array[String]): Unit = {
    println("muliplier(1) value = " + multiplier(1))
    println("muliplier(2) value = " + multiplier(2))
  }

  var factor = 3
  val multiplier = (i: Int) => i * factor

}
