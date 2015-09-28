package io.jmnunezizu.scalafortheimpatient.chapter17

/**
 * Chapter 17 - Exercise 3.
 *
 * Given a class Pair[T, S], write a generic method swap that takes a pair as
 * its argument and returns a new pair with the components swapped.
 */
object Exercise03 extends App {

  class Pair[T, S](val a: T, val b: S) {
    override def toString(): String = s"($a,$b)"
  }

  def swap[T, S](p: Pair[T, S]): Pair[S, T] = new Pair(p.b, p.a)

  val p1: Pair[Int, String] = new Pair(9, "John")
  val p2: Pair[String, Int] = swap(p1)

  assert(p1.toString() == "(9,John)")
  assert(p2.toString() == "(John,9)")

}
