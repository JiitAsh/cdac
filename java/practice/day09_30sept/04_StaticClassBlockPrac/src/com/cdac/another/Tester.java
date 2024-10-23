package com.cdac.another;

public class Tester {

	public static void main(String[] args) {
		// static block will execute only once, but non static block will execute every time when an obj/instance is created
		A a = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
	}

}
