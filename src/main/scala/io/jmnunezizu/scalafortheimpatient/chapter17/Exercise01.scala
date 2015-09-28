package io.jmnunezizu.scalafortheimpatient.chapter17

/**
 * Chapter 17 - Exercise 1.
 *
 * Define an immutable Pair[T, S] with a method swap that returns a new pair
 * with the components swapped.
 */
object Exercise01 extends App {

  class Pair[T, S](val a: T, val b: S) {
    def swap(): Pair[S, T] = new Pair(b, a)
    override def toString(): String = s"a=$a,b=$b"
  }

  val p1: Pair[Int, String] = new Pair(9, "John")
  val p2 = p1.swap()
  assert(p1.toString == "a=9,b=John")
  assert(p2.toString == "a=John,b=9")

}
