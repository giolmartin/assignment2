package com.meritamerica.assignment2;




public class AccountHolder {

	private String firstName = "";
	private String middleName = "";
	private String lastName = "";
	private String ssn = "";
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	private CheckingAccount clientCheckingAccount = new CheckingAccount(0);
	private CheckingAccount[] amountCheckingAccounts;
	private SavingsAccount[] amountSavingsAccounts;
	private SavingsAccount clientSavingsAccount = new SavingsAccount(0);
	private int checkingAccountAmount = 0;
	private int savingsAccountAmount = 0;
	private int cdAccountsAmount = 0;
	private CDOffering cdOffering = new CDOffering(0,0);
	private CDAccount cdAccount = new CDAccount(cdOffering,0);
	private CDAccount[] amountCDAccounts;
	
	public AccountHolder(){	
	}
	/*
	 * Variables that are entered when calling this AccountHolder constructor are stored in private instance variables().
	 * That way they can be called from any method without having to create and pass down another copy.
	 */
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.cdOffering = new CDOffering(0,0);
		this.cdAccount = new CDAccount(this.cdOffering,0);
		
		
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
		this.clientCheckingAccount = new CheckingAccount(openingBalance);
		return this.clientCheckingAccount;
	}
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		
		return null;
	}
	public CheckingAccount[] getCheckingAccounts() {
		
		return this.amountCheckingAccounts;
	}
	public int getNumberOfCheckingAccounts() {
		checkingAccountAmount = this.amountCheckingAccounts.length;
		return checkingAccountAmount;
	}
	public double getCheckingBalance() {
		return 0;
	}
	
	/** -----------------------------------------------SAVINGS ACCOUNT------------------------------------------------------*/

	public SavingsAccount addSavingsAccount(double openingBalance) {
		
		this .clientSavingsAccount = new SavingsAccount(openingBalance);
		return this.clientSavingsAccount;
	}
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		this .amountSavingsAccounts = new SavingsAccount[0];
		return null;
		
	}
	public SavingsAccount[] getSavingsAccounts() {
		for (int i =0 ; i < this .amountSavingsAccounts.length; i++) {
			
		}
		return this.amountSavingsAccounts;
	}
	public int getNumberOfSavingsAccounts() {
		savingsAccountAmount = this.amountSavingsAccounts.length;
		return savingsAccountAmount;
	}
	public double getSavingsBalance() {

		return 0;
	}
	
	/** -----------------------------------------------CD ACCOUNT------------------------------------------------------*/

	public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
		this.cdAccount = new CDAccount(offering, openingBalance);
		return this.cdAccount;
	}
	public CDAccount addCDAccount(CDAccount cdAccount) {
		CDAccount newCDAccount;
		
		return null ;
	}
	public CDAccount[] getCDAccounts() {
		
		return this.amountCDAccounts;
	}
	public int getNumberOfCDAccounts() {
		cdAccountsAmount = this.amountCDAccounts.length;
		return cdAccountsAmount;
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