package io.jmnunezizu.scalafortheimpatient.chapter14

/**
 * Chapter 14 - Exercise 3.
 *
 * Using pattern matching, write a function swap that swaps the first two
 * elements of an array provided its length is at least two.
 */
object Exercise03 extends App {

  def swap(a: Array[Int]): Array[Int] = a match {
    case Array(a, b) => Array(b, a)
    case _ => a
  }

  assert(swap(Array(1, 2)).deep == Array(2, 1).deep)
  assert(swap(Array(1, 2, 3)).deep == Array(1, 2, 3).deep)
  assert(swap(Array(1)).deep == Array(1).deep)
  assert(swap(Array.empty[Int]).deep == Array.empty[Int].deep)

}
