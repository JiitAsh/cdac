package com.cdac.acts;

public class PermEmployee extends Employee{
	private double hra;

	public PermEmployee() {
		super();
		System.out.println("PermEmployee::PermEmployee()");
		hra = 0.0;
	}
	
	public PermEmployee(String name, double basicSal, 
			double hra, double bonus) {
		super(name, basicSal);
		System.out.println("PermEmployee::PermEmployee(double, double)");
		this.hra = hra;
	}
	
	public double getHra() {
		return hra;
	}
	
	public void setHra(double hra) {
		this.hra = hra;
	}
	
	
	@Override
	public final double calculateSalary() {
	double  bonus = (super.getBasicSal() * Employee.BONUS_PERCENTAGE)/100;
		return super.getBasicSal() + hra + bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "PermEmployee [hra=" + hra +  "]";
	}
}
