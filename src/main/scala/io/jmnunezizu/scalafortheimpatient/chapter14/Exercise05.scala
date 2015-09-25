package io.jmnunezizu.scalafortheimpatient.chapter14

import scala.annotation.tailrec

/**
 * Chapter 14 - Exercise 5.
 *
 * One can use lists to model trees that store values only in the leaves.
 * For example, the list ((3 8) 2 (5)) describes the tree.
 *
 *      o
 *    / | \
 *   o  2  o
 *  / \    |
 * 3   8   5
 *
 * However, some of the list elements are numbers and others are lists. In Scala,
 * you cannot have heterogeneous lists, so you have to ue a List[Any]. Write a
 * leafSum function to compute the sum of all elements in the leaves, using
 * pattern matching to differentiate between numbers and lists.
 */
object Exercise05 extends App {

  def leafSum(t: List[Any]): Int = {
    t.foldLeft(0)((total, el) => el match {
      case n: Int => n + total
      case l: List[Any] => leafSum(l) + total
    })
  }

  def leafSum2(t: List[Any]): Int = {
    @tailrec
    def leafSumInternal(total: Int, rest: List[Any]): Int = {
      rest match {
        case (n: Int) :: Nil => n + total // last number
        case (n: Int) :: tail => leafSumInternal(total + n, tail) // first number
        case (l: List[Any]) :: tail => leafSumInternal(total, l ++ tail) // when it's a list, combine them and make a recursive call
        case _ => total // return value when there are no more elements
      }
    }

    leafSumInternal(0, t)
  }

  val tree: List[Any] = List(List(3, 8), 2, List(5))
  assert(leafSum(tree) == 18)
  assert(leafSum2(tree) == 18)

}
