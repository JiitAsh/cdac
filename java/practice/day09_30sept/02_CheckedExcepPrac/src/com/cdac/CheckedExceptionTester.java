 package com.cdac;

public class CheckedExceptionTester {
	
	public static void loadClass(String className) throws ClassNotFoundException{
		System.out.println("loadClass method!!");
		Class.forName(className);
		System.out.println("class is loaded");
	}
	
	public static void loadClass1(String className){
		try {
			Class.forName(className);
			System.out.println("class is loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("loadClass1 catch!!");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		try {
			CheckedExceptionTester.loadClass("java.lang.MyString");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		CheckedExceptionTester.loadClass1("java.lang.MyString");

	}

}