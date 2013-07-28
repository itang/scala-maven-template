package example

import language._

import org.junit.Test
import org.scalatest.junit.AssertionsForJUnit

class EchoScalaTest extends AssertionsForJUnit {

  @Test def test() {
    assert("hello" === new Echo().echo("hello"))
  }
}
