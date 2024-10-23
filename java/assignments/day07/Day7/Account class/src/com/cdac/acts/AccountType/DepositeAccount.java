package com.cdac.acts.AccountType;

import com.cdac.acts.Account.Account;

public class DepositeAccount extends Account{
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
	
	
	public double applyInterest()
	{
		interest = ( balance * interestPer ) / 100;
		balance = balance+interest;
		return interest;
	}
	//@Override
	public String toString() {
		return super.toString() + "  DepositeAccount [interest=" + applyInterest() + ", balance=" + balance + "]";
	}
}