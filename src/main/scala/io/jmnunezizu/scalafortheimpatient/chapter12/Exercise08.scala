package io.jmnunezizu.scalafortheimpatient.chapter12

/**
 * Chapter 12 - Exercise 8.
 */
object Exercise08 extends App {

  def checkLength(s: String, len: Int) = s.length == len

  val a = Array("Here", "are", "the", "Beatles")
  val b = Array(4, 3, 3, 7)

  assert(a.corresponds(b)(checkLength(_, _)) == true)

  val c = Array("Sugar", "plum", "fairy")
  val d = Array(1, 2, 3)

  assert(c.corresponds(d)(checkLength(_, _)) == false)

}
