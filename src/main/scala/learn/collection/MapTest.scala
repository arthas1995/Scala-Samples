package learn.collection

/**
  * @author: Arthas
  * @date: 2019-01-24 11:29
  * @description:
  */
object MapTest {

  def main(args: Array[String]): Unit = {
    val map = Map("one" -> 1, "two" -> 2, "three" -> 3)

    val value = map.get("two")

    println(value)
  }

}
