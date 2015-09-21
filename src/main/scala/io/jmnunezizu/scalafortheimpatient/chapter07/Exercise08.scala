package io.jmnunezizu.scalafortheimpatient.chapter07

/**
 * Chapter 7 - Exercise 8.
 *
 * What is the effect of
 *
 * <pre>
 * {@code
 * import java._
 * import javax._
 * }
 * </pre>
 */
object Exercise08 extends App {

  println(s"""
    It brings everything under java and javax into scope. It might be a better
    idea to just import the needed subpackages/classes.
    Importing everything can also lead to name clashes.
  """)

}
