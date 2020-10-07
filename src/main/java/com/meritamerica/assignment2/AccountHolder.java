package com.meritamerica.assignment2;




public class AccountHolder {

	private String firstName = "";
	private String middleName = "";
	private String lastName = "";
	private String ssn = "";
	private double checkingAccountOpeningBalance = 0;
	private double savingsAccountOpeningBalance = 0;
	private CheckingAccount clientCheckingAccount = new CheckingAccount(0);
	private SavingsAccount clientSavingsAccount = new SavingsAccount(0);
	
	public AccountHolder(){	
	}
	/*
	 * Variables that are entered when calling this AccountHolder constructor are stored in private instance variables().
	 * That way they can be called from any method without having to create and pass down another copy.
	 */
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, 
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		this.clientCheckingAccount = new CheckingAccount(this.checkingAccountOpeningBalance);
		this.clientSavingsAccount = new SavingsAccount(this.savingsAccountOpeningBalance);
	}
	
	
	/** -----------------------------------------------GETTERS------------------------------------------------------*/

	/** returns instance variable firstName */
	
	public String getFirstName() {
		return this.firstName;
	}
	
	/*
	 * returns instance variable middleName
	 */
	public String getMiddleName() {
		return this.middleName;
	}
	
	/*
	 * returns instance variable lastName
	 */
	public String getLastName() {
		return this.lastName;
	}
	/*
	 * returns instance variable ssn
	 */
	public String getSSN() {
		return this.ssn;
	}
	
	/** -----------------------------------------------SETTERS------------------------------------------------------*/

	
	public void setFirstName(String firstName) {
		this.firstName= firstName; 
	}
	public void setMiddleName(String middleName) {
		 this.middleName = middleName;
		
	}
	public void setLastName(String lastName) {
		 this.lastName = lastName;
	}
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	/** -----------------------------------------------CHECKING ACCOUNT------------------------------------------------------*/
	public CheckingAccount addCheckingAccount(double openingBalance) {
		return null;
	}
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		return null;
	}
	public CheckingAccount[] getCheckingAccounts() {
		return null;
	}
	public int getNumberOfCheckingAccounts() {
		return 0;
	}
	public double getCheckingBalance() {
		return 0;
	}
	
	/** -----------------------------------------------SAVINGS ACCOUNT------------------------------------------------------*/

	public SavingsAccount addSavingsAccount(double openingBalance) {
		return null;
	}
	public SavingsAccount addSavingsAccount(CheckingAccount checkingAccount) {
		return null;
	}
	public SavingsAccount[] getSavingsAccounts() {
		return null;
	}
	public int getNumberOfSavingsAccounts() {
		return 0;
	}
	public double getSavingsBalance() {
		return 0;
	}
	
	/** -----------------------------------------------CD ACCOUNT------------------------------------------------------*/

	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		return null;
	}
	public CDAccount addCDAccount(CDAccount cdAccount) {
		return null;
	}
	public CDAccount[] getCDAccounts() {
		return null;
	}
	public int getNumberOfCDAccounts() {
		return 0;
	}
	public double getCDBalance() {
		return 0;
	}
	
	
	
	public double getCombinedBalance() {
		return 0;
	}
	

	public String toString() {
		String client = "Name: " + this.firstName + " " + this.middleName + " " + this.lastName + "\n" + 
						"SSN: " + this.ssn + "\n" ;
		return client;
	}
	

}