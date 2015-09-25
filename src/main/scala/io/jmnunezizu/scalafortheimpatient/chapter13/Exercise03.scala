package io.jmnunezizu.scalafortheimpatient.chapter13

import scala.collection.mutable.LinkedList

/**
 * Chapter 13 - Exercise 3.
 *
 * Write a function that removes all zeroes from a linked list of integers.
 */
object Exercise03 extends App {

  def removeZeroes(l: LinkedList[Int]): LinkedList[Int] = for (n <- l if n != 0) yield n
  def removeZeroes(l: List[Int]): List[Int] = l.filter(_ != 0)

  assert(removeZeroes(LinkedList(1, 2, 0, 5, 0, 4, 0)) == LinkedList(1, 2, 5, 4))
  assert(removeZeroes(List(1, 2, 0, 5, 0, 4, 0)) == List(1, 2, 5, 4))

}
