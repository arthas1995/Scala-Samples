package learn

/**
  * @author: Arthas
  * @date: 2019-01-24 14:20
  * @description: 正则匹配
  */
object Regex {

  def main(args: Array[String]): Unit = {
    val pattern = "Scala".r();
    val str = "Scala is Scalasble  and cool";

    println(pattern findFirstMatchIn (str))
  }

}
