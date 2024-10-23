package com.cdac.another.one;

public class Tester {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.cdac.another.one.A");
		
		C c = new C();
		
		A a = new A();
		
	}

}
