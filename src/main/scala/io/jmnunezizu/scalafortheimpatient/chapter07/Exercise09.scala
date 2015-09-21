package io.jmnunezizu.scalafortheimpatient.chapter07

/**
 * Chapter 7 - Exercise 9.
 *
 * Write a program that imports the {@code java.lang.System} class, reads
 * the user name from the {@code user.name} system property, reads the password
 * from the {@code Console} object, and prints a message to the standard error
 * stream if the password is not "secret". Otherwise, print a greeting to the
 * standard output stream. Do not use any other imports, and do not use any
 * qualified names (with dots).
 */
object Exercise09 extends App {

  import java.lang.System

  val name = System.getProperty("user.name")
  print("Please enter your password: ")
  val password = System.console().readPassword()
  if (password.deep != "secret".toCharArray.deep) {
    System.err.println("Invalid password")
  } else {
    println(s"Greetings $name")
  }

}
