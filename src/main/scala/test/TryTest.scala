package test

object TryTest {
  implicit def anyToP(t: Any) = new {
    def printf() = println(t)
  }

  def main(args: Array[String]): Unit = {
    println("Hello")
    System.currentTimeMillis().printf

    new Echo().echo(",World!") printf
  }
}
