package com.cdac;

import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter something");
//		int i = sc.nextInt();
//		String s = sc.next();
//		String str = sc.nextLine();
//		Integer val = null;
		if(System.in.equals(System.out)) {
			System.out.println("System.in and System.out both are public CONSTANTS and have \"null\" values");
		}else {
			System.out.println("Something went wrong ;(");
		}
//		System.out.println(val);
		
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println((char) 100); 
		System.out.print("Enter a number:");
		int l = isr.read();
		System.out.println((char) l);
		l = isr.read();
		System.out.println((char) l);
		l = isr.read();
		System.out.println((char) l);
		l = isr.read();
		
		isr.close();
//		InputStreamReader isr2 = new InputStreamReader(System.in);
//		Scanner sc = new Scanner(System.in);
//		int val = sc.nextInt();
//		System.out.println(val);
		
		
		/* it will also show error
//		InputStreamReader isr2 = new InputStreamReader(System.in);
//		int ll = isr.read();
//		System.out.println((char) ll);
//		
//		isr2.close();
 * */
 
		
//		sc.close();
	}

}
