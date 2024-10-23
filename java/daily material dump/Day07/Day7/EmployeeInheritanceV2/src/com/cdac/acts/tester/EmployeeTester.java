package com.cdac.acts.tester;

import com.cdac.acts.ContractEmployee;
import com.cdac.acts.Employee;
import com.cdac.acts.PermEmployee;

public class EmployeeTester {
	
	public static void main(String[] args) {
		final double PI = 3.145;
		//Upcasting
		Employee e1 = new PermEmployee("Sham", 15000,20000, 50000);
		double sal = e1.calculateSalary();
		System.out.println(sal);
		System.out.println(e1);
		
		//Upcasting
		e1 = new ContractEmployee("Radhe", 18000, 200, 22);
		sal = e1.calculateSalary();
		System.out.println(sal);
		System.out.println(e1);
		
		//Safe down-casting
		if( e1 instanceof ContractEmployee) {
			System.out.println("Its contract employee");
			ContractEmployee ce1 = (ContractEmployee)e1;
			System.out.println(ce1.calculateSalary());
		}
		
		if( e1.getClass() == ContractEmployee.class) {
			System.out.println("Its contract employee");
			ContractEmployee ce2 = (ContractEmployee)e1;
			System.out.println(ce2.calculateSalary());
		}
		
	}

}
