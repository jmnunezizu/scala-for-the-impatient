package io.jmnunezizu.scalafortheimpatient.chapter02

object Exercise07 extends App {

  assert("Hello".map(_.toLong).product == 9415087488L)
  assert("Hello".map(_.toLong).reduce((result, c) => result * c) == 9415087488L)

}
