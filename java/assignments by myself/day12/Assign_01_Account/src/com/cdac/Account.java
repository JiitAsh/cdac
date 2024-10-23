package com.cdac;

import java.time.LocalDate;

public class Account {
	private Integer accNo;
	private String accHoldersName;
	private Double balance;
	private LocalDate dateOfOpening;  // date of opening
	
	private static Integer accNoGenerator = 20240001;
	
	public Account() {
		super();
	}
	
	public Account(String accHoldersName, Double initialBalance, LocalDate dateOfOpening) {
		super();
		this.accNo = accNoGenerator++;
		this.accHoldersName = accHoldersName;
		this.balance = initialBalance;
		this.dateOfOpening = dateOfOpening;
	}
	
	public Integer getAccNo() {
		return accNo;
	}
	
	public String getAccHoldersName() {
		return accHoldersName;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}
	
	
	@Override
	public String toString() {
		return "A/C Details: [ A/C No: " + accNo
				+ ", A/C Holder's Name: " + accHoldersName
				+ ", Date of Opening: " + dateOfOpening.toString()
				+ ", Available Balance: " + balance
				+ " ]";
	}
	
}
