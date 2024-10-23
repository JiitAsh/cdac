package com.cdac;

import java.time.LocalDate;

public class LocalDatePrac {
	public static void main(String ...args) {
		LocalDate todaysDate = LocalDate.now();
		System.out.println(todaysDate);
		
		// minus date 
		todaysDate = todaysDate.minusYears(21);
		System.out.println(todaysDate);
		
		LocalDate yesterday = LocalDate.parse("2024-10-07");
		System.out.println(yesterday);
		System.out.println(yesterday.withMonth(02));
		
		
		
	}
}
