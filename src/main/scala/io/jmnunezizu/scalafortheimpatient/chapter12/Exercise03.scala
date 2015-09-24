package io.jmnunezizu.scalafortheimpatient.chapter12

/**
 * Chapter 12 - Exercise 3.
 *
 * Implement the factorial function using {@code to} and {@code reduceLeft},
 * without a loop or recursion.
 */
object Exercise03 extends App {

  def fact(n: Int) = if (n > 0) (1 to n).reduceLeft(_ * _) else 1

  assert(120 == fact(5))
  assert(1 == fact(0))

}
