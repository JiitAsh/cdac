package com.acts.containers.tester;

import java.util.ArrayList;
import java.util.List;

import com.acts.pojos.Address;
import com.acts.pojos.Student;

public class StudentListTester {

	public static void main(String[] args) {
		List<Student> studentsList = new ArrayList<>();
		//Create Student and add in List
		Address address = new Address("Acts", "CDAC", "pashan", "433401");
		Student s = new Student(1234, "Ganesh", "DAC", address);
		studentsList.add(s);
		
		Address address1 = new Address("Sunbeam", "CDAC", "Marketyard", "433401");
		Student s1 = new Student(1235, "Dinesh", "DAC", address1);
		studentsList.add(s1);
		
		Address address2 = new Address("KnowIT", "CDAC", "Deccan", "433401");
		Student s2 = new Student(1234, "Jignesh", "DAC", address2);
		studentsList.add(s2);
		
		Address address3 = new Address("IACSD", "CDAC", "Akurdi", "433401");
		Student s3 = new Student(1234, "Prathmesh", "DAC", address3);
		studentsList.add(s3);
		
		//print student
		System.out.println(studentsList);

	}

}
