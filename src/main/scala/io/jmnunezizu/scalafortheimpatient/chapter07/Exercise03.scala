package io.jmnunezizu.scalafortheimpatient.chapter07

/**
 * Chapter 7 - Execise 3.
 *
 * Write a package {@code random} with functions
 * {@code nextInt(): Int, nextDouble(): Double},
 * and {code}setSeed(seed: Int): Unit{code}. To generate random numbers, use
 * the linear congruential generator:
 *
 * <pre>
 * {@code
 * next = previous x a + b mod 2^n
 * }
 * </pre>
 *
 * where a = 1664525, b = 1013904223, and n = 32.
 */
object Exercise03 extends App {

  println("Next Int: " + random.nextInt())
  println("Next Double: " + random.nextDouble())

}

package object random {
  private var previous: Int = 0
  val a = 1664525
  val b = 1013904223
  val n = 32

  def nextInt(): Int = {
    previous = (previous * a + b) % scala.math.pow(2, n).toInt
    previous
  }

  def nextDouble(): Double = nextInt.toDouble

  def setSeed(seed: Int): Unit = previous = seed
}
