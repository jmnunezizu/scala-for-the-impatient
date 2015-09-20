package io.jmnunezizu.scalafortheimpatient.chapter02

object Exercise08 extends App {

  def product(s: String): Long = {
    s.map(_.toLong).product
  }

  assert(product("Hello") == 9415087488L)

}
