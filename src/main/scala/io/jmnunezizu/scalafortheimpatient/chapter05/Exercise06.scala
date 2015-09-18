package io.jmnunezizu.scalafortheimpatient.chapter05

object Exercise06 extends App {

  class Person(theAge: Int) {
    val age = if (theAge < 0) 0 else theAge
  }

  val p1 = new Person(20)
  println("Created a person with " + p1.age + " years old")
  val p2 = new Person(-20)
  println("Created a person with -20 years old, but was converted to " + p2.age + " years old")

}
