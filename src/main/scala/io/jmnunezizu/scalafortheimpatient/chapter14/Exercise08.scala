package io.jmnunezizu.scalafortheimpatient.chapter14

/**
 * Chapter 14 - Exercise 8.
 *
 * Extend the tree in the preceding exercise so that each nonleaf node stores
 * an operator in addition to the child nodes. Then write a function eval that
 * computes the value. For example the tree
 *
 *       +
 *    /  |  \
 *   *   2   -
 *  / \      |
 * 3   8     5
 */
object Exercise08 extends App {

  val Sum = (_: Int) + (_: Int)
  val Mul = (_: Int) * (_: Int)
  val Sub = (_: Int) - (_: Int)

  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(operator: (Int, Int) => Int, nodes: BinaryTree*) extends BinaryTree

  def eval(tree: BinaryTree): Int = {
    tree match {
      case Leaf(value) => value
      case Node(op, Leaf(v)) => op(0, v)
      case Node(op, Leaf(v1), Leaf(v2)) => op(v1, v2)
      case Node(op, nodes @ _*) => nodes.map(eval).reduceLeft(op(_, _))
    }
  }

  val tree = Node(
    Sum, Node(Mul, Leaf(3), Leaf(8)),
         Leaf(2),
         Node(Sub, Leaf(5))
  )

  assert(eval(tree) == 21) // 21

}
