package io.jmnunezizu.scalafortheimpatient.chapter10

/**
 * Chapter 10 - Exercise 1.
 *
 * The {@code java.awt.Rectangle} class has useful methods {@code translate}
 * and {@code grow} that are unfortunately absent from classes such as
 * {@code java.awt.geom.Ellipse2D}. In Scala, you can fix this problem. Define
 * a trait {@code RectangleLike} with concrete methods {@code translate} and
 * {@code grow}. Provide any abstract methods that you need for the implementation,
 * so that you can mix in the trait like this:
 *
 * <pre>
 *   val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
 *   egg.translate(10, -10)
 *   egg.grow(10, 20)
 * </pre>
 */
object Exercise01 extends App {

  trait RectangleLike { this: java.awt.geom.Ellipse2D =>
    def translate(x: Int, y: Int) = setFrame(getX + x, getY + y, getWidth, getHeight)
    def grow(w: Int, h: Int) = setFrame(getX, getY, getWidth + w, getHeight + h)
  }

  val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike

  egg.translate(10, -10)
  assert(egg.getX == 15)
  assert(egg.getY == 0)

  egg.grow(10, 20)
  assert(egg.getWidth == 30)
  assert(egg.getHeight == 50)

}
