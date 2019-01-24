package learn.collection

/**
  * @author: Arthas
  * @date: 2019-01-24 11:28
  * @description: Set是最简单的一种集合。集合中的对象不按特定的方式排序，并且没有重复对象。
  */
object SetTest {

  def main(args: Array[String]): Unit = {
    val set = Set(1, 2, 3, 4, 2, 1, 1, 2, 6)

    for (x <- set) {
      println(x)
    }
  }

}
