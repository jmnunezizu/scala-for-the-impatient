package io.jmnunezizu.scalafortheimpatient.chapter07

/**
 * Chapter 7 - Exercise 1.
 *
 * Write an example program to demonstrate that
 *
 * <pre>
 * {@code
 * package com.horstmann.impatient
 * }
 * </pre>
 *
 * is not the same as
 *
 * <pre>
 * {@code
 * package com
 * package horstmann
 * package impatient
 * }
 * </pre>
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
