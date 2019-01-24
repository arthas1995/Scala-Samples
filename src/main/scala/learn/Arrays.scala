package learn

/**
  * @author: Arthas
  * @date: 2019-01-24 11:19
  * @description: scala 数组
  */
object Arrays {

  def main(args: Array[String]): Unit = {
    var list = Array(1.9, 2.1, 3.14, 9.9)


    //输出元素
    for (x <- list) {
      println(x)
    }

    //计算数组所有元素的总和
    var total = 0.0
    for (i <- 0 to (list.length - 1)) {
      total += list(i)
    }
    println("总数和 ： " + total)

    //查询数组中元素最大的
    var max = list(0)
    for (x <- list) {
      if (x > max) {
        max = x;
      }
    }
    println("数组最大值：" + max)
  }

}
