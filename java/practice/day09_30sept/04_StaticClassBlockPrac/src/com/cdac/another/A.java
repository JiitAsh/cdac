package com.cdac.another;

public class A {
	static {
		System.out.println("Class A Static");
	}
	
	{
		System.out.println("Class A non-static");
	}
}
