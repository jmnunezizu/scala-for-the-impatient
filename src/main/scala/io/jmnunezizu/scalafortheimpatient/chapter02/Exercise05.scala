package io.jmnunezizu.scalafortheimpatient.chapter02

object Exercise05 extends App {

  def countdown(n: Int) {
    for (i <- n to 0 by -1)
      println(i)
  }

  println(s"countdown for 5")
  countdown(5)

}
