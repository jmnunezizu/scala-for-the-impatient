package io.jmnunezizu.scalafortheimpatient.chapter13

/**
 * Chapter 13 - Exercise 7.
 */
object Exercise07 extends App {

  val prices = List(5.0, 20.0, 9.95)
  val quantities = List(10, 2, 1)

  def mul = ((_: Double) * (_: Int)).tupled

  assert(prices.zip(quantities).map(mul(_)) == List(50.0, 40.0, 9.95))

}
