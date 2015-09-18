package io.jmnunezizu.scalafortheimpatient.chapter05

import scala.beans.BeanProperty

object Exercise05 extends App {

  class Student(@BeanProperty var id: Long, @BeanProperty var name: String)

  val s = new Student(5, "John")

  println(s.name + " has an id of " + s.id + " (scala getter)")
  println(s.getName + " has an id of " + s.getId + " (bean property)")

  s.id = 10
  println("setting id with scala setter " + s.id)
  s.setId(20)
  println("setting id with JavaBean property setter " + s.id)

  s.name = "Paul"
  println("setting name with scala setter " + s.name)
  s.setName("George")
  println("setting name with JavaBean property setter " + s.name)

}
