package io.jmnunezizu.scalafortheimpatient.chapter14

/**
 * Chapter 14 - Exercise 9.
 *
 * Write a function that computes the sum of the non-None values in a
 * List[Option[Int]]. Don't use a match statement.
 */
object Exercise09 extends App {

  def f1(l: List[Option[Int]]): Int = l.flatMap(x => x).sum
  def f2(l: List[Option[Int]]): Int = l.flatten.sum
  def f3(l: List[Option[Int]]): Int = (for (Some(n) <- l) yield n).sum

  val l = List(None, Some(5), Some(6), None, None)

  assert(f1(l) == 11)
  assert(f2(l) == 11)
  assert(f3(l) == 11)

}
