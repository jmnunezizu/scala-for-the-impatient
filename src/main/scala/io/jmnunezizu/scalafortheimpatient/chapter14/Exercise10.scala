package io.jmnunezizu.scalafortheimpatient.chapter14

/**
 * Chapter 14 - Exercise 10.
 *
 * Write a function that composes two functions of type Double => Option[Double],
 * yielding another function of the same type. The composition should yield
 * None if either function does. For example,
 *
 * def f(x: Double) = if (x >= 0) Some(sqrt(Double)) else None
 * def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None
 * def h = compose(f, g)
 *
 * Then h(2) is Some(1), and h(1) and h(0) are None.
 */
object Exercise10 extends App {

  import scala.math.sqrt

  def f(x: Double) = if (x >= 0) Some(sqrt(x)) else None
  def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None

  def compose(f: (Double) => Option[Double], g: (Double) => Option[Double]): (Double) => Option[Double] = {
    (x: Double) => g(x) match {
      case Some(gx) => f(gx)
      case None => None
    }
  }

  def h = compose(f, g)

  assert(h(2) == Some(1d))
  assert(h(1) == None)
  assert(h(0) == None)

}
