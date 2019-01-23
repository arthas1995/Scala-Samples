package learn

/**
  * @author: Arthas
  * @date: 2019-01-23 15:47
  * @description:
  */
object DoubleValues {

  def main(args: Array[String]): Unit = {
    val values = List(1, 2, 3, 4, 5, 6)
    val doubleValues = values.map(_ * 2)

    println(doubleValues)
  }

}
