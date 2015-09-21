package io.jmnunezizu.scalafortheimpatient.chapter03

object Exercise03 extends App {

  def swap(a: Array[Int]): Array[Int] = {
    (for {
      i <- 0 until a.length
    } yield {
        if (i % 2 == 0 && (i + 1) == a.length) {
          a(i)
        } else if (i % 2 == 0) {
          a(i + 1)
        } else {
          a(i - 1)
        }
    }).toArray
  }

  assert(swap(Array(1, 2, 3, 4, 5)).deep == Array(2, 1, 4, 3, 5).deep)

}
