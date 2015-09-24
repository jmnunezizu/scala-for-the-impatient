package io.jmnunezizu.scalafortheimpatient.chapter12

/**
 * Chapter 12 - Exercise 3.
 *
 * Implement the factorial function using {@code to} and {@code reduceLeft},
 * without a loop or recursion.
 */
object Exercise03 extends App {

  def fact(n: Int) = (1 to n).reduceLeft(_ * _)

  assert(120 == fact(5))

}
