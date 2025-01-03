package com.cdac;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection<E> (I) --> List<E> (I)  --> ArrayList<E> (C)
		//ArrayList<int> al = new ArrayList<int> ();  // will create error bcz 'int' is not acceptable
		ArrayList<Integer> al = new ArrayList<Integer> ();
		System.out.println(al.size());
		// adding element
		al.add(null);
		al.add(12);
		al.add(23);
		al.add(null);
		al.add(23);
		al.add(-12);
		
		// direct printing 
		System.out.println(al);  
		
		// adding at index (index <= size)
		al.add(4,245);   // simply replaced the value
		al.add(6,90);    
		al.add(8,10);
		al.add(9,12);
		al.add(10,50);
		al.add(11,52);
//		al.add(13,5);
		al.add(12,23);
//		al.add(19,45);
//		al.add(34,68);
//		
		// direct printing 
		System.out.println(al);  
		
		// size method
		int size = al.size();   
		
		// using for loop
		for(int i=0;i<size;i++) {   
			System.out.print(al.get(i) + " ");
		}
		
		//line break
		System.out.println();
		
		// forward iterator   
		ListIterator<Integer> it = al.listIterator();
		while(it.hasNext()) {
			Integer val = it.next();
			System.out.print(val + " ");
		}
		
		//line break
		System.out.println();
		
		// forward iterator  from given index (inclusive) 
		ListIterator<Integer> itwi = al.listIterator(2);
		while(itwi.hasNext()) {
			Integer val = itwi.next();
			System.out.print(val + " ");
		}
		
		//line break
		System.out.println();
				
		// backward iterator
		ListIterator<Integer> itb = al.listIterator(al.size());
		while(itb.hasPrevious()) {
			System.out.print(itb.previous() + " ");
		}
		
		//line break
		System.out.println();
		
		// backward iterator from given index (not inclusive)
		ListIterator<Integer> itbwi = al.listIterator(4);
		while(itbwi.hasPrevious()) {
			System.out.print(itbwi.previous() + " ");
		}
		
		// in hasNext it simply return the current index value but in hasPrevious it returns previous element not current so when we are passing al.size() then it's size is 6 but it will return the values from index 5. but in hasNext it will return from 0th index (or from given index).
	}

}
