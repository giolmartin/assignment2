package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	private static AccountHolder[] accounts = new AccountHolder[1];
	private static AccountHolder accountH;
	private static CDOffering[] cdOfferings = new CDOffering[5];
	private static CDOffering bestCDOffering;
	private static CDOffering secondBestCDOffering;
	private double depositAmount;
	private static int counterA = 0;
	private static int counterCD = 0;
	
	public static void addAccountHolder(AccountHolder accountHolder) {
		
		if(counterA == accounts.length) {
			AccountHolder[] newAccounts = new AccountHolder[counterA + 1];
			for(int i = 0; i <counterA ; i++) {
				newAccounts[i] = accounts[i];
			}
			accounts = newAccounts;
		}
			accounts[counterA] = accountHolder;
			counterA++;
		
	}
	
	public static AccountHolder[] getAccountHolders() {
		return accounts;
		//for(int i = 0; i < accounts.length; i++) {
		//	System.out.println(accounts[i].getCheckingBalance());
		//} 
	}
	
	public static CDOffering[] getCDOfferings() {
		
		return cdOfferings;	
	}
	
	public static CDOffering getBestCDOffering(double depositAmount) {
		return bestCDOffering;
	}
	public static CDOffering getSecondBestCDOfferings(double depositAmount) {
		return secondBestCDOffering;
	}
	
	public static void clearCDOfferings() {
		cdOfferings = null;
	}
	
	public static void setCDOfferings(CDOffering[] offerings) {
		for (int i = 0; i< offerings.length; i++) {
			cdOfferings[i] = offerings[i];
		}	
	}
	
	public static long getNextAccountNumber() {
		return 0;
	}
	public static double totalBalances() {
		
		return 0;
	}
	public static double futureValue(double presentValue, double interestRate, int term) {
		return 0;
	}
	
}
