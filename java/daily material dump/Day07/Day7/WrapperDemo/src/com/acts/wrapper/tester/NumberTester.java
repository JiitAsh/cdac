package com.acts.wrapper.tester;

public class NumberTester {
	public static void main(String[] args) {
	short sp = 10;
	System.out.println(sp);
	//Wrapper : object equivalent of primitive ( boxed primitive)
	// Auto Boxing
	Short s1 = 10; 
	System.out.println(s1);
	
	// Auto Un boxing
	short sp2 = s1; 
	System.out.println(sp2);
	
	//Boxing  short --> Short ( primitive to object)
	Short s3 = Short.valueOf(sp);
	System.out.println(s1);
	
	//UnBoxing Short ---> short ( object to primitive)
	short  sp3 = s3.shortValue();
	
	//String to short
	short s5 = Short.parseShort("5");
	
	//String to int
	int i = Integer.parseInt("100");
	//NFE
	int i1 = Integer.parseInt(null);
	System.out.println(i1);

	}

}
