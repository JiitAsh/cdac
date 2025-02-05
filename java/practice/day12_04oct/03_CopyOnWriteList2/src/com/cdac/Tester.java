package com.cdac;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.LinkedList;
import java.util.Iterator;
public class Tester {

	public static void main(String[] args) {
		System.out.println("Hello Proagrammer :)");
		List<Integer> linkedList = new LinkedList<>();
		linkedList.add(12);
		linkedList.add(10);
		linkedList.add(198);
		linkedList.add(21);
		linkedList.add(134);
		
		System.out.println(linkedList);
		
//		for(int i=0;i<linkedList.size();i++) {       //in every iteration we are adding a new element that's why size is increasing after every iteration.  so it will become an infinite loop
//			System.out.println(linkedList.get(i));
//			linkedList.add(i*23 + i+100);
//		}
//		
//		for(Integer val:linkedList) {   //in every iteration we are adding a new element that's why size is increasing after every iteration.  so it will become an infinite loop
//			System.out.println(val);
//			linkedList.add(val*23+val+100);
//		}
		
		
		
		List<Integer> cowal = new CopyOnWriteArrayList<>();
		cowal.add(10);
		cowal.add(78);
		cowal.add(18);
		cowal.add(25);
		cowal.add(14);

		System.out.println(cowal);


//		for(int i=0; i < cowal.size(); i++) {       //in every iteration we are adding a new element that's why size is increasing after every iteration. So it will become an infinite loop  and CopyOnWriteArrayList does not work with normal loop, use enhanced loop
//		    System.out.println(cowal.get(i));
//		    cowal.add(i * 23 + i + 100);
//		}

//		for(Integer val : cowal) {     // copyOnWriteArrayList works with enhanced loop, it will create an copy and will perform task normally and at the end the copied list will append to the main list
//		    System.out.println(val);
//		    cowal.add(val * 23 + val + 100);
//		}
//		
//		System.out.println(cowal);
		
		
//		// copyOnWriteArrayList works with iterator loop too
//		Iterator<Integer> it = cowal.iterator();
//		//ListIterator<Integer> it = cowal.listIterator();
//		
//		while(it.hasNext()) {      // copyOnWriteArrayList works with iterator loop too
//			
//			System.out.println(it.next());
//			cowal.add(100); 
//		}
//		
//		System.out.println(cowal);
		
		
		
		
		// remove() only works with enhanced loop and not works with iterator loop
		
//		Iterator<Integer> it = cowal.iterator();
//		//ListIterator<Integer> it = cowal.listIterator();
//		
//		while(it.hasNext()) {      // copyOnWriteArrayList works with iterator loop too
//			
//			System.out.println(it.next());
//			it.remove();
//		}
		
		
		System.out.println(cowal);
		
		//remove() works with enhanced loop
 		for(Integer val:cowal) {
			cowal.remove(val);
			System.out.println(val);
			
		}
		
		System.out.println(cowal);
		
		
		
	}

}
