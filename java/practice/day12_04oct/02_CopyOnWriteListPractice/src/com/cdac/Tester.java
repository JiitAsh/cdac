package com.cdac;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new CopyOnWriteArrayList<> ();
//		List<Integer> al = new ArrayList<> ();
		al.add(12);
		al.add(23);
		al.add(34);
		System.out.println(al);
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//			
//			al.add(100 + i);
//		}
//		for(Integer i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//			
//			al.add(100 + i);
//		}
		for(Integer val : al) {
			System.out.println(val);
			al.add(100 + val);
		}
//		
//		
//		CopyOnWriteArrayList<Integer> cwal = new CopyOnWriteArrayList<>();
//		cwal.add(23);
//		cwal.add(12);
//		cwal.add(34);
//		System.out.println(cwal);
////		for(int i=0;i<cwal.size();i++) {
////			System.out.println(cwal.get(i));
////			cwal.add(i+100);
////		}
//		
//		
//		for(Integer val:cwal) {
//			System.out.println(val);
//			cwal.add(val*12 + 100);
//		}
		
	}

}
