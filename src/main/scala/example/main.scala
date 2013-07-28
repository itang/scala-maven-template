package example

import language._

object Main {
  implicit class AnyPowable(t: Any) {
    def printf() = println(t)
  }

  def main(args: Array[String]): Unit = {
    println("Hello")
    System.currentTimeMillis().printf

    new Echo().echo(",World!") printf
  }
}
