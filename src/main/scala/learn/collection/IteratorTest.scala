package learn.collection

/**
  * @author: Arthas
  * @date: 2019-01-24 11:39
  * @description: 迭代器
  */
object IteratorTest {

  def main(args: Array[String]): Unit = {
    val it = Iterator("Baidu", "Google", "FaceBook", "Taobao", "weibi")
    while (it.hasNext){
      println(it.next())
    }
  }

}
