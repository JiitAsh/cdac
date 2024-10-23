package com.cdac.acts;

public class B extends A {
	static {
		str = "Inside B static block";
	}
	
	{
		str = "Inside B non-static block";
	}
}
