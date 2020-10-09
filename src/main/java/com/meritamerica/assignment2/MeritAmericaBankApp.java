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
    	
    	accountHolder.addCheckingAccount(checkingAccount2);
    	accountHolder.addSavingsAccount(savingsAccount2);    	
    	
    	accountHolder.addCheckingAccount(checkingAccount3);
    	accountHolder.addSavingsAccount(savingsAccount3);    	    
    	
    	accountHolder.addCheckingAccount(checkingAccount4);
    	accountHolder.addSavingsAccount(savingsAccount4);   
		
		
    		System.out.println(accountHolder.getNumberOfCheckingAccounts());
    		System.out.println(accountHolder.getNumberOfSavingsAccounts());
    		System.out.println(MeritBank.totalBalances());

    	//System.out.println("Total  Checking Balance: $"+accountHolder.getCheckingBalance());
    	//System.out.println("Total  Savings Balance: $"+accountHolder.getSavingsBalance());
	
	}
}
/* 


    	accountHolder2.addCheckingAccount(9999);
		System.out.println("added :" + accountHolder2.getCheckingBalance() );

    	accountHolder2.addCheckingAccount(20000);
		System.out.println("added :" + accountHolder2.getCheckingBalance() );

		accountHolder2.addCheckingAccount(1000000);
		System.out.println("added :" + accountHolder2.getCheckingBalance() );
	AccountHolder accountHolder2 = new AccountHolder("gio", "ma", "rtin","1111111111");
		accountHolder.addCheckingAccount(1000);
		
		accountHolder.addCheckingAccount(1000);
		

		accountHolder.addCheckingAccount(1000);
		

    	accountHolder.addSavingsAccount(100000);
		

    	accountHolder.addSavingsAccount(10000);


    	accountHolder.addSavingsAccount(50000);
		
		accountHolder2.addSavingsAccount(10000);
		System.out.println("added :" + accountHolder2.getSavingsBalance() );

		accountHolder2.addSavingsAccount(10000);
		System.out.println("added :" + accountHolder2.getSavingsBalance() );
		
    	accountHolder.addSavingsAccount(savingsAccount2);    	
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
    	accountHolder.addCheckingAccount(checkingAccount2);
    	accountHolder.addSavingsAccount(savingsAccount2);    	
    	accountHolder.addCheckingAccount(checkingAccount3);
    	accountHolder.addSavingsAccount(savingsAccount3);    	    
    	accountHolder.addCheckingAccount(checkingAccount4);
    	accountHolder.addSavingsAccount(savingsAccount4); 
    	
    	AccountHolder accountHolder2 = new AccountHolder("Sam", "John", "Houston","633378899");
    	
    	accountHolder2.addCheckingAccount(checkingAccount1);
    	accountHolder2.addSavingsAccount(savingsAccount1);
    	
    	accountHolder2.addCheckingAccount(checkingAccount2);
    	accountHolder2.addSavingsAccount(savingsAccount2); 
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

    	
    	CDOffering[] fromMeritBankCDOfferings = MeritBank.getCDOfferings();
    	System.out.println(fromMeritBankCDOfferings[0].getTerm());
    	System.out.println(fromMeritBankCDOfferings[1].getTerm());
    	System.out.println(fromMeritBankCDOfferings[2].getTerm());
    	System.out.println(fromMeritBankCDOfferings[3].getTerm());
    	System.out.println(fromMeritBankCDOfferings[4].getTerm());
    	System.out.println(fromMeritBankCDOfferings[0].getInterestRate());
    	
    	CDOffering[] CDOfferings = new CDOffering[5];
    	
    	CDOfferings[0] = new CDOffering(1,1.8/100);
    	CDOfferings[1] = new CDOffering(2,1.9/100);
    	CDOfferings[2] = new CDOffering(3,2.0/100);
    	CDOfferings[3] = new CDOffering(5,2.5/100);
    	CDOfferings[4] = new CDOffering(10,2.2/100);
    	
    	
    	
    	MeritBank.setCDOfferings(CDOfferings);
    	
    	CDOffering[] fromMeritBankCDOfferings = MeritBank.getCDOfferings();
    	
    	for(int i = 0; i < 5; i++) {
    	System.out.println(fromMeritBankCDOfferings[i].getTerm());
    	System.out.println(fromMeritBankCDOfferings[i].getInterestRate());
    	}
    	
    	*/