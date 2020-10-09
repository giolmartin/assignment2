package com.meritamerica.assignment2;

public class AccountHolder {

	private String firstName = "";
	private String middleName = "";
	private String lastName = "";
	private String ssn = "";
	private double checkingBalance = 0;
	private double savingsBalance = 0;
	
	private CheckingAccount clientCheckingAccount;
	
	private CheckingAccount[] amountCheckingAccounts = new CheckingAccount[1];
	private SavingsAccount[] amountSavingsAccounts = new SavingsAccount[1];
	private SavingsAccount clientSavingsAccount;
	private CDOffering cdOffering = new CDOffering(0,0);
	private CDAccount cdAccount = new CDAccount(cdOffering,0);
	private CDAccount[] amountCDAccounts;
	private  int  counterC = 0;
	private int counterS = 0;
	
	private  double tB = 0;
	MeritBank m = new MeritBank();
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
		addCheckingAccount(this.clientCheckingAccount);
		return this.clientCheckingAccount;
	}
	
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		
		System.out.println("Im in adding checking : $" + checkingAccount.getBalance());

		tB  = tB+ 	checkingAccount.getBalance() ;
		System.out.println("tB checking: " + tB);
		if (tB > 250000) {
			System.out.println("Over 250K men!");
		}
		
		if (tB < 250000) {
		if(counterC == this.amountCheckingAccounts.length) {
			 CheckingAccount[] newCheckingAccounts = new CheckingAccount[counterC + 1];
			 for(int i = 0 ; i < counterC  ; i++) {
				 newCheckingAccounts[i] = this.amountCheckingAccounts[i];
			 } 
			this.amountCheckingAccounts = newCheckingAccounts;
		}			
			this.amountCheckingAccounts[counterC] = checkingAccount;
			this.counterC++; 
	return null;
		} else return null;
	}
	
	public CheckingAccount[] getCheckingAccounts() {
		return this.amountCheckingAccounts;
	}
	
	public int getNumberOfCheckingAccounts() {
		return this.amountCheckingAccounts.length;
	}
	public double getCheckingBalance() {
		double checkingBalance = 0;
		for (int i = 0; i < this.amountCheckingAccounts.length  ; i++) {
			checkingBalance = this.amountCheckingAccounts[i].getBalance() 
									+checkingBalance;
		}
		this.checkingBalance = checkingBalance;
		return this.checkingBalance;
		
	}
	
	/** -----------------------------------------------SAVINGS ACCOUNT------------------------------------------------------*/

	public SavingsAccount addSavingsAccount(double openingBalance) {
		
		this.clientSavingsAccount = new SavingsAccount(openingBalance);
		
		addSavingsAccount(this.clientSavingsAccount);
			return this.clientSavingsAccount;
		
	}
	
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		System.out.println("Im in adding savings : $" + savingsAccount.getBalance());
		
		tB = 	tB + savingsAccount.getBalance() ;
		
		if (tB > 250000) {
			System.out.println("Over 250K men!");
		}

		System.out.println("TB savings: $" + tB);
		
		if(tB < 250000) {
		

		if(counterS == this.amountSavingsAccounts.length) {
			SavingsAccount[] newSavingsAccount = new SavingsAccount[counterS + 1];
			for(int i = 0; i < counterS ; i++) {
				newSavingsAccount[i] = this.amountSavingsAccounts[i];
			}
			this.amountSavingsAccounts = newSavingsAccount;
		}
		this.amountSavingsAccounts[counterS] = savingsAccount;
		this.counterS++;
		return null;
		} else return null;
		
		
	}
	public SavingsAccount[] getSavingsAccounts() {
		return this.amountSavingsAccounts;
	}
	public int getNumberOfSavingsAccounts() {
		return this.amountSavingsAccounts.length;
	}
	
	public double getSavingsBalance() {
		double savingsBalance = 0;
		for (int i = 0; i < this.amountSavingsAccounts.length; i++) {
			savingsBalance = this.amountSavingsAccounts[i].getBalance() 
								+ savingsBalance;
		}
		this.savingsBalance = savingsBalance;
		return this.savingsBalance;
		
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
		
		return this.amountCDAccounts.length;
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