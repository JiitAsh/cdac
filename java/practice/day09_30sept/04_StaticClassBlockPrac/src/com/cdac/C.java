package com.cdac;

public class C extends A {
	static {
		System.out.println("Inside C static block");
	}
	
	{
		System.out.println("Inside C non-static block");
	}
}