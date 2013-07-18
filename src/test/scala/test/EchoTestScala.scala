package test

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test

class EchoTestScala extends AssertionsForJUnit {

  @Test def test() {
    assert("hello" === new Echo().echo("hello"))
  }
}
