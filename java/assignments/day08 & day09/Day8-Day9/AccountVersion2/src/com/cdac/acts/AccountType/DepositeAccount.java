package com.cdac.acts.AccountType;

import com.cdac.acts.Account.Account;
import com.cdac.acts.Account.interfaces.Muturable;

public class DepositeAccount extends Account implements Muturable{
	private static final double interestPer = 8;
	private double interest;
	private double balance;
	public DepositeAccount(){
		super();
	//this.balance = 0.0;	
	}
	public DepositeAccount(String accName, String dateOfJoinning, double amount){
		super( accName,  dateOfJoinning,  amount);
		this.balance = amount;
	}
	
	public double calculateMatutyAmount( int time) {
		return balance + (balance * interestPer * time )/100;
	}
	public double applyInterest()
	{
		interest = ( balance * interestPer ) / 100;
		return interest;
	}

	public double getBalance() {
		return balance;
	}

	//@Override
	public String toString() {
		return super.toString() + "  DepositeAccount [interest=" + applyInterest() + ", balance=" + balance + "]";
	}
}