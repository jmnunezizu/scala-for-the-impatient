package io.jmnunezizu.scalafortheimpatient.chapter14

import scala.annotation.tailrec

/**
 * Chapter 14 - Exercise 6.
 *
 * A better way of modeling such trees is with case classes. Let’s start with
 * binary trees.
 *
 * sealed abstract class BinaryTree
 * case class Leaf(value: Int) extends BinaryTree
 * case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree
 *
 * Write a function to compute the sum of all elements in the leaves.
 */
object Exercise06 extends App {

  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

  def leafSum(t: BinaryTree): Int = {
    def loop(total: Int, node: BinaryTree): Int = {
      node match {
        case Leaf(n) => n + total
        case Node(left, right) => loop(total + loop(0, right), left)
      }
    }
    loop(0, t)
  }

  def leafSum2(t: BinaryTree): Int = {
    @tailrec
    def loop(total: Int, node: BinaryTree, pending: List[BinaryTree]): Int = {
      node match {
        case Leaf(n) if pending.isEmpty => n + total
        case Leaf(n) => loop(n + total, pending.head, pending.tail)
        case Node(left, right) => loop(total, left, right :: pending)
      }
    }
    loop(0, t, List.empty[BinaryTree])
  }

  val tree = Node(
    Node(Leaf(3), Leaf(8)),
    Node(Leaf(5), Leaf(2))
  )

  assert(leafSum(tree) == 18)
  assert(leafSum2(tree) == 18)

}
