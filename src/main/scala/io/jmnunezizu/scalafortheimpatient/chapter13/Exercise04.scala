package io.jmnunezizu.scalafortheimpatient.chapter13

/**
 * Chapter 13 - Exercise 4.
 *
 * Write a function that receives a collection of strings and a map from strings
 * to integers. Return a collection of integers that are values of the map
 * corresponding to one of the strings in the collection. For example, given
 * Array("Tom", "Fred", "Harry") and Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5),
 * return Array(3, 5). Hint: Use flatMap to combine the Option values returned by get.
 */
object Exercise04 extends App {

  def f(words: Array[String], m: Map[String, Int]): Array[Int] = {
    for {
      word <- words
      n <- m.get(word)
    } yield n
  }

  def f2(words: Array[String], m: Map[String, Int]): Array[Int] = words.flatMap(m.get(_))

  assert(f(Array("Tom", "Fred", "Harry"), Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)).deep == Array(3, 5).deep)
  assert(f2(Array("Tom", "Fred", "Harry"), Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)).deep == Array(3, 5).deep)


}
