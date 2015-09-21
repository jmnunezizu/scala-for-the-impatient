package io.jmnunezizu.scalafortheimpatient.chapter07 {

  object Exercise02 {
    val x = 1
  }

  package io.jmnunezizu.scalafortheimpatient.chapter07 {
    /**
     * Chapter 7 - Exercise 2.
     *
     * Write a puzzler that baffles your Scala friends, using a package com that
     * isn't at the top level.
     */
    object Exercise02 extends App {
      val x = 1
      assert(
        _root_.io.jmnunezizu.scalafortheimpatient.chapter07.Exercise02.x ==
        io.jmnunezizu.scalafortheimpatient.chapter07.Exercise02.x
      )
    }

  }
}
