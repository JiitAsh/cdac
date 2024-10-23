package com.acts.containers.tester;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteSetTester {

	public static void main(String[] args) {
		//Create TreeSet
		Set<String> set1 = new CopyOnWriteArraySet<String>();
		//Add elements
		set1.add("Tata");
		set1.add("Hello");
		set1.add("Hello");
		set1.add("How are you");


		System.out.println("*******Enhanced for***********");
		for(String value : set1) {
			System.out.println(value); 
			set1.add(value.toUpperCase());
		}
		
		
		System.out.println("*******Enhanced for2***********");
		for(String value : set1) {
			System.out.println(value); 
		}
	}

}
