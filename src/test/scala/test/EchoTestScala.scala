package test

import org.scalatest.junit.AssertionsForJUnit
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith
import org.junit.Test

@RunWith(classOf[JUnitRunner])
class EchoTestScala extends AssertionsForJUnit {

  @Test def test() {
    assert("hello" === new Echo().echo("hello"))
  }
}
