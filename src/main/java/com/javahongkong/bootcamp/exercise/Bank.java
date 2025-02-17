package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank implements BankInterface {
  private LinkedHashMap<Long, Account> accounts; // object reference
  private long nextAccountNumber;

  public Bank() {
    this.accounts = new LinkedHashMap<>();
    nextAccountNumber = 1L;
  }

  public Account getAccount(Long accountNumber) {
    return this.accounts.get(accountNumber);
  }

  @Override
  public Long openCommercialAccount(Company company, int pin,
      double startingDeposit) throws Exception {
    long accountNumber = this.nextAccountNumber++;
    Account account = new CommercialAccount(company, accountNumber, pin, startingDeposit);
    accounts.put(accountNumber, account);
    return accountNumber;
  }

  @Override
  public Long openConsumerAccount(Person person, int pin,
      double startingDeposit) throws Exception {
    // complete the function
    Long accountNumber = nextAccountNumber++;
    Account account = new ConsumerAccount(person, accountNumber, pin, startingDeposit);
    accounts.put(accountNumber, account);
    return accountNumber;
  }

  @Override
  public boolean authenticateUser(Long accountNumber, int pin) throws Exception {
    // complete the function
    Account account = accounts.get(accountNumber);
    if (account == null)
      throw new Exception("account can not be null");
    return account != null && account.validatePin(pin);
  }

  @Override
  public double getBalance(Long accountNumber) throws Exception {
    // complete the function
    Account account = accounts.get(accountNumber);
    if (account == null)
      throw new Exception("account can not be null");
    return account.getBalance();
  }

  @Override
  public void credit(Long accountNumber, double amount) throws Exception {
    // complete the function
    Account account = accounts.get(accountNumber);
    if (account == null)
      throw new Exception("account can not be null");
    account.creditAccount(amount);
  }

  @Override
  public boolean debit(Long accountNumber, double amount) throws Exception {
    // complete the function
    Account account = accounts.get(accountNumber);
    if (account == null)
      throw new Exception("account can not be null");
    return account.debitAccount(amount);
  }
}
