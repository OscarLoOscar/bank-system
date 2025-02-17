package com.javahongkong.bootcamp.exercise;

public class Transaction implements TransactionInterface{
	private Long accountNumber;
	private Bank bank;

	/**
	 *
	 * @param bank
	 *                      The bank where the account is housed.
	 * @param accountNumber
	 *                      The customer's account number.
	 * @param attemptedPin
	 *                      The PIN entered by the customer.
	 * @throws Exception
	 *                   Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		if (bank == null)
			throw new Exception("bank can not be null");
		if (!bank.authenticateUser(accountNumber, attemptedPin))
			throw new Exception("bank can not be null");
		this.bank = bank;
		this.accountNumber = accountNumber;
	}

	@Override
	public double getBalance() throws Exception  {
		// complete the function
		return bank.getBalance(accountNumber);
	}

	public void credit(double amount) throws Exception {
		// complete the function
		bank.credit(accountNumber, amount);
	}

	public boolean debit(double amount) throws Exception {
		// complete the function
		return bank.debit(accountNumber,amount);
	}
}
