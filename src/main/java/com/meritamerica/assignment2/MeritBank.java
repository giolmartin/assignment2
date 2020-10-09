package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	
	private final static double MAXIMUN_BALANCE_AMOUNT = 250000;
	private static AccountHolder[] accounts = new AccountHolder[0];
	private static AccountHolder accountH;
	private static CDOffering[] cdOfferings = new CDOffering[5];
	private static CDOffering bestCDOffering;
	private static CDOffering secondBestCDOffering;
	private static double depositAmount;
	private static int counterA = 0;
	private static int counterCD = 0;
	private static double totalBalance = 0;
	
	public static void addAccountHolder(AccountHolder accountHolder) {
		accountH = accountHolder;
		if (totalBalances() < MAXIMUN_BALANCE_AMOUNT) {
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
		else {
			System.out.println("More than the max amount: " + MAXIMUN_BALANCE_AMOUNT);
			return;
		}
			
	}
	
	public static AccountHolder[] getAccountHolders() {
		return accounts;
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
		totalBalance  = accountH.getCheckingBalance() 
				+ accountH.getSavingsBalance();
		
		return totalBalance;
	}
	public static double futureValue(double presentValue, double interestRate, int term) {
		return 0;
	}
	
}
