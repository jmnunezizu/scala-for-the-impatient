package io.jmnunezizu.scalafortheimpatient.chapter11

/**
 * Chapter 11 - Exercise 6.
 */
object Exercise06 extends App {

  class ASCIIArt(val s: String) {
    private val lines = for (line <- s.split("\n")) yield line

    def +-(a: ASCIIArt): ASCIIArt =
      ASCIIArt((lines.zip(a.lines) map { case (a, b) => a + b }).mkString("\n"))

    def +|(a: ASCIIArt): ASCIIArt = ASCIIArt(s + a.s)

    override def toString(): String = s

  }

  object ASCIIArt {
    def apply(s: String) = new ASCIIArt(s)
  }

  val a1 = ASCIIArt(
    """
       |  /\_/\
       | ( ' ' )
       | (  -  )
       |  | | |
       | (__|__)
     """.stripMargin)

  val a2 = ASCIIArt(
    """
       |    -----
       |  / Hello \
       | <  Scala |
       |  \ Coder /
       |    -----
     """.stripMargin
  )

  println("Combine horizontally: ")
  println(a1 +- a2)

  println("Combine vertically:")
  println(a1 +| a2)

}
