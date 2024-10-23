package com.cdac.acts;

public class PermEmployee extends Employee{
	private double hra;
	private double bonus;

	public PermEmployee() {
		super();
		System.out.println("PermEmployee::PermEmployee()");
		hra = 0.0;
		bonus = 0.0;
	}
	
	public PermEmployee(String name, double basicSal, 
			double hra, double bonus) {
		super(name, basicSal);
		System.out.println("PermEmployee::PermEmployee(double, double)");
		this.hra = hra;
		this.bonus = bonus;
	}
	
	public double getHra() {
		return hra;
	}
	
	public void setHra(double hra) {
		this.hra = hra;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double calculateSalary() {
		return super.getBasicSal() + hra + bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "PermEmployee [hra=" + hra + ", bonus=" + bonus + "]";
	}
}
