package io.jmnunezizu.scalafortheimpatient.chapter11

/**
 * Chapter 11 - Exercise 7.
 */
object Exercise07 extends App {

  class BitSequence(s: String) {
    private var bits = java.lang.Long.parseLong(s, 2)

    def update(index: Int, bitValue: Boolean) = {
      bits = bitValue match {
        case true => bits | (1 << index)
        case false => bits ^ (1 << index)
      }
    }

    override def toString(): String = bits.toString
  }

  object BitSequence {
    def apply(s: String) = new BitSequence(s)
  }

  val b = BitSequence("0101010101010101010101010101010101010101010101010101010101010101")
  println(b.toString)
  assert(b.toString == "6148914691236517205")

  b(0) = false
  assert(b.toString == "6148914691236517204")

  b(0) = true
  assert(b.toString == "6148914691236517205")

}
