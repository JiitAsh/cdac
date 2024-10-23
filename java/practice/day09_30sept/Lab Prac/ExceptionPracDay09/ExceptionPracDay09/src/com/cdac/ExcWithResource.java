package com.cdac;
import java.util.Scanner;

public class ExcWithResource {
	public static void main(String[] args) throws Exception{
//		try(Scanner sc = new Scanner(System.in)) {
//			System.out.println("\n Enter 2 nos");
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			double z = 0.0;
//			System.out.println("In try block");
//			z = ArithmaticOperations.divide(x,y);
//			System.out.println("\n Quotient ="+ z);
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		try {
//			System.out.println("\n Enter 2 nos");
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			double z = 0.0;
//			System.out.println("In try block");
//			z = ArithmaticOperations.divide(x,y);
//			System.out.println("\n Quotient ="+ z);
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
//		finally {
//			sc.close();
//		}
		
		
		
		
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("\n Enter 2 nos");
			int x = sc.nextInt();
			int y = sc.nextInt();
			double z = 0.0;
			System.out.println("In try block");
			z = ArithmaticOperations.divide(x,y);
			System.out.println("\n Quotient ="+ z);
		}
		
		
		System.out.println("exc returned");
		
	}
}
