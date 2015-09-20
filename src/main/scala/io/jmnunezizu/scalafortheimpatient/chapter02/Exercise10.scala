package io.jmnunezizu.scalafortheimpatient.chapter02

import scala.math.pow

object Exercise10 extends App {

  def compute(x: Double, n: Int): Double = {
    if (n > 0 && n % 2 == 0) {
      pow(pow(x, n / 2), 2)
    }  else if (n > 0 && n % 2 != 0) {
      x * pow(x, n - 1)
    } else if (n < 0) {
      1 / pow(x, -n)
    } else {
      1
    }
  }

  assert(compute(2, 0) == 1)
  assert(compute(2, 2) == 4)
  assert(compute(2, 3) == 8)
  assert(compute(2, -3) == .125)

}
