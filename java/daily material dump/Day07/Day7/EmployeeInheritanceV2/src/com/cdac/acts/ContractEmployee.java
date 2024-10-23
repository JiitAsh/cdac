package com.cdac.acts;

public class ContractEmployee extends Employee{
	private double dailyRate;
	private double noOfDays;

	public ContractEmployee() {
		super();
		System.out.println("ContractEmployee::ContractEmployee()");
		dailyRate = 0.0;
		noOfDays = 0.0;
	}

	public ContractEmployee(String name, double basicSal, double dailyRate, double noOfDays) {
		super(name, basicSal);
		System.out.println("ContractEmployee::ContractEmployee(double, double)");
		this.dailyRate = dailyRate;
		this.noOfDays = noOfDays;
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	public double getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(double noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override 
	public double calculateSalary() { 
		return noOfDays * dailyRate; }


	@Override
	public String toString() {
		return super.toString() + "ContractEmployee [dailyRate=" + dailyRate 
				+ ", noOfDays=" + noOfDays
				+ "]";
	}




}
