package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {

	private double balance;
	private int term;
	private long accountNumber;
	private Date date;
	private double futureValue;
	private CDOffering offering;
	
	CDAccount(CDOffering offering, double balance){
		super(balance, offering.getInterestRate());
	this.offering = offering;
	this.balance = balance;
	}
	public double getBalance() {
		
		return this.balance;
		
	}
	public double getInterestRate() {
	
		return offering.getInterestRate();
	}
	public int getTerm() {
		
		return offering.getTerm();
	}
	
	public Date getStartDate() {
		return this.date;
	}
	public long getAccountNumber() {
		return super.getAccountNumber();
	}
	public double futureValue() {
		return super.futureValue(getTerm());
	}
}
