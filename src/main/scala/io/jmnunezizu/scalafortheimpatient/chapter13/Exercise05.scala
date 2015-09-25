package io.jmnunezizu.scalafortheimpatient.chapter13

/**
 * Chapter 13 - Exercise 5.
 *
 * Implement a function that works just like mkString, using reduceLeft.
 */
object Exercise05 extends App {

  def mkString(s: Array[String], sep: String = ""): String = s.reduceLeft(_ + sep + _)

  assert(mkString(Array("Hello", "World")) == "HelloWorld")
  assert(mkString(Array("Hello", "World"), " ") == "Hello World")

}
