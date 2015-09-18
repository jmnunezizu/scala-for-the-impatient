package io.jmnunezizu.scalafortheimpatient.chapter5

import scala.beans.BeanProperty

// exercise 1
class Counter(private var value: BigInt = BigInt(0)) {
  def increment(): Unit = value += 1
  def current = value
}

// exercise 2
class BankAccount(private var balanceValue: Int = 0) {
  def deposit(amount: Int) = balanceValue += amount
  def withdraw(amount: Int) = balanceValue -= amount
  def balance = balanceValue
}

// exercise 3
class Time(val hours: Int, val minutes: Int) {
  private val minutesSinceMidnight = (hours * minutes) - 1

  def before(other: Time): Boolean = {
    (hours < other.hours) || (hours == other.hours && minutes < other.minutes)
  }
}

// exercise 4
class Time2(val hours: Int, val minutes: Int) {
  private val minutesSinceMidnight: Int = hours * 60 + minutes

  def before(other: Time2): Boolean = {
    minutesSinceMidnight < other.minutesSinceMidnight
  }
}

// exercise 5
class Student(@BeanProperty var id: Long, @BeanProperty var name: String)

// exercise 6
class Person(theAge: Int) {
  val age = if (theAge < 0) 0 else theAge
}

// exercise 7
class Person2(fullName: String) {
  private val nameParts: Array[String]= fullName.split(" ")
  val firstName = nameParts(0)
  val lastName = nameParts(1)
}

// exercise 8
class Car(val manufacturer: String, val modelName: String, val modelYear: Int = -1, var licencePlate: String = "")

// exercise 9 - not needed

// exercise 10
class Employee(val name: String = "John Lennon", var salary: Double = 0.0)