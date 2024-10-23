package com.cdac.interfaceexample.Tester;
import com.cdac.interfaceexample.Mylist;
import com.cdac.interfaceexample.Exception.ArrayIndexFull;
import com.cdac.interfaceexample.ListClasses.FixedList;
import com.cdac.interfaceexample.ListClasses.GrowableList;

import java.util.Scanner;
public class MylistTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Mylist fixedList = new FixedList();
		for(int i = 0; i < 6; i++) {
			System.out.println("Please Enter element: ");
			int element = sc.nextInt();
			try {
				fixedList.insert(element);
			} catch (ArrayIndexFull e) {
				System.out.println("Your List is full");
				break;
			}
		}
		System.out.println("Enter index to retrive element: ");
		int indx = sc.nextInt();
		System.out.println(fixedList.retrive(indx));
	//	System.out.println(fixedList.toString());
		/*
		Mylist growable = new GrowableList();
		for(int i = 0; i < 10; i++) {
			System.out.println("Please Enter element: ");
			int element = sc.nextInt();
			growable.insert(element);
		}
		System.out.println(growable.retrive(6));*/
}
}