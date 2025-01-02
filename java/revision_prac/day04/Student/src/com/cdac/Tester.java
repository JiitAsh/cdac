/*
 * Write a menu driven program to add Student objects in an array of students.

1. Add Student
2. Print Student by rollNo
3. Print All students Sorted by Marks
0. exit
*/

package com.cdac;

import java.util.Scanner;

import com.cdac.Student;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello Programmer :)");
		System.out.print("Enter size of the array: ");
		int size = sc.nextInt();
		Student[] studentList = new Student[size];

		int option = 0;
		int index = 0;
		do {
			System.out.println("Select an optoin!!\n");
			System.out.println(
					"1.Add Student\n2.Print Student by roll No.\n3.Print All Students Sorted by marks.\n0.exit\n");
			option = sc.nextInt();

			switch (option) {
			case 1: {
				Operations.addStudent(studentList, index++, sc, size);

			}
				break;

			case 2: {
				String details = Operations.getDetailsByRollNo(studentList, index++, sc, size);
				System.out.println(details);
			}
				break;

			case 3: {
				Operations.sortByMarks(studentList, index, size);
			}
				break;

			}
		} while (option != 0);

		sc.close();
	}
}
