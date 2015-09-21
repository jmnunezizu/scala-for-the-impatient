package io.jmnunezizu.scalafortheimpatient.chapter03

object Exercise02 extends App {

  def swap(a: Array[Int]): Array[Int] = {
    for (i <- 0 to (a.length - 1, 2)) {
      try {
        val x = a(i)
        a(i) = a(i + 1)
        a(i + 1) = x
      } catch {
        case e: ArrayIndexOutOfBoundsException => ()
      }
    }
    a
  }

  assert(swap(Array(1, 2, 3, 4, 5)).deep == Array(2, 1, 4, 3, 5).deep)

}
