package io.jmnunezizu.scalafortheimpatient.chapter14

/**
 * Chapter 14 - Exercise 2.
 *
 * Using pattern matching, write a function swap that receives a pair of integers
 * and returns the pair with the components swapped.
 */
object Exercise02 extends App {

  def swap(p: (Int, Int)): (Int, Int) = p match {
    case (a, b) => (b, a)
  }

  assert(swap((1, 2)) == (2, 1))

}
