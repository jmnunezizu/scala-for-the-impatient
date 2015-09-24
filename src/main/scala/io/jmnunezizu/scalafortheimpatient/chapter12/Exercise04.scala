package io.jmnunezizu.scalafortheimpatient.chapter12

/**
 * Chapter 12 - Exercise 4.
 *
 * The previous implementation needed a special case when {@code n < 1}. Show
 * how you can avoid this with {@code foldLeft}. (Look at the Scaladoc for
 * {@code foldLeft}. It's like {@code reduceLeft}, except that the first value
 * in the chain of combined values is supplied in the call.)
 */
object Exercise04 extends App {

  def fact(n: Int) = (1 to n).foldLeft(1)(_ * _)

  assert(120 == fact(5))
  assert(1 == fact(0))

}
