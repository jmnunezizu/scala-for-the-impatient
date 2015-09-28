package io.jmnunezizu.scalafortheimpatient.chapter17

/**
 * Chapter 17 - Exercise 10.
 *
 * Given a mutable Pair[S, T] class, use a type constraint to define a swap
 * method that can be called if the type parameters are the same.
 */
object Exercise10 extends App {

  class Pair[S, T](var a: S, var b: T) {
    def swap(implicit ev1: S =:= T, ev2: T =:= S) = {
      val temp = a
      a = b
      b = temp
    }

    override def toString(): String = s"($a,$b)"
  }

  //(new Pair(1, "hello")).swap // won't compile

  val p = new Pair(1, 4)
  assert(p.toString() == "(1,4)")
  p.swap
  assert(p.toString() == "(4,1)")

}
