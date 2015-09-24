package io.jmnunezizu.scalafortheimpatient.chapter12

/**
 * Chapter 12 - Exercise 9.
 *
 * Implement {@code corresponds} without currying. Then try the call from the
 * preceding exercise. What problem do you encounter?
 */
object Exercise09 extends App {

  def corresponds(a: Array[String], b: Array[Int], fn: (String, Int) => Boolean) = {
    a.zip(b).map(t => fn(t._1, t._2)).reduce(_ & _)
  }

  def checkLength(s: String, len: Int) = s.length == len

  val a = Array("Here", "are", "the", "Beatles")
  val b = Array(4, 3, 3, 7)

  assert(corresponds(a, b, checkLength) == true)

  val c = Array("Sugar", "plum", "fairy")
  val d = Array(1, 2, 3)

  assert(corresponds(c, d, checkLength) == false)

}
