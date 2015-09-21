package io.jmnunezizu.scalafortheimpatient.chapter07

/**
 * Chapter 7 - Exercise 1.
 *
 * Write an example program to demonstrate that
 *
 * {code}
 * package com.horstmann.impatient
 * {code}
 *
 * is not the same as
 *
 * {code}
 * package com
 * package horstmann
 * package impatient
 * {code}
 */
object Exercise01 extends App {

}

package com.horstmann {
  object Cay {
    val name: String = "Cay Horstmann"
  }
}

package com {
  package horstmann {
    package impatient {
      class A {
        println(Cay.name) // Cay can be accessed
      }
    }
  }
}

package com.horstmann.impatient {

  import com.horstmann.Cay

  class B {
    println(Cay.name) // Cay can be accessed by importing the class
  }
}
