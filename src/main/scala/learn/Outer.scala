package learn

/**
  * @author: Arthas
  * @date: 2019-01-23 16:56
  * @description: Scala 访问修饰符
  */
class Outer {

  class Inner {
    private def f() {
      println("f")
    }

    class InnerMostP

    f()
  }

}
