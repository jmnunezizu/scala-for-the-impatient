package io.jmnunezizu.scalafortheimpatient.chapter05

object Exercise10 extends App {

  class Employee(val name: String = "John Lennon", var salary: Double = 0.0) {
    override def toString = s"Employee(name=$name,salary=$salary)"
  }

  val e1 = new Employee()
  val e2 = new Employee("Paul McCartney")
  val e3 = new Employee(salary = 10.0)

  for (employee <- Seq(e1, e2, e3)) println(employee)

}
