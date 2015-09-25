package io.jmnunezizu.scalafortheimpatient.chapter13

/**
 * Chapter 13 - Exercise 2.
 *
 * Repeat the preceding exercise, using an immutable map of characters to lists.
 */
object Exercise02 extends App {

  def indexes(s: String): Map[Char, Seq[Int]] = s.indices.groupBy(s(_))

  val expected = Map('M' -> Seq(0), 's' -> Seq(2, 3, 5, 6), 'p' -> Seq(8, 9), 'i' -> Seq(1, 4, 7, 10))
  assert(indexes("Mississippi") == expected)

}
