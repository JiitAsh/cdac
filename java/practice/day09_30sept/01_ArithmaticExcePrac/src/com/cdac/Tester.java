package com.cdac;
import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		System.out.println("Hello Programmer :)");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int fNum = sc.nextInt();
		System.out.print("Enter second number: ");
		int sNum = sc.nextInt();
		double res = 0.0;
		try {
			System.out.println("try called, before calling divide method");
			res=ArithmeticOperations.divide(fNum, sNum);
		}catch(ArithmeticException ae) {
			System.out.println("Catch called!!");
			System.out.println("Don't enter 0 as a second number!!, exception handled successfully!!");
		}finally {
			System.out.println("Finally called!!");
//			System.exit(0);
		}
		System.out.println(res);
		
		sc.close();
	}
}
