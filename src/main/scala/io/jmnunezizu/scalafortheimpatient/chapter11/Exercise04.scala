package io.jmnunezizu.scalafortheimpatient.chapter11

/**
 * Chapter 11 - Exercise 4.
 */
object Exercise04 extends App {

  class Money(val dollars: Int, val cents: Int) {

    def +(money: Money): Money = Money(toFloat + money.toFloat)
    def -(money: Money): Money = Money(toFloat - money.toFloat)
    def ==(money: Money): Boolean = toFloat == money.toFloat
    def >(money: Money): Boolean = toFloat > money.toFloat
    def <(money: Money): Boolean = toFloat < money.toFloat

    private def toFloat = (dollars + "." + cents).toFloat

    override def toString(): String = s"${toFloat} USD"
  }

  object Money {
    def apply(dollars: Int, cents: Int) = new Money(dollars, cents)
    def apply(value: Float) = {
      val s = "%2f".format(value).toString.split('.') // we make things easier with 2 dec
      new Money(s(0).toInt, s(1).toInt)
    }

  }

  val m1 = Money(1, 75) + Money(0, 50)
  assert(m1 == Money(2, 25))

  val m2 = Money(3, 70) - Money(0, 90)
  assert(m2 == Money(2, 80))

  assert(Money(1, 40) > Money(1, 30))
  assert(Money(1, 40) < Money(1, 50))

  // * and / do not make sense with money

}
