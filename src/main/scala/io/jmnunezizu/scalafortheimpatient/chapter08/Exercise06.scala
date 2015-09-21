package io.jmnunezizu.scalafortheimpatient.chapter08

/**
 * Chapter 8 - Exercise 6.
 *
 * Define an abstract class {@code Shape} with an abstract method
 * {@code centerPoint} and subclasses {@code Rectangle} and {@code Circle}.
 * Provide appropriate constructors for the subclasses and override the
 * {@code centerPoint} method in each subclass.
 */
object Exercise06 extends App {

  abstract class Shape {
    def centerPoint: (Double, Double)
  }

  class Rectangle(val x: Int = 0, val y: Int = 0, val width: Int = 0, val height: Int = 0) extends Shape {
    def centerPoint: (Double, Double) = (x + width / 2, y + height / 2)
  }

  class Circle(val x: Int = 0, val y: Int = 0, val radius: Int = 0) extends Shape {
    def centerPoint: (Double, Double) = (x, y)
  }

  val r = new Rectangle(0, 0, 10, 10)
  assert(r.centerPoint == (5, 5))

  val c = new Circle(0, 0, 20)
  assert(c.centerPoint == (0, 0))

}
