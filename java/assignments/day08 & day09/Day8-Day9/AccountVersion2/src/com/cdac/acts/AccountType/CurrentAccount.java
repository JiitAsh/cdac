package com.cdac.acts.AccountType;

import com.cdac.acts.Account.Account;
import com.cdac.acts.Account.exception.MinBalnceException;
import com.cdac.acts.Account.interfaces.Depositable;
import com.cdac.acts.Account.interfaces.Withdrwable;

public class CurrentAccount  extends Account implements Depositable, Withdrwable{
	private static final double interestPer = 1;
	private double interest;
	private double balance;
	public CurrentAccount(){
		super();
	//this.balance = 0.0;	
	}
	public CurrentAccount(String accName, String dateOfJoinning, double amount){
		super( accName,  dateOfJoinning,  amount);
		this.balance = amount;
	}
	
	public double applyInterest()
	{
		interest = ( balance * interestPer ) / 100;
		balance = balance+interest;
		return interest;
	}
	public double getBalance() {
		return balance;
	}

	public double deposite(double amount) {
		return balance;
	}
	public double withdraw(double amount) throws MinBalnceException{
		if (balance - amount < 500) {
			MinBalnceException mbe = new MinBalnceException("Min balance in Saving account");
			throw mbe;
		}
		balance = balance - amount;
		return balance;
	}
	public String toString() {
		return super.toString() + "  CurrentAccount [interest=" + applyInterest() + ", balance=" + balance + "]";
	}
}
