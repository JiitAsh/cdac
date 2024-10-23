package com.cdac.acts.tester;

import com.cdac.acts.ContractEmployee;
import com.cdac.acts.Employee;
import com.cdac.acts.PermEmployee;

public class EmployeeTester {
	
	public static void main(String[] args) {
//		Employee e1 = new Employee("Ram", 10000);
//		double sal = e1.calculateSalary();
//		System.out.println(sal);
//		
//		PermEmployee pe1 = new PermEmployee("Ram", 15000,20000, 50000);
//		sal = pe1.calculateSalary();
//		System.out.println(sal);
//		
//		ContractEmployee ce1 = new ContractEmployee("Ram", 18000, 200, 22);
//		sal = ce1.calculateSalary();
//		System.out.println(sal);
		
		Employee e1 = null;//new Employee("Ram", 10000);
//		double sal = e1.calculateSalary();
//		System.out.println(sal);
//		System.out.println(e1);
		
		//Upcasting
		e1 = new PermEmployee("Sham", 15000,20000, 50000);
		double sal = e1.calculateSalary();
		System.out.println(sal);
		System.out.println(e1);
		
		//Upcasting
		e1 = new ContractEmployee("Radhe", 18000, 200, 22);
		sal = e1.calculateSalary();
		System.out.println(sal);
		System.out.println(e1);
		
	}

}
