package io.jmnunezizu.scalafortheimpatient.chapter14

/**
 * Chapter 14 - Exercise 7.
 * 
 * Extend the tree in the preceding exercise so that each node can have an
 * arbitrary number of children, and reimplement the leafSum function. The
 * tree in exercise 5 should be expressible as:
 *
 * Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))
 */
object Exercise07 extends App {

  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(nodes: BinaryTree*) extends BinaryTree

  def leafSum(t: BinaryTree): Int = {
    t match {
      case Node(nodes @ _*) => nodes.map(leafSum).sum
      case Leaf(value) => value
    }
  }


  val tree = Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))

  assert(leafSum(tree) == 18)

}
