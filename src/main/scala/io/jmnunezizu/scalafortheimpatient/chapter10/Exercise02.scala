package io.jmnunezizu.scalafortheimpatient.chapter10

import java.awt.Point

/**
 * Define a class {@code OrderedPoint} by mixing {@code scala.math.Ordered[Point]}
 * into {@code java.awt.Point}. Use lexicographic ordering, i.e.
 * {@code (x, y) < (x', y') if x < x' or x = x' and y < y'}.
 */
object Exercise02 extends App {

  class OrderedPoint(x: Int, y: Int) extends java.awt.Point(x, y) with scala.math.Ordered[Point] {

    override def compare(that: Point): Int = {
      if ((x < that.x) || (x == that.x && y < that.y)) {
        -1
      } else if (x == that.x && y == that.y) {
        0
      } else {
        1
      }
    }
  }

  val op1 = new OrderedPoint(10, 5)
  val op2 = new OrderedPoint(10, 5)
  assert(op1 == op2)

  val op3 = new OrderedPoint(10, 0)
  val op4 = new OrderedPoint(10, 5)
  assert(op3 < op4)

  val op5 = new OrderedPoint(10, 5)
  val op6 = new OrderedPoint(10, 0)
  assert(op5 > op6)

}
