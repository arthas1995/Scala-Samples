package learn.collection

/**
  * @author: Arthas
  * @date: 2019-01-24 11:31
  * @description: Option[T] 表示有可能包含值的容器，也可能不包含值。
  */
object OptionTest {

  def main(args: Array[String]): Unit = {
    val x: Option[Int] = Some(5)

    println(x.get)

    //判断可选型是否为None
    println(x.isEmpty)

    //返回元素个数
    println(x.productArity)

    //是否存在某个元素
//    println(x.exists())
  }

}
