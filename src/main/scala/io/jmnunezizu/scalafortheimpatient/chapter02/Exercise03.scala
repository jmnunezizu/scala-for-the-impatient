package io.jmnunezizu.scalafortheimpatient.chapter02

/**
 * Chapter 2 – Exercise 3.
 *
 * Come up with one situation where the assignment x = y = 1 is valid in Scala.
 * (Hint: Pick a suitable type for x .)
 */
object Exercise03 extends App {

  var y: Int = 0
  val x: Unit = y = 1

}
