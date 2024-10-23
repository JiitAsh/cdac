package com.cdac;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcTester2 {


	public static void main(String[] args) throws ParseException{

//		//NumberFormatException is unchecked exception
//		try {
//		short s = Short.parseShort("Hi"); 
//		System.out.println(s);
//		} catch (NumberFormatException ne) {
//			ne.printStackTrace();
//		}
//
//		// ParseException is checked exception
//		try {
//			//Program to interface or abstract class but not to concrete class
//			DateFormat sdf = new SimpleDateFormat();
//			Date d = sdf.parse("Hi");
//			System.out.println("Try complete");
//		} finally {
//			System.out.println("Finally complete");	
//		}
		
		
		
		
		
		
		//NumberFormatException is unchecked exception
				try {
					System.out.println("try exc.");
				short s = Short.parseShort("Hi"); 
				System.out.println(s);
				} catch (NumberFormatException ne) {
					System.out.println("catch exc.");
					ne.printStackTrace();
					System.out.println("catch exc.");
				}
		

				// ParseException is checked exception
				try {
					//Program to interface or abstract class but not to concrete class
					DateFormat sdf = new SimpleDateFormat();
					Date d = sdf.parse("Hi");
					System.out.println("Try complete");
				} finally {
					System.out.println("Finally complete");	
					System.out.println("finally exec.");
				}
	}
}