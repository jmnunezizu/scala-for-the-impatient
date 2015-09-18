package io.jmnunezizu.scalafortheimpatient.chapter06

object Exercise02 extends App {

  abstract class UnitConversion {
    def apply(value: Double): Double
  }

  object InchesToCentimetres extends UnitConversion {
    val OneInchInCentimetres = 2.54
    def apply(value: Double): Double = value * OneInchInCentimetres
  }

  object GallonsToLitres extends UnitConversion {
    val OneGalloInLitres = 3.78541
    def apply(value: Double): Double = value * OneGalloInLitres
  }

  object MilesToKilometres extends UnitConversion {
    val OneMileInKilometres = 1.609344
    def apply(value: Double): Double = value * OneMileInKilometres
  }

  println("5 inches = " + InchesToCentimetres(5) + " centimetres")
  println("3 gallons = " + GallonsToLitres(3) + " litres")
  println("10 miles = " + MilesToKilometres(5) + " kilometres")

}
