package com.cdac;

import java.util.Scanner;

public class TesterScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		System.out.println(val);
		
		sc.close();
		
		Scanner sc2 = new Scanner(System.in);
		int val2 = sc2.nextInt();
		System.out.println(val2);
		
		sc2.close();
	}

}