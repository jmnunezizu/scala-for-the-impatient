package io.jmnunezizu.scalafortheimpatient.chapter12

/**
 * Chapter 12 - Exercise 5.
 */
object Exercise05 extends App {

  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = inputs.map(fun).max

  assert(largest(x => 10 * x - x * x, 1 to 10) == 25)

}
