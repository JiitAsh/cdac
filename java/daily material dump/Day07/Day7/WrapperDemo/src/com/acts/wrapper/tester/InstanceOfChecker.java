package com.acts.wrapper.tester;

public class InstanceOfChecker {
	public static void main(String[] args) {
	 Object obj = 100;
	 System.out.println(obj.getClass());
	 
	 if(obj instanceof java.lang.Integer) {
		 System.out.println("yes its Integer");
	 }

	}

}
