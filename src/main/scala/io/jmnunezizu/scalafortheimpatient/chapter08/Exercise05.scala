package io.jmnunezizu.scalafortheimpatient.chapter08

/**
 * Chapter 8 - Exercise 5.
 *
 * Design a class {@code Point} whose {@code x} and {@code y} coordinate values
 * can be provided in a constructor. Provide a subclass {@code LabeledPoint}
 * whose constructor takes a label value and x and y coordinates, such as
 *
 * <pre>
 *   {@code
 *   new LabeledPoint("Black Thursday", 1929, 230.07)
 *   }
 * </pre>
 */
object Exercise05 extends App {

  class Point(val x: Double, val y: Double)

  class LabeledPoint(val label: String, x: Double, y: Double) extends Point(x, y)

  val p = new Point(10, 20)
  assert(p.x == 10.0)
  assert(p.y == 20.0)

  val lp = new LabeledPoint("Black Thursday", 1929, 230.07d)
  assert(lp.label == "Black Thursday")
  assert(lp.x == 1929.0)
  assert(lp.y == 230.07d)

}
