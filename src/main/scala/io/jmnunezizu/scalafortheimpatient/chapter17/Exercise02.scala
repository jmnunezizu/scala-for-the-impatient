package io.jmnunezizu.scalafortheimpatient.chapter17

/**
 * Chapter 17 - Exercise 2.
 *
 * Define a mutable class Pair[T] with a method swap that swaps the components
 * of the pair.
 */
object Exercise02 extends App {

  class Pair[T](val a: T, val b: T) {
    def swap(): Pair[T] = new Pair(b, a)
      override def toString(): String = s"($a,$b)"
  }

  val p1: Pair[Int] = new Pair(29, 92)
  val p2 = p1.swap()

  assert(p1.toString == "(29,92)")
  assert(p2.toString == "(92,29)")

}
