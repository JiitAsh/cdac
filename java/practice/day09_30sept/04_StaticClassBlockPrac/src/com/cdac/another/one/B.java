package com.cdac.another.one;

public class B extends A{
	static {
		System.out.println("Class B static");
	}
	{
		System.out.println("Class B instance");
	}
}
