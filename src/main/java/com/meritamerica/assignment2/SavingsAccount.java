package com.meritamerica.assignment2;

import java.math.*;
import java.text.DecimalFormat;

public class SavingsAccount extends BankAccount{
	
	private double balance;
	private double interestRate = 0.01;
	private double futureValue ;

	
	public SavingsAccount(double openingBalance) {
		super(0,0);
		
		
		
		deposit(openingBalance);	
		futureValue(3);
		toString();
	}
	
	//Getter
	public  double getBalance() {
		return this.balance;
	}
	//Getter
	public  double getInterestRate() {
		return this.interestRate;
	}
	
	//checks for balance and withdraws 
	public boolean withdraw(double amount) {
		if(this.balance >= amount) {
			this.balance = this.balance - amount;
			return true;
		}	else {
			System.out.println("Error found: The amount entered for withdraw could not be processed."); // This line will kick in if the amount is negative. so it wont add new balance																						
			return false;	
			}
	}
	//checks amount and deposits
	public boolean deposit(double amount) {
		if (0 <= amount) {
			this.balance = this.balance + amount;
			return true;
		} 	else {
			System.out.println("Error found: The amount entered for deposit could not be processed."); // This line will kick in if the amount is negative. so it wont add new balance																						
			return false;
			}		
	}
	//calculates interest
	public double futureValue(int years) {
		this.futureValue = balance * Math.pow((1+ interestRate ), 3);
		return this.futureValue;
	}
	
	public String toString() {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		String fV = numberFormat.format(this.futureValue);
		String savingsAccount = "Balance: $" + this.balance +"\n" +
								"Interest Rate: " +this.interestRate + "\n"+ 
								"Balance in 3 years: " + fV ;;
		return savingsAccount;
	}
}