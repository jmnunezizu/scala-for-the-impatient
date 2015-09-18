package io.jmnunezizu.scalafortheimpatient.chapter05

object Exercise01 extends App {

  class Counter(private var value: BigInt = BigInt(0)) {
    def increment(): Unit = value += 1
    def current = value
  }

  val myCounter = new Counter(Int.MaxValue)
  println(myCounter)
  myCounter.increment()
  println(myCounter)

}
