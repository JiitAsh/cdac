package com.cdac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.Comparator;

public class ComparatorLambdaTester {

	public static void main(String[] args) {
		System.out.println("Hello Programmer :)");
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
		
		// lambda expression for rNo Comparator
		Comparator<Student> rNoComparator = (std1, std2)->std1.getrNo().compareTo(std2.getrNo());
		
		//sorting based on rNo
		Collections.sort(sl,rNoComparator);
		
		System.out.println("\n**********sorting based on rNo***********");
		for(Student s:sl) {
			System.out.println(s);
		}
		
		
		// lambda expression for name Comparator
		Comparator<Student> nameComparator = (std1,std2)->std1.getName().compareTo(std2.getName());
		
		//sorting based on name
		Collections.sort(sl,nameComparator);
		System.out.println("\n**********sorting based on name***********");
		for(Student s:sl) {
			System.out.println(s);
		}
		
		
	}

}
