package io.jmnunezizu.scalafortheimpatient.chapter06

object Exercise04 extends App {

  class Point(val x: Int, val y: Int) {
    override def toString = s"Point(x=$x,y=$y)"
  }

  object Point {
    def apply(x: Int, y: Int) = new Point(x, y)
  }

  println(Point(3, 4))
}
