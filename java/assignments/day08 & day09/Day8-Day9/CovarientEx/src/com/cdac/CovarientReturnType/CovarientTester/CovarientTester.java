package com.cdac.CovarientReturnType.CovarientTester;

import com.cdac.CovarientReturnType.IntegerClass;

public class CovarientTester {
	public static void main(String[] args) {
		Number a = 10;
		Number b = 20;
		IntegerClass c1 = new IntegerClass();
		System.out.println(c1.addNumber( a, b ));
	}
}
