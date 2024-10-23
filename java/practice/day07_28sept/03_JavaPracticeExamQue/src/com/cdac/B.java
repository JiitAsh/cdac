package com.cdac;

public class B extends A {
	
	
	// as show1() is private in A and not visible by B so here B will create it's new show1(), remember it's not overridden it's new method of B

	private void show1() {
		System.out.println("You are in B's show1 method!!");
	}
	
	
	// as show2() is private in A and not visible by B so here B will create it's new show2(), remember it's not overridden it's a new method of B and here the keyword 'final' has no meaning. bcz it's superior 'private' is present
	final private void show2() {
		System.out.println("You are in B's show2 method!!");
	}
	
	
	// will show error bcz show3() is final in A and can not be override
//	public final void show3() {
//		System.out.println("You are in B's show3 method!!");
//	}
//	

}
