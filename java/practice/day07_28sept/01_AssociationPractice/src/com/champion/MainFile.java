package com.champion;
import java.util.Scanner;
public class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Address add1 = new Address();
		Address add2 = new Address("Soapn Baug", "B1-16", "462203");
		System.out.println(add1.getAddress());
		System.out.println(add2.getAddress());
		
		
		//Student std1 = new Student();    // will show error bcz address is null and addr.getAddress() method will create an error
		//Student std2 = new Student(68, "Jitesh", null);   // will show error bcz address is null and addr.getAddress() method will create an error
		Student std3 = new Student(63, "Yash", add2);
		//System.out.println(std1.getDetails());
		//System.out.println(std2.getDetails());
		System.out.println(std3.getDetails());
		
		sc.close();

	}

}
