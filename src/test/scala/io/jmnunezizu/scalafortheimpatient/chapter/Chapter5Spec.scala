package io.jmnunezizu.scalafortheimpatient.chapter

import io.jmnunezizu.scalafortheimpatient.chapter05.Exercise01.Counter
import io.jmnunezizu.scalafortheimpatient.chapter05.Exercise02.BankAccount
import io.jmnunezizu.scalafortheimpatient.chapter05.Exercise03.Time
import io.jmnunezizu.scalafortheimpatient.chapter05.Exercise04.Time2
import io.jmnunezizu.scalafortheimpatient.chapter05.Exercise05.Student
import io.jmnunezizu.scalafortheimpatient.chapter05.Exercise06.Person
import io.jmnunezizu.scalafortheimpatient.chapter05.Exercise07.Person2
import io.jmnunezizu.scalafortheimpatient.chapter05.Exercise08.Car
import io.jmnunezizu.scalafortheimpatient.chapter05.Exercise10.Employee
import org.specs2.Specification

class Chapter5Spec extends Specification {

  def is = s2"""
    Exercise 1
      counter should not return a negative number for Int.MaxValue $e1

    Exercise 2
      balance should increase when a deposit is made $e2t1
      balance should decrease when a withdrawal is made $e2t2

    Exercise 3
      before should return true if T1 is before T2 $e3t1
      before should return false if T1 is after T2 $e3t2
      before should return false if T1 and T2 are equal $e3t3

    Exercise 4
      before should return true if T1 is before T2 $e4t1
      before should return false if T1 is after T2 $e4t2
      before should return false if T1 and T2 are equal $e4t3

    Exercise 5
      should be able to call JavaBean methods $e5

    Exercise 6
      person should replace negative ages with 0 $e6

    Exercise 7
      person should contain first and last names $e7

    Exercise 8
      car should contain all properties $e8

    Exercise 10
      employee should use default values $e10
  """

  def e1 = {
    val myCounter = new Counter(Int.MaxValue)
    myCounter.increment()
    myCounter.current must be_>(BigInt(0))
  }

  def e2t1 = {
    val bankAccount = new BankAccount()
    bankAccount.deposit(100)
    bankAccount.balance must be_==(100)
  }

  def e2t2 = {
    val bankAccount = new BankAccount()
    bankAccount.deposit(100)
    bankAccount.withdraw(50)
    bankAccount.balance must be_==(50)
  }

  def e3t1 = {
    val t1 = new Time(3, 33)
    val t2 = new Time(3, 34)

    t1.before(t2) must beTrue
  }

  def e3t2 = {
    val t1 = new Time(3, 33)
    val t2 = new Time(2, 59)

    t1.before(t2) must beFalse
  }

  def e3t3 = {
    val t1 = new Time(3, 33)
    val t2 = new Time(3, 33)

    t1.before(t2) must beFalse
  }

  def e4t1 = {
    val t1 = new Time2(3, 33)
    val t2 = new Time2(3, 34)

    t1.before(t2) must beTrue
  }

  def e4t2 = {
    val t1 = new Time2(3, 33)
    val t2 = new Time2(2, 59)

    t1.before(t2) must beFalse
  }

  def e4t3 = {
    val t1 = new Time2(3, 33)
    val t2 = new Time2(3, 33)

    t1.before(t2) must beFalse
  }

  def e5 = {
    val s = new Student(5, "John")
    s.id must be_==(5)
    s.getId must be_==(5)

    s.id = 10
    s.id must be_==(10)
    s.setId(20)
    s.id must be_==(20)

    s.name must be_==("John")
    s.getName must be_==("John")

    s.name = "Paul"
    s.name must be_==("Paul")
    s.setName("George")
    s.name must be_==("George")
  }

  def e6 = {
    new Person(5).age must be_==(5)
    new Person(-5).age must be_==(0)
  }

  def e7 = {
    val p = new Person2("John Lennon")
    p.firstName must be_==("John")
    p.lastName must be_==("Lennon")
  }

  def e8 = {
    val c1 = new Car("Ford", "Falcon")
    c1.manufacturer must be_==("Ford")
    c1.modelName must be_==("Falcon")
    c1.modelYear must be_==(-1)
    c1.licencePlate must be_==("")

    val c2 = new Car("Ford", "Falcon", 1977)
    c2.manufacturer must be_==("Ford")
    c2.modelName must be_==("Falcon")
    c2.modelYear must be_==(1977)
    c2.licencePlate must be_==("")

    val c3 = new Car("Ford", "Falcon", 1977, "AQC 840")
    c3.manufacturer must be_==("Ford")
    c3.modelName must be_==("Falcon")
    c3.modelYear must be_==(1977)
    c3.licencePlate must be_==("AQC 840")

    val c4 = new Car("Ford", "Falcon", licencePlate = "AQC 840")
    c4.manufacturer must be_==("Ford")
    c4.modelName must be_==("Falcon")
    c4.modelYear must be_==(-1)
    c4.licencePlate must be_==("AQC 840")
  }

  def e10 = {
    val e1 = new Employee()
    e1.name must be_==("John Lennon")
    e1.salary must be_==(0.0)

    val e2 = new Employee("Paul McCartney")
    e2.name must be_==("Paul McCartney")
    e2.salary must be_==(0.0)

    val e3 = new Employee(salary = 10.0)
    e3.name must be_==("John Lennon")
    e3.salary must be_==(10.0)
  }

}
