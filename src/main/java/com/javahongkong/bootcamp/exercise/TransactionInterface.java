package com.javahongkong.bootcamp.exercise;

public interface TransactionInterface {

	/**
	 * @return The account balance for account {@link Transaction#accountNumber}
	 *         .
	 * @throws Exception 
	 */
	public double getBalance() throws Exception;

	/**
	 * @param amount
	 *            The amount to credit/deposit into account
	 *            {@link Transaction#accountNumber}
	 * @throws Exception 
	 */
	public void credit(double amount) throws Exception;

	/**
	 * @param amount
	 *            The amount to debit/withdraw from account
	 *            {@link Transaction#accountNumber}
	 * @return true if amount could be withdrawn; otherwise, return false.
	 * @throws Exception 
	 */
	public boolean debit(double amount) throws Exception;
}
