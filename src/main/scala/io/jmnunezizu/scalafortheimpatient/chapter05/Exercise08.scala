package io.jmnunezizu.scalafortheimpatient.chapter05

object Exercise08 extends App {

  class Car(val manufacturer: String, val modelName: String, val modelYear: Int = -1, var licencePlate: String = "") {
    override def toString = s"Car(manufacturer=$manufacturer,modelName=$modelName,modelYear=$modelYear,licencePlate=$licencePlate)"
  }

  val c1 = new Car("Ford", "Falcon")
  val c2 = new Car("Ford", "Falcon", 1977)
  val c3 = new Car("Ford", "Falcon", 1977, "AQC 840")
  val c4 = new Car("Ford", "Falcon", licencePlate = "AQC 840")

  for (car <- Seq(c1, c2, c3, c4)) println(car)

}
