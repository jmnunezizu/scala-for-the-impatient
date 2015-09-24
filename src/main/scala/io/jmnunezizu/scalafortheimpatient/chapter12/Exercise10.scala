package io.jmnunezizu.scalafortheimpatient.chapter12

/**
 * Chapter 12 - Exercise 10.
 *
 * Implement an {@code unless} control abstraction that works just like {@code if},
 * but with an inverted condition. Does the first parameter need to be a call-by-name
 * parameter? Do you need currying?
 */
object Exercise10 extends App {

  def unless(condition: => Boolean)(block: => Unit): Unit = {
    if (!condition) {
      block
    }
  }

  val i = 10

  unless (i == 10) {
    println(s"this should not happen because $i is 10")
    assert(true == false)
  }

  unless (i == 20) {
    println("it's all good")
  }

}
