package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {

	private double balance;
	private double interestRate;
	private int term;
	private Date date;
	private double futureValue;
<<<<<<< HEAD
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
=======
	
	CDAccount(CDOffering offering, double balance){
		super(balance,0);
>>>>>>> parent of a270279... commit 10:56
	}
	
	public double getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
<<<<<<< HEAD
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
=======
		return this.interestRate;
	}
	public int getTerm() {
		return this.term;
>>>>>>> parent of a270279... commit 10:56
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
