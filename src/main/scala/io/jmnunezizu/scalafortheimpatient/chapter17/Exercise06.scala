package io.jmnunezizu.scalafortheimpatient.chapter17

/**
 * Chapter 17 - Exercise 06.
 *
 * Write a generic method middle that returns the middle element from any
 * Iterable[T]. For example, middle("World") is 'r'.
 */
object Exercise06 extends App {

  def middle[T](it: Iterable[T]): T = {
    val l = it.toList
    l(l.size / 2)
  }

  assert(middle("World") == 'r')

}
