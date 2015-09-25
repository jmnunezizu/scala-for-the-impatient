package io.jmnunezizu.scalafortheimpatient.chapter13

/**
 * Chapter 13 - Exercise 6.
 *
 * Given a list of integers lst, what is (lst :\ List[Int]())(_ :: _)?
 * (List[Int]() /: lst)(_ :+ _)? How can you modify one of them to reverse the list?
 */
object Exercise06 extends App {

  val lst: List[Int] = List(1, 2, 3, 4, 5)

  val x = (lst :\ List[Int]())(_ :: _) // foldRight, creates a new list with all values
  println(x)

  val y = (List[Int]() /: lst)(_ :+ _) // foldLeft, creates a new list with all values
  println(y)

  val z = (List[Int]() /: lst)((i, l) => l +: i)
  println(z)
  assert(z == lst.foldLeft(List.empty[Int])((i, l) => l +: i))

}
