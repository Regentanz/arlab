package de.arlab

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/**
 * Tests the main object
 */
class MeinTest extends FunSuite with ShouldMatchers {
  test("helloWorld should return 'Hello World'") {
    Main.helloWorld should be ("Hello World")
  }

  test("test some basic things") {
    val list = List(1,2,3,4)
    list should have size (4)
    list.isEmpty should be (false)
    list(3) should be (4)
  }
}
