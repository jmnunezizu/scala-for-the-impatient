package io.jmnunezizu.scalafortheimpatient.chapter12

/**
 * Chapter 12 - Exercise 7.
 */
object Exercise07 extends App {

  def adjustToPair(fun: (Int, Int) => Int) = (a: (Int, Int)) => fun(a._1, a._2)

  assert(adjustToPair(_ * _)(6, 7) == 42)
  assert(adjustToPair(_ + _)(3, 7) == 10)


}
