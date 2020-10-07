package com.meritamerica.assignment2;

public class BankAccount {
	
	private double balance;
	private double interestRate;
	private long accountNumber;
	private double futureValue;
	
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
		return true;
	}
	public boolean deposit(double amount) {
		return true;
	}
	public double futureValue(int years) {
		return this.futureValue;
	}
}
