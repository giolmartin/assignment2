package com.meritamerica.assignment2;

public class CDOffering {

	private static  int term ;
	private static double interestRate;
	
	CDOffering(){
		
	}
	
	CDOffering(int term, double interestRate){
		this.term = term;
		this.interestRate = interestRate;
	}
	
	public int getTerm() {
		return this.term;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	
}
