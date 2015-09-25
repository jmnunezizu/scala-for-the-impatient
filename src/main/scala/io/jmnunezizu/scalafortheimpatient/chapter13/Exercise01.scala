package io.jmnunezizu.scalafortheimpatient.chapter13

import scala.collection.mutable.Map
import scala.collection.mutable.Set

/**
 * Chapter 13 - Exercise 1.
 *
 * Write a function that, given a string, produces a map of the indexes of all
 * characters. For example, indexes("Mississippi") should return a map associating
 * 'M' with the set {0}, 'i' with the set {1, 4, 7, 10}, and so on.
 *
 * Use a mutable map of characters to mutable sets. How can you ensure that the
 * set is sorted?
 */
object Exercise01 extends App {

  def indexes(s: String): Map[Char, Set[Int]] = {
    val result = Map.empty[Char, Set[Int]]
    for ((c, i) <- s.zipWithIndex) {
      result.contains(c) match {
        case true => result.put(c, result.get(c).get ++ Set(i))
        case false => result.put(c, Set(i))
      }
    }
    result
  }

  def indexes2(s: String): Map[Char, Set[Int]] = {
    s.indices.foldLeft(Map.empty[Char, Set[Int]]) { (res, i) =>
      res += (s(i) -> (res.getOrElse(s(i), Set.empty[Int]) += i))
    }
  }

  val expected = Map('M' -> Set(0), 's' -> Set(2, 3, 5, 6), 'p' -> Set(8, 9), 'i' -> Set(1, 4, 7, 10))

  assert(indexes("Mississippi") == expected)
  assert(indexes2("Mississippi") == expected)

}
