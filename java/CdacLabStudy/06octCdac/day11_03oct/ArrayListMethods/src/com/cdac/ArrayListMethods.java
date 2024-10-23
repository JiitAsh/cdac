package com.cdac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// ArrayList/List to Array(simple Array)
////		int[] arr = {12,23,33,34,56};   // int won't be acceptable by ArrayList that's why use Integer.
//		Integer[] arr = {12,23,33,34,56};
//		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
////		System.out.println(arr.toString());		
//		System.out.println(al);		
		
		
		// Array(simple array) to List/ArrayList
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(23);
		al.add(10);
		al.add(845);
		al.add(54);
		System.out.println(al);
		
//		// ArrayList/list to Array(simple Array)
//		Object[] arr = al.toArray();    
////		String str = Arrays.toString(arr);
////		System.out.println(str.charAt(0));
////		System.out.println(str.charAt(1));
////		Integer[] arr = {12,23,33,34,56};
//		Integer[] arr = (Integer[]) al.toArray();  // toArray() returns Object so cast into Integer
//		System.out.println(Arrays.toString(arr));
		
//		ArrayList<Integer> al1 = new ArrayList<>();
//		al1.add(12);
//		al1.add(23);
//		al1.add(10);
//		al1.add(845);
//		al1.add(54);
//		System.out.println(al1);
//		Integer arr[] = al1.toArray();
//		System.out.println(Arrays.toString(arr));
		
		
		
		// reverse method 
//		Collections.reverse(al);
//		System.out.println(al);
		
		// swap method
//		Collections.swap(al, 2, 4);
//		System.out.println(al);
		
		
		// sort method
//		Collections.sort(al);
//		System.out.println(al);
		
		
		// program to interface not to implementation
//		List<Integer> al1 = new LinkedList<>();   // now list is LinkedList but can be reuse it as ArrayList in future
//		al1.add(12300);
//		al1.add(12000);
//		al1.add(10000);
//		System.out.println(al1);
//		
//		al1 = new ArrayList<> ();   // now List is ArrayList
//		al1.add(9000);
//		al1.add(1240);
//		al1.add(9050);
//		al1.add(8400);
//		System.out.println(al1);

		// Array to List (use Arrays.asList direct)
//		Integer[] arr = {12,23,33,34,56}; 
//		List<Integer> listArr = Arrays.asList(arr);
//		System.out.println(listArr);
		
		//create arraylist from other arraylist
		//ArrayList<Integer> al2 = new ArrayList<> (al);    // using ArrayList<>
//		List<Integer> al2 = new ArrayList<> (al);   // using List<>
//		System.out.println(al2);
		
		//shuffling elements using shuffle
//		Collections.shuffle(al);
//		System.out.println(al);
		
		//fill all the elements with x
		Collections.fill(al, 1001);
		System.out.println(al);
 	}

}
