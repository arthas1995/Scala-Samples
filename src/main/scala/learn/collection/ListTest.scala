package learn.collection

/**
  * @author: Arthas
  * @date: 2019-01-24 11:26
  * @description: List的特征是其元素以线性方式存储，集合中可以存放重复对象
  */
object ListTest {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)

    for (x <- list) {
      println(x)
    }
  }

}
