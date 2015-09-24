package io.jmnunezizu.scalafortheimpatient.chapter12

/**
 * Chapter 12 - Exercise 6.
 */
object Exercise06 extends App {

  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int =
    inputs.reduceLeft((a, b) => if (fun(a) > fun(b)) a else b)

  assert(largest(x => 10 * x - x * x, 1 to 10) == 5)

}
