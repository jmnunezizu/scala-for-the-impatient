package io.jmnunezizu.scalafortheimpatient.chapter13

/**
 * Chapter 13 - Exercise 8.
 *
 * Write a function that turns an array of Double values into a two-dimensional
 * array. Pass the number of columns as a parameter. For example, with
 * Array(1, 2, 3, 4, 5, 6) and three columns, return Array(Array(1, 2, 3), Array(4, 5, 6)).
 * Use the grouped method.
 */
object Exercise08 extends App {

  def f(l: Array[Double], cols: Int): Array[Array[Double]] = l.grouped(cols).toArray

  assert(f(Array(1, 2, 3, 4, 5, 6), 3).deep == Array(Array(1d, 2d, 3d), Array(4d, 5d, 6d)).deep)

}
