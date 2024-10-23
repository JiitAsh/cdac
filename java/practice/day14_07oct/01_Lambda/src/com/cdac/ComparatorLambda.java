package com.cdac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String[] args) {
		System.out.println("Hello Programmer:)");
		Student s1 = new Student(12,"Ram");
		Student s2 = new Student(42,"Shyam");
		Student s3 = new Student(98,"Ramesh");
		Student s4 = new Student(45,"Kartik");
		Student s5 = new Student(19,"Yash");
		
		List<Student> sl = new ArrayList<>();
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		sl.add(s4);
		sl.add(s5);
		
		for(Student s:sl) {
			System.out.println(s);
		}
		
		
		System.out.println("\n******Sorting by name********");
		Comparator<Student> nameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Collections.sort(sl,nameComparator);
		for(Student s:sl) {
			System.out.println(s);
		}
		
		System.out.println("\n******Sorting by rNo********");
		Comparator<Student> rNoComparator = (o1, o2) -> o1.getrNo().compareTo(o2.getrNo());
		Collections.sort(sl,rNoComparator);
		for(Student s:sl) {
			System.out.println(s);
		}
	}

}
