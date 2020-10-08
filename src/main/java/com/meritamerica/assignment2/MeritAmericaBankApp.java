package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		System.out.println("Hello Merit America!");

		AccountHolder accountHolder = new AccountHolder("Sam", "John", "Houston","633378899");
    	
    	CheckingAccount checkingAccount1 =new CheckingAccount(1000);
    	SavingsAccount savingsAccount1 = new SavingsAccount(10000);
    	
    	CheckingAccount checkingAccount2 =new CheckingAccount(5000);
    	SavingsAccount savingsAccount2 = new SavingsAccount(50000);
    	
    	CheckingAccount checkingAccount3 =new CheckingAccount(50000);
    	SavingsAccount savingsAccount3 = new SavingsAccount(130000);
    	
       	CheckingAccount checkingAccount4 =new CheckingAccount(5000);
    	SavingsAccount savingsAccount4 = new SavingsAccount(50000);    	

    	accountHolder.addCheckingAccount(checkingAccount1);
    	accountHolder.addSavingsAccount(savingsAccount1);
    	
    	CDOffering[] fromMeritBankCDOfferings = MeritBank.getCDOfferings();
    	System.out.println("Total  Checking Balance: $"+accountHolder.getCheckingBalance());
    	System.out.println("Total  Savings Balance: $"+accountHolder.getSavingsBalance());
	
	}
}
/* accountHolder.addCheckingAccount(checkingAccount2);
    	accountHolder.addSavingsAccount(savingsAccount2);    	
    	
    	accountHolder.addCheckingAccount(checkingAccount3);
    	accountHolder.addSavingsAccount(savingsAccount3);    	    
    	
    	accountHolder.addCheckingAccount(checkingAccount4);
    	accountHolder.addSavingsAccount(savingsAccount4); 
    	
    	AccountHolder accountHolder12 = new AccountHolder("Sam", "John", "Houston","633378899");
    	
    	accountHolder12.addCheckingAccount(checkingAccount1);
    	accountHolder12.addSavingsAccount(savingsAccount1);
    	
    	accountHolder12.addCheckingAccount(checkingAccount2);
    	accountHolder12.addSavingsAccount(savingsAccount2); 
    	
    	MeritBank.addAccountHolder(accountHolder);
    	MeritBank.addAccountHolder(accountHolder12);
    	MeritBank.addAccountHolder(accountHolder);
    	MeritBank.addAccountHolder(accountHolder12);

    	CDOffering[] CDOfferings = new CDOffering[5];
    	
    	CDOfferings[0] = new CDOffering(1,1.8/100);
    	CDOfferings[1] = new CDOffering(2,1.9/100);
    	CDOfferings[2] = new CDOffering(3,2.0/100);
    	CDOfferings[3] = new CDOffering(5,2.5/100);
    	CDOfferings[4] = new CDOffering(10,2.2/100);
    	
    	MeritBank.setCDOfferings(CDOfferings);
    	
    	CDOffering[] fromMeritBankCDOfferings = MeritBank.getCDOfferings();
    	*/