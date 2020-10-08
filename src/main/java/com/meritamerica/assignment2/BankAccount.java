package com.meritamerica.assignment2;

public class BankAccount {
	
	 double balance;
	static double interestRate;
	 long accountNumber;
	 double futureValue;
	 double accountTotal;
	 AccountHolder client;
	
	BankAccount(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	BankAccount(long accountNumber, double balance, double interestRate){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public long getAccountNumber() {
		return this.accountNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public boolean withdraw(double amount) {
		this.balance = this.client.getCombinedBalance();//create in account Balance
		if((this.balance - amount) >= 0) {
			this.balance = this.balance - amount;
			return true;
		} else
			return false;
		
		
	}
	public boolean deposit(double amount) {
		this.balance = this.client.getCombinedBalance();
		if((this.balance + amount) <= 250000) {
			this.balance = this.balance + amount;
			return true;
		} else 
			return false;
		
	}
	public double futureValue(int years) {
		return this.futureValue;
	}
}
