package io.jmnunezizu.scalafortheimpatient.chapter08

import scala.collection.mutable.ArrayBuffer

/**
 * Chapter 8 - Exercise 4.
 *
 * Define an abstract class {@code Item} with methods {@code price} and
 * {@code description}. A {@code SimpleItem} is an item whose price and
 * description are specified in the constructor. Take advantage of the fact
 * that a val {@code val} can override a {@code def}. A bundle is an item
 * that contains other items. Its price is the sum of the prices in the bundle.
 * Also provide a mechanism for adding items to the bundle and a suitable
 * {@code description} method.
 */
object Exercise04 extends App {

  abstract class Item {
    def price: Double
    def description: String
  }

  class SimpleItem(val price: Double, val description: String) extends Item {

  }

  class Bundle extends Item {

    private var items = ArrayBuffer[Item]()

    def price: Double = items.map(_.price).sum

    def description: String = s"This bundle contains ${items.length} items with a total of ${price}"

    def addItem(item: Item): Bundle = {
      items += item
      this
    }

  }

  val simpleItem = new SimpleItem(20, "my simple item")
  assert(simpleItem.price == 20)
  assert(simpleItem.description == "my simple item")

  val bundle = new Bundle()
  bundle.addItem(simpleItem)
        .addItem(new SimpleItem(30, "my simple item 2"))
  assert(bundle.price == 50)
  assert(bundle.description.indexOf(50) != -1)

}
