package io.jmnunezizu.scalafortheimpatient.chapter06

object Exercise05 extends App {
  for (word <- args.reverse) {
    print(word + " ")
  }
  println
}
