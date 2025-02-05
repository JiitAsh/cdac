package com.cdad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		Student s1 = new Student(31,"Ram");
		Student s2 = new Student(12,"Shyam");
		Student s3 = new Student(15,"Ramesh");
		Student s4 = new Student(74,"Kaam");
		
		List<Student> sl = new ArrayList<>();
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		sl.add(s4);
		for(Student std : sl) {
			System.out.println(std);
		}
		
		System.out.println("\n******Sorting based on roll no******");
		
		
		Collections.sort(sl,new RollNoComparator());
		for(Student std : sl) {
			System.out.println(std);
		}
		
		System.out.println("\n******Sorting based on name*****");
		
		
		Collections.sort(sl,new NameComparator());
		for(Student std : sl) {
			System.out.println(std);
		}
	}

}
