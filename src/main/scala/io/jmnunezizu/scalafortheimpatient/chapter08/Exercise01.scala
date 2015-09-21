package io.jmnunezizu.scalafortheimpatient.chapter08

/**
 * Chapter 8 - Exercise 1.
 *
 * Extend the following {@code BankAccount} class to a {@code CheckingAccount}
 * class that charges $1 for every deposit and withdrawal.
 *
 * <pre>
 * {@code
 * class BankAccount(initialBalance: Double) {
 *   private var balance = initialBalance
 *   def deposit(amount: Double) = { balance += amount; balance }
 *   def withdraw(amount: Double) = { balance -= amount; balance }
 * }
 */
object Exercise01 extends App {

  class BankAccount(initialBalance: Double) {
    protected var balance = initialBalance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
  }

  class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    private val ChargeValue: Int = 1

    def charge() = balance -= ChargeValue

    override def deposit(amount: Double) = {
      super.deposit(amount)
      charge()
      balance
    }

    override def withdraw(amount: Double) = {
      super.withdraw(amount)
      charge()
      balance
    }

  }

  val account = new CheckingAccount(100)
  assert(account.deposit(10) == 109)
  assert(account.withdraw(8) == 100)

}
