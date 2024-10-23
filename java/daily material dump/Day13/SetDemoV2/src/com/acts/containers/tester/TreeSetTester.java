package com.acts.containers.tester;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.acts.Student;

public class TreeSetTester {

	public static void main(String[] args) {
		//Create TreeSet
		Set<String> set1 = new TreeSet<String>();
		//Add elements
		set1.add("Tata");
		set1.add("Hello");
		set1.add("Hello");
		set1.add("How are you");


		System.out.println("*******Enhanced for***********");
		for(String value : set1) {
			System.out.println(value); 
		}
		
		//Anonymous inner class implementing Comparator
		Comparator<String> descComparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}

		};
		
		Set<String> set2 = new TreeSet<String>(descComparator);
		//Add elements
		set2.add("Tata");
		set2.add("Hello");
		set2.add("Hello");
		set2.add("How are you");

		System.out.println("*******Advanced for***********");
		for(String value : set2) {
			System.out.println(value); 
		}
		
	}

}
