package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	private static AccountHolder[] accounts;
	private static CDOffering[] cdOfferings;
	private static CDOffering bestCDOffering;
	private static CDOffering secondBestCDOffering;
	private double depositAmount;
	
	static void addAccountHolder(AccountHolder accountHolder) {
		
	}
	
	static AccountHolder[] getAccountHolders() {
		
		return accounts;
		
	}
	
	static CDOffering[] getCDOfferings() {
	return cdOfferings;	
	}
	
	static CDOffering getBestCDOffering(double depositAmount) {
		return bestCDOffering;
	}
	static CDOffering getSecondBestCDOfferings(double depositAmount) {
		return secondBestCDOffering;
	}
	
	static void clearCDOfferings() {
		
	}
	static void setCDOfferings(CDOffering[] offerings) {
		
	}
	static long getNextAccountNumber() {
		return 0;
	}
	static double totalBalances() {
		return 0;
	}
	static double futureValue(double presentValue, double interestRate, int term) {
		return 0;
	}
	
}
