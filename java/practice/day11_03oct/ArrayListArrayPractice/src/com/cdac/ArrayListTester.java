package com.cdac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListTester {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(34);
		al.add(345);
		al.add(56);
		System.out.println(al);
		
		Object[] arr = al.toArray(); 
//		Integer[] iarr = (Integer[]) arr; // it won't work
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		List<Integer> unmodList = Collections.unmodifiableList(al);  // unmodifiable List
		//unmodList.set(1, 192);    // java.lang.UnsupportedOperationException
		//unmodList.add(1299);   // java.lang.UnsupportedOperationException
		System.out.println(unmodList);   
 	}

}
