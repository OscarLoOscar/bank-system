package com.javahongkong.bootcamp.exercise;

public interface BankInterface {

	/**
	 * Creates a new account and adds it to {@link Bank#accounts}.
	 *
	 * @param company
	 * @param pin
	 * @param startingDeposit
	 * @return The account number for the newly created account.
	 * @throws Exception 
	 */
	public Long openCommercialAccount(Company company, int pin, double startingDeposit) throws Exception;

	/**
	 * Creates a new account and adds it to {@link Bank#accounts}.
	 *
	 * @param person
	 * @param pin
	 * @param startingDeposit
	 * @return The account number for the newly created account.
	 * @throws Exception 
	 */
	public Long openConsumerAccount(Person person, int pin, double startingDeposit) throws Exception;

	/**
	 * @param accountNumber The account number for the transaction.
	 * @param pin
	 * @return true if authentication was successful.
	 * @throws Exception 
	 */
	public boolean authenticateUser(Long accountNumber, int pin) throws Exception;

	/**
	 * @param accountNumber The account number for the transaction.
	 * @return the balance of the account.
	 * @throws Exception 
	 */
	public double getBalance(Long accountNumber) throws Exception;

	/**
	 * @param accountNumber The account number for the transaction.
	 * @param amount        The amount of money being deposited.
	 * @throws Exception 
	 */
	public void credit(Long accountNumber, double amount) throws Exception;

	/**
	 * @param accountNumber The account number for the transaction.
	 * @param amount
	 * @return true if amount could be withdrawn; otherwise, return false.
	 * @throws Exception 
	 */
	public boolean debit(Long accountNumber, double amount) throws Exception;

	/**
	 * @param accountNumber The account number for the transaction.
	 * @return true if the account can be found by the accountNumber
	 */
	Account getAccount(Long accountNumber);
}
