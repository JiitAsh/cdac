package com.cdac;

public class Tester {

	public static void main(String[] args) {
		
		try {
			throw new MyException("myException");
		}catch(MyException me) {
			System.out.println(me);
		}finally {
			System.out.println("Finally called!!");
		}
		
//		try {
//			System.out.println("try block");
//			int z = 12/0;
//			
//		}catch(ArithmeticException ae) {
//			System.out.println("catch block");
//			System.out.println(ae);
//		}finally {
//			System.out.println("finally block");
//		}
		
	}

}
