package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;
import java.util.List;

public abstract class Account implements AccountInterface {
  private AccountHolder accountHolder;
  private Long accountNumber;
  private int pin;
  private double balance;

  protected Account(AccountHolder accountHolder, Long accountNumber, int pin,
      double startingDeposit) throws Exception {
    if (accountHolder == null)
      throw new Exception("error");
    if (startingDeposit < 0)
      throw new Exception("account deposit can not smaller than zero");
    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
    this.pin = pin;
    this.balance = startingDeposit;
  }

  public AccountHolder getAccountHolder() {
    // complete the function
    return this.accountHolder;
  }

  public boolean validatePin(int attemptedPin) {
    return this.pin == attemptedPin;
  }

  public double getBalance() {
    // complete the function
    return this.balance;
  }

  public double getPin() {
    // complete the function
    return (double) this.pin;
  }

  public Long getAccountNumber() {
    // complete the function
    return this.accountNumber;
  }

  public void creditAccount(double amount) throws Exception {
    // this.balance += amount;
    if (amount < 0)
      throw new Exception("amount can not smaller than zero");
    this.balance = BigDecimal.valueOf(this.balance)
        .add(BigDecimal.valueOf(amount)).doubleValue();
  }

  public boolean debitAccount(double amount) throws Exception {
    if (this.balance < 0)
      throw new Exception("amount can not smaller than zero");
    if (amount > this.balance)
      return false;
    this.balance = BigDecimal.valueOf(this.balance)//
        .subtract(BigDecimal.valueOf(amount))//
        .doubleValue();
    // this.balance-=amount;
    return true;
  }
}
