package io.jmnunezizu.scalafortheimpatient.chapter12

/**
 * Chapter 12 - Exercise 1.
 *
 * Write a function {@code values(fun: (Int) => Int, low: Int, high: Int)} that
 * yields a collection of function inputs and outputs in a given range. For example
 * {@code values(x => x * x, -5, 5)} should produce a collection of pairs
 * {@code (-5, 25), (-4, 16), (-3, 9), ..., (5, 25)}.
 */
object Exercise01 extends App {

  def values(fun: (Int) => Int, low: Int, high: Int) = (low to high).map(i => (i, fun(i)))

  val actual = values(x => x * x, -5, 5)
  val expected = Seq((-5, 25), (-4, 16), (-3, 9), (-2, 4), (-1, 1), (0, 0), (1, 1), (2, 4), (3, 9), (4, 16), (5, 25))
  assert(expected == actual)

}
