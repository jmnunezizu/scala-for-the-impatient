package io.jmnunezizu.scalafortheimpatient.chapter03

import scala.util.Random

object Exercise01 extends App {

  def rand(n: Int): Array[Int] = {
    (for {
      n <- 1 to n
    } yield Random.nextInt(n)).toArray
  }

  val totalNumbers = 100
  val numbers = rand(totalNumbers)

  assert(numbers.length == totalNumbers)
  for (n <- numbers)
    assert(n < totalNumbers && n >= 0)

}
