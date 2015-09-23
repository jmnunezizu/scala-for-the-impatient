package io.jmnunezizu.scalafortheimpatient.chapter10

/**
 * Chapter 10 - Exercise 4.
 *
 * Provide a {@code CryptoLogger} class that encrypts the log messages with the
 * Caesar cipher. The key should be 3 by default, but it should be overridable
 * by the user. Provide usage examples with the default key and a key of -3.
 */
object Exercise04 extends App {

  trait Logger {
    def log(msg: String) {}
  }

  trait CaesarCipher {
    private val alphaU = 'A' to 'Z'
    private val alphaL = 'a' to 'z'

    def encode(text: String, key: Int) = text.map {
      case c if alphaU.contains(c) => rotate(alphaU, c, key)
      case c if alphaL.contains(c) => rotate(alphaL, c, key)
      case c => c
    }

    def decode(text: String, key: Int) = encode(text, -key)

    private def rotate(a: IndexedSeq[Char], c: Char, key: Int) = a((c - a.head + key + a.size) % a.size)

  }

  trait PrinterLogger extends Logger {
    override def log(msg: String) = println(msg)
  }

  trait CryptoLogger extends Logger with CaesarCipher {
    val key = 3

    override def log(msg: String) = super.log(encode(msg, key))
  }

  class Person(val name: String) extends PrinterLogger with CryptoLogger {
    def sayHello = {
      print(s"Hi, my name is $name -> "); log(name)
    }
  }

  val p1 = new Person("John")
  p1.sayHello

  val p2 = new {
    override val key = -3
  } with Person("John")
  p2.sayHello

}
