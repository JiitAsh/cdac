package com.cdac.acts;

public class Derived extends Base{

	@Override
	public Integer method1() {
		return 200;
	}
	
	@Override
	public void method1(Number number) {
		System.out.println(number);
	}
}