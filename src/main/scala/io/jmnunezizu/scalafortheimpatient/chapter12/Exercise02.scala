package io.jmnunezizu.scalafortheimpatient.chapter12

/**
 * Chapter 12 - Exercise 2.
 *
 * How do you get the largest element of an array with {@code reduceLeft}?
 */
object Exercise02 extends App {

  def largest(elements: Array[Int]) = elements.reduceLeft((a, b) => if (a > b) a else b)

  assert(largest(Array(3, 6, 4, 7, 0)) == 7)

}
