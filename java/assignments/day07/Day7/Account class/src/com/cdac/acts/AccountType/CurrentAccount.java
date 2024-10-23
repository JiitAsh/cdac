package com.cdac.acts.AccountType;

import com.cdac.acts.Account.Account;

public class CurrentAccount  extends Account{
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
	public String toString() {
		return super.toString() + "  CurrentAccount [interest=" + applyInterest() + ", balance=" + balance + "]";
	}
}
