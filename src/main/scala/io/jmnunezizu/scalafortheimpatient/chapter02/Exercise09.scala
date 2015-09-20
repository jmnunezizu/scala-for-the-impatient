package io.jmnunezizu.scalafortheimpatient.chapter02

object Exercise09 extends App {

  def product(s: String): Long = {
    if (s.tail != "") {
      s.head.toLong * product(s.tail)
    } else {
      s.head.toLong
    }
  }

  assert(product("Hello") == 9415087488L)

}
