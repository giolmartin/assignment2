package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {

	private double balance;
	private double interestRate;
	private int term;
	private long accountNumber;
	private Date date;
	private double futureValue;
	
	CDAccount(CDOffering offering, double balance){
		super(0,0);
	}
	public double getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	public int getTerm() {
		return this.term;
	}
	
	public Date getStartDate() {
		return this.date;
	}
	public long getAccountNumber() {
		return this.accountNumber;
	}
	public double futureValue() {
		return this.futureValue;
	}
}
