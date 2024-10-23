package com.cdac;


import java.util.List;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class LambdaTester {

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
			//System.out.println(s.toString()); // without toString will also work bcz println automatically calls toString()
			System.out.println(s);
		}
		
		
		// sorting based on rNo
		Collections.sort(sl,(std1,std2)->std1.getrNo().compareTo(std2.getrNo()));
		
		System.out.println("\n**********Sorting based on rNo***********");
		for(Student s:sl) {
			System.out.println(s);
		}
		
		
		// sorting based on name
		Collections.sort(sl,(std1,std2)->std1.getName().compareTo(std2.getName()));
		
		System.out.println("\n**********Sorting based on name***********");
		for(Student s:sl) {
			System.out.println(s);
		}
		
		
		// Function<R,T> --->  lambda for R apply(T t)
		// name in upper case
		System.out.println("\n************NAME IN UPPER CASE**********");
//		for(Student s:sl) {
//			String name = s.getName();
//			Function<String, String> nameUpper = (n) -> n.toUpperCase();
//			System.out.println(nameUpper.apply(name));
//		}
		
		Function<String,String> nameUpper = (n) -> n.toUpperCase();
		for(Student s:sl) {
			System.out.println(nameUpper.apply(s.getName()));
		}
		
		
		// lambda for "void accecpt(T t)" of "Consumer<T>" interface
//		Consumer<Student> accLam = (s) -> System.out.println(s.toString());
//		for(Student s:sl) {
//			s.
//		}
	}

}
