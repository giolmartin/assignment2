package com.meritamerica.assignment2;

public class BankAccount {
	
	private double  balance ;
	static double interestRate;
	 long accountNumber;
	 double futureValue;
	 double accountTotal;
	
	BankAccount(double balance, double interestRate){
		System.out.println("BankAccount Constr");
		this.balance = balance;
		this.interestRate = interestRate;
		
	}
	
	BankAccount(long accountNumber, double balance, double interestRate){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public long getAccountNumber() {
		System.out.println("AccountNumber");
		return this.accountNumber;
	}
	
	public double getBalance() {
		System.out.println("Balance Bank " + this.balance);
		return this.balance;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public boolean withdraw(double amount) {
	/*	this.balance = this.client.getCombinedBalance();//create in account Balance
		if((this.balance - amount) >= 0) {
			this.balance = this.balance - amount;
			return true;
		} else
	*/		return false;
	}
	
	public boolean deposit(double amount) {
		//this.balance = this.client.getCombinedBalance() ;
		if((this.balance + amount) <= 250000) {
			System.out.println("Deposit bank: "+ amount);
			this.balance = this.balance + amount;
			return true;
		} else 
			System.out.println(" more than 250000");
			return false;	
	}
	
	public double futureValue(int years) {
		this.futureValue = balance * Math.pow((1+ interestRate ), years);
		return this.futureValue;
	}

	public String toString() {
		return "";
	}
}

