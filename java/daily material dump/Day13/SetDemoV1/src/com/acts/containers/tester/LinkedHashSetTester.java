package com.acts.containers.tester;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetTester {

	public static void main(String[] args) {
		//Create HashSet
		List<String> list = new ArrayList<>();
		//Add elements
		list.add("Hi");
		list.add("hello");
		list.add("hello");
		list.add("hello");
		list.add("hello");
		list.add("hello");
		list.add("hello");
		list.add("How are you");


		System.out.println("*******Advanced for***********");
		for(String value : list) {
			System.out.println(value); 
		}
		
		Set<String> hashSet = new LinkedHashSet<>();
		//Add elements from other arrayList
		hashSet.addAll(list);


		System.out.println("*******Advanced for***********");
		for(String value : hashSet) {
			System.out.println(value); 
		}
	}

}
