package com.meritamerica.assignment2;

<<<<<<< HEAD
public class SavingsAccount extends BankAccount{
	
=======


public class SavingsAccount extends BankAccount{
	
	
	final static double INTEREST_RATE = 1.0/100;

>>>>>>> a27027998bf712dc0f54a8c9fff7a87f4a41f521

	final static double INTEREST_RATE = 1.0/100;
	
<<<<<<< HEAD
	
	SavingsAccount(double openingBalance) {
		super(openingBalance,INTEREST_RATE);
	}

=======
	 SavingsAccount(double openingBalance) {
		super(openingBalance,INTEREST_RATE);
	
}
>>>>>>> a27027998bf712dc0f54a8c9fff7a87f4a41f521
}

/*
 * //Getter
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
 */
