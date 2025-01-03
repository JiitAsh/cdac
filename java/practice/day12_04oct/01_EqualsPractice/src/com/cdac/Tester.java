package com.cdac;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Objects;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Employee> empList = new ArrayList<> ();
		Employee e1 = new Employee(155,"Jitesh");
		Employee e2 = new Employee(125,"Rahul");
		Employee e3 = new Employee(426,"Pilots");
		Employee e4 = new Employee(451,"Yash");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
//		for(int i=0;i<4;i++) {
////			System.out.println(empList[i].toString());   // [i] not works with Lists(collections) use get()
//			System.out.println(empList.get(i).toString());
//		}
		
		
		// enhanced for loop
		for(Employee empVal : empList) {
			System.out.println(empVal.toString());
		}
		
		System.out.print("Enter empId: ");
		int enteredId = sc.nextInt();
		
		Employee tempEmp = new Employee(enteredId,"");
		
		boolean notPresent = true;   // let suppose emp is not present, and we will stick to our assumption that emp is not present, if in searching someone disapprove our assumption then it will turn in notPresent = false.
		for(Employee empVal: empList) {
			if(tempEmp.equals(empVal)) {
				System.out.println("Employee is present!!");
				notPresent = false;   // someone disapproved our assumption and turned it into a false assumption
				break;
			}
		}
		
		if(notPresent) {   //check that our assumption is still correct or not if yes then print our result, otherwise, tata :)
			System.out.println("Employee is not present!!");
		}
		
		sc.close();
		
		
	}

}
