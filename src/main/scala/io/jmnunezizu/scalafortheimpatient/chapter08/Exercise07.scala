package io.jmnunezizu.scalafortheimpatient.chapter08

/**
 * Chapter 8 - Exercise 7.
 *
 * Provide a class {@code Square} that extends {@code java.awt.Rectangle} and
 * has three constructors: one that constructs a square with a given corner
 * point and width, one that constructs a square with corner (0, 0) and a given
 * width, and one that constructs a square with corner (0, 0) and width 0.
 */
object Exercise07 extends App {

  class Square(corner: (Int, Int) = (0, 0), width: Int = 0) extends java.awt.Rectangle(corner._1, corner._2, width, width) {
    def this(width: Int) = this((0, 0), width)
  }

  val s1 = new Square()
  assert(s1.x == 0)
  assert(s1.y == 0)
  assert(s1.width == 0)
  assert(s1.height == 0)

  val s2 = new Square((10, 20))
  assert(s2.x == 10)
  assert(s2.y == 20)
  assert(s2.width == 0)
  assert(s2.height == 0)

  val s3 = new Square(50)
  assert(s3.x == 0)
  assert(s3.y == 0)
  assert(s3.width == 50)
  assert(s3.height == 50)

  val s4 = new Square((10, 20), 50)
  assert(s4.x == 10)
  assert(s4.y == 20)
  assert(s4.width == 50)
  assert(s4.height == 50)

}
