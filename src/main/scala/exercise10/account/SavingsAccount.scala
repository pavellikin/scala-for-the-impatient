package exercise10.account

import exercise10.ConsoleLogger

class SavingsAccount extends Account with ConsoleLogger {

  def withdraw(amount: Double): Unit = {
    if (amount > balance) log("Insufficient funds")
    else balance -= amount
  }

}
