package io.jmnunezizu.scalafortheimpatient.chapter06


object Exercise01 extends App {

  object Conversions {
    val OneInchInCentimetres = 2.54
    val OneGalloInLitres = 3.78541
    val OneMileInKilometres = 1.609344

    def inchesToCentimetres(inches: Double): Double = inches * OneInchInCentimetres
    def gallonsToLitres(gallons: Double): Double = gallons * OneGalloInLitres
    def milesToKilometres(miles: Double): Double = miles * OneMileInKilometres
  }

  println("5 inches = " + Conversions.inchesToCentimetres(5) + " centimetres")
  println("3 gallons = " + Conversions.gallonsToLitres(3) + " litres")
  println("10 miles = " + Conversions.milesToKilometres(5) + " kilometres")

}
