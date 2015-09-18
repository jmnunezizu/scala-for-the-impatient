package io.jmnunezizu.scalafortheimpatient.chapter06

object Exercise08 extends App {

  object RgbColorCube extends Enumeration {
    val Red = Value(0xff0000, "Red")
    val Green = Value(0x00ff00, "Green")
    val Blue = Value(0x0000ff, "Blue")
    val RedGreen = Value(0xffff00, "RedGreen")
    val RedBlue = Value(0xff00ff, "RedBlue")
    val GreenBlue = Value(0x00ffff, "GreenBlue")
    val Black = Value(0x000000, "Black")
    val White = Value(0xffffff, "White")
  }

  for (rgb <- RgbColorCube.values) {
    println(s"$rgb (${rgb.id})")
  }

}
