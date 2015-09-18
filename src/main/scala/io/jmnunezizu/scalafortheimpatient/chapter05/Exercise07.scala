package io.jmnunezizu.scalafortheimpatient.chapter05

object Exercise07 extends App {

  class Person2(fullName: String) {
    private val nameParts: Array[String]= fullName.split(" ")
    val firstName = nameParts(0)
    val lastName = nameParts(1)
  }

  val p = new Person2("John Lennon")
  println(s"Created a person with name ${p.firstName} and surname ${p.lastName}")

}
