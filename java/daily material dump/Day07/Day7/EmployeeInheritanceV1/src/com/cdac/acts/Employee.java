package com.cdac.acts;

public abstract class Employee {
	private int empId;
	private String name;
	private double basicSal;
	
	private static int idGenerator = 1000;
	
	public Employee(){
		System.out.println("Employee::Employee()");
		this.empId = idGenerator++;
		this.name = "";
		this.basicSal = 0.0;
	}
	
	public Employee(String name, double basicSal) {
		System.out.println("Employee::Employee(String, double)");
		this.empId = idGenerator++;
		this.name = name;
		this.basicSal = basicSal;
	}
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}
	
	public abstract double calculateSalary();

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId 
				+ ", name=" + name 
				+ ", basicSal=" + basicSal 
				+"]";
	}

	
}
