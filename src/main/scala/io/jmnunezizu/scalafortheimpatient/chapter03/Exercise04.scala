package io.jmnunezizu.scalafortheimpatient.chapter03

/**
 * Chapter 3 - Exercise 4.
 *
 * Given an array of integers, produce a new array that contains all positive
 * values of the original array, in their original order, followed by all values
 * that are zero or negative, in their original order.
 */
object Exercise04 extends App {

  def reorder(a: Array[Int]): Array[Int] = {
    val positive = a.filter(_ > 0)
    val negativeAndZero = a.filter(_ <= 0)
    positive ++ negativeAndZero
  }

  assert(reorder(Array(2, -1, 3, 0, -5, -7, 8)).deep == Array(2, 3, 8, -1, 0, -5, -7).deep)

}
