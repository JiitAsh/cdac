package com.acts.containers.tester;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.acts.DataUtils;
import com.acts.Student;

public class ListToSetTester {

	public static void main(String[] args) {
		List<Student> list = DataUtils.getStudentList();
		for(Student student : list) {
			System.out.println(student);
		}

		System.out.println("***********************");
		Set<Student> set = new HashSet<>(list);
		for(Student student : set) {
			System.out.println(student);
		}


	}

}
