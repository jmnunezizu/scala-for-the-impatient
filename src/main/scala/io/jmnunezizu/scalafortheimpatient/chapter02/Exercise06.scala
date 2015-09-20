package io.jmnunezizu.scalafortheimpatient.chapter02

object Exercise06 extends App {

  var result: Long = 1
  for (c <- "Hello")
    result *= c.toLong

  assert(result == 9415087488L)

}
