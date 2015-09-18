package io.jmnunezizu.scalafortheimpatient.chapter05

object Exercise02 extends App {

  class BankAccount(private var balanceValue: Int = 0) {
    def deposit(amount: Int) = balanceValue += amount
    def withdraw(amount: Int) = balanceValue -= amount
    def balance = balanceValue
  }

  val bankAccount = new BankAccount()
  println("Initial balance: " + bankAccount.balance)
  bankAccount.deposit(100)
  println("Balance after making a deposit of 100: " + bankAccount.balance)
  bankAccount.withdraw(50)
  println("Balance after withdrawing 50: " + bankAccount.balance)

}
