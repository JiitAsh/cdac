package com.cdac.acts.AccountType;

import java.util.Date;

import com.cdac.acts.Account.Account;

public class SavingAccount  extends Account{
	private static final double interestPer = 3;
	private double interest;
	private double balance;
	public SavingAccount(){
		super();
	//this.balance = 0.0;	
	}
	public SavingAccount(String accName, String dateOfJoinning, double amount){
		super( accName,  dateOfJoinning,  amount);
		this.balance = amount;
	}
	
	public double applyInterest()
	{
		interest = ( balance * interestPer ) / 100;
		balance = balance+interest;
		return interest;
	}
	public String toString() {
		return super.toString() + "  SavingAccount [interest=" + applyInterest() + ", balance=" + balance + "]";
	}
}
