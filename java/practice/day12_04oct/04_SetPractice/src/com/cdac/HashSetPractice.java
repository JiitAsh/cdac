package com.cdac;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class HashSetPractice {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		System.out.println("Hi " + "Hi".hashCode());
		hs.add("Hi");
		System.out.println("Hello " + "Hello".hashCode());
		hs.add("Hello");
		System.out.println("Hello " + "Hello".hashCode());   
		hs.add("Hello");  // duplicate entry, but set won't accept this(only unique)
		System.out.println("Hey " + "Hey".hashCode());
		hs.add("Hey");
		System.out.println("How are you " + "How are you".hashCode());
		hs.add("How are you");
		System.out.println("Hey there " + "Hey there".hashCode());
		hs.add("Hey there");
		
		//direct printing
		System.out.println("\n********Direct printing (using System.out.println(hs)**********");
		System.out.println(hs);
		
//		//using enhanced for loop
//		System.out.println("\n********Using enhanced for loop**********");
//		for(String val:hs) {
//			System.out.println(val);
//		}
		
//		//using iterator
//		System.out.println("\n********Using Iterator**********");
//		Iterator<String> it = hs.iterator();
//		//ListIterator<String> it = hs.listIterator();   // ListIterator won't work with hashSet bcz ListIterator only for List
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		//using forEach
//		System.out.println("\n********Using forEach**********");
//		hs.forEach(System.out::println);
		
		
		System.out.println("\nSize is " + hs.size()+ "\n");
		
		//can't use normal for loop
//		for(int i=0;i<hs.size();i++) {
//			System.out.println(hs[i]);
//		}
		
		
		Set<String> hs1 = new HashSet<>();
		System.out.println("Hi " + "Hi".hashCode());
		hs1.add("Hi");
		System.out.println("Hello " + "Hello".hashCode());
		hs1.add("Hello");
		System.out.println("Hey " + "Hey".hashCode());
		hs1.add("Hey");
		System.out.println("How are you " + "How are you".hashCode());
		hs1.add("How are you");
		System.out.println("Hey there " + "Hey there".hashCode());
		hs1.add("Hey there");
		System.out.println("Bye "+"Bye".hashCode());
		hs1.add("Bye");
		
		//direct printing
		System.out.println("\n********Direct printing (using System.out.println(hs)**********");
		System.out.println(hs1);
		
		System.out.println("\nSize is " + hs.size()+ "\n");
		
		
	}

}
