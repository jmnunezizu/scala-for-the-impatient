package io.jmnunezizu.scalafortheimpatient.chapter08

/**
 * Chapter 8 - Exercise 2.
 *
 * Extend the {@code BankAccount} class of the preceding exercise into a class
 * {@code SavingsAccount} that earns interest every month (when a method
 * {@code earnMonthlyInterest} is called) and has three free deposits or
 * withdrawals every month. Reset the transaction count in the
 * {@code earnMonthlyInterest} method.
 */
object Exercise02 extends App {

  class BankAccount(initialBalance: Double) {
    var balance = initialBalance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
  }

  class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {

    private val DefaultFreeTransactions: Int = 3
    private val ChargeValue: Int = 1
    private val InterestRate: Int = 10
    private var remainingFreeTransactions: Int = DefaultFreeTransactions

    def earnMonthlyInterest() = {
      balance += balance * InterestRate / 100
      remainingFreeTransactions = DefaultFreeTransactions
    }

    override def deposit(amount: Double) = {
      super.deposit(amount)
      transactionCharge()
      balance
    }

    override def withdraw(amount: Double) = {
      super.withdraw(amount)
      transactionCharge()
      balance
    }

    private def transactionCharge() = {
      if (remainingFreeTransactions == 0) {
        balance -= ChargeValue
      }
      remainingFreeTransactions -= 1
    }
  }

  val account = new SavingsAccount(100)
  assert(account.deposit(10) == 110)
  assert(account.withdraw(8) == 102)
  assert(account.deposit(10) == 112)
  assert(account.deposit(9) == 120)

  account.earnMonthlyInterest()
  assert(account.deposit(10) == 142)
  assert(account.deposit(10) == 152)
  assert(account.deposit(10) == 162)
  assert(account.withdraw(1) == 160)
  
}
