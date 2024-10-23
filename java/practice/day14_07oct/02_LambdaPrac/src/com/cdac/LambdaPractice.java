package com.cdac;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;  // java.util.function is package and Function is Interface and almost all interfaces are in java.util.function package
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaPractice {

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
		
		//lambda for "R apply(T r)" of "Interface Function<T,​R>" interface
		Function<Student, String> getNameApply = (std)-> std.getName();
		System.out.println("\n*********Student Names*********");
		for(Student s:sl) {
			System.out.println(getNameApply.apply(s));
		}
		
		//lambda for "R apply(T r)" of "Interface Function<T,​R>" interface
		Function<Student, Integer> getrNoApply = (std)-> std.getrNo();
		System.out.println("\n*********Student roll numbers*********");
		for(Student s:sl) {
			System.out.println(getrNoApply.apply(s));
		}
		
		
		// lambda for "R apply(T t, U u)" of "BiFunction<T,U,R>" interface
		BiFunction<String,Integer,String> bf = (stdName, rollNo) -> stdName + " " + rollNo.toString();
		System.out.println("\n*******BiFunction lambda*******");
		for(Student s:sl) {
			String sName = s.getName();
			Integer srNo = s.getrNo();
			System.out.println(bf.apply(sName, srNo));
		}
		
		
		//lambda for "boolean test(T t)" of "Predicate<T>" interface
		Predicate<Student> prdct = (std)->std.getName().equals("Shyam");
		System.out.println("\n********Predicate test(T t)*******");
		for(Student s:sl) {
			System.out.println("This student is Shyam: " + prdct.test(s));
		}
		
		//lambda for "boolean test(T t, U u)" of "BiPrdicate<T, U>" interface
		BiPredicate<Student, String> biprdct = (std, name) -> std.getName().equals(name); 
		System.out.println("\n******BiPredicate test(T t, U u)*********");
		for(Student s:sl) {
			System.out.println("This is Ram: " + biprdct.test(s, "Ram"));
		}
		
		
		//lambda for "boolean test(double val)" of DoublePredicate interface
		DoublePredicate dblPrdct = (val)->{ if((val%1.5) == 0) {
												return true;
											}
											return false;
											};
		System.out.println("\n******DoublePredicate******");
		for(int i=0;i<10;i++) {
			System.out.println(i+0.5 + " is divided by 1.5: " + dblPrdct.test(i+0.5));
		}
		
		
		//lambda for "void accept(T t)" of "Consumer<T>" interface
		Consumer<Student> consumerAccept = (std) -> System.out.println("Hi " + std.getName()); 
		System.out.println("\n*******Consumer accept(T t)*********");
		for(Student s:sl) {
			consumerAccept.accept(s);
		}
			
		//lambda for "T get()" of "Supplier<T>" interface
		Supplier<Integer> supplierGet = ()-> 23+89;
		System.out.println("\n****Supplier get()   :) *******");
		System.out.println(supplierGet.get());
		
		
		
		
		// for each 
		System.out.println("\n*******For Each******");
		sl.forEach(System.out::println);
		
		// forEach for "void accecpt(T t)" 
		System.out.println("\n*******For Each Consumer's \"void accept(T t)\" method usint lambda******");
		Consumer<Student> cnsmrAccept = (std)->System.out.println(std);
		sl.forEach((s)->System.out.println(s));
		
		
		// forEach 2nd version of above printing statement
		System.out.println("\n*******For Each Consumer's \"void accept(T t)\" method usint lambda******");
		sl.forEach(cnsmrAccept);
		
		
		// forEach to print student's name(only) not full toString
		System.out.println("\n*******forEach to print cusomize loop******");
		sl.forEach((s)->{int changedRno = s.getrNo()+10;
						 String changedName = s.getName()+" Sharma";
						 System.out.println("Hi " + changedName + ", your rNo changed and now it is: " + changedRno);});
		
		
	}

}
