package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {

	private double balance;
	private int term;
	private Date date;
	private double futureValue;
	private CDOffering offering;
<<<<<<< HEAD
	
	
	CDAccount(CDOffering offering, double balance){
		super(balance,offering.getInterestRate());
		this.offering = offering;
		this.balance = balance;
=======
	
	CDAccount(CDOffering offering, double balance){
		super(balance, offering.getInterestRate());
	this.offering = offering;
	this.balance = balance;
>>>>>>> a27027998bf712dc0f54a8c9fff7a87f4a41f521
	}
	
	public double getBalance() {
		
		return this.balance;
		
	}
	public double getInterestRate() {
<<<<<<< HEAD
		return this.offering.getInterestRate();
	}
	public int getTerm() {
		return this.offering.getTerm();
=======
	
		return offering.getInterestRate();
	}
	public int getTerm() {
		
		return offering.getTerm();
>>>>>>> a27027998bf712dc0f54a8c9fff7a87f4a41f521
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
