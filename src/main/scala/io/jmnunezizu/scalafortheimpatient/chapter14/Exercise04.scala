package io.jmnunezizu.scalafortheimpatient.chapter14

/**
 * Chapter 14 - Exercise 4.
 *
 * Add a case class Multiple that is a subclass of the Item class. For example,
 * Multiple(10, Product("Blackwell Toaster", 29.95)) describes ten toasters.
 * Of course, you should be able to handle any items, such as bundles or multiples,
 * in the second argument. Extend the price function to handle this new case.
 */
object Exercise04 extends App {

  // Product is actually Article

  abstract class Item
  case class Article(description: String, price: Int) extends Item
  case class Bundle(description: String, discount: Double, items: Item*) extends Item
  case class Multiple(quantity: Int, p: Item) extends Item

  def price(it: Item): Double = it match {
    case Article(_, p) => p
    case Bundle(_, discount, items @ _*) => items.map(price(_)).sum - discount
    case Multiple(quantity, p) => quantity * price(p)
  }

  assert(price(Article("x", 10)) == 10)
  assert(price(Bundle("Mega Bundle", 10, Article("x", 10), Article("y", 50))) == 50)
  assert(price(Multiple(5, Article("x", 10))) == 50)
  assert(price(Multiple(2, Bundle("Mega Bundle", 10, Article("x", 10), Article("y", 50)))) == 100)

}
