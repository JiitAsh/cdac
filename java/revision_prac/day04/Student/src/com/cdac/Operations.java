package com.cdac;

import java.util.Scanner;

public class Operations {
	public static void addStudent(Student[] studentList, int index, Scanner sc, int size) {
		if (index == size) {
			System.out.println("sorry can not add student, size is full!!");
			return;
		}

		sc.nextLine(); // eater
		System.out.print("Enter student name: ");
		String name = sc.nextLine();
		System.out.print("Entet roll no: ");
		int rNo = sc.nextInt();
		System.out.print("Enter marks: ");
		double marks = sc.nextDouble();

		Student std = new Student(rNo, name, marks);
		studentList[index] = std;
	}

	public static String getDetailsByRollNo(Student[] studentList, int index, Scanner sc, int size) {
		System.out.print("Enter roll no: ");
		int rNo = sc.nextInt();

		for (int i = 0; i < size && studentList[i] != null; i++) {
			if (studentList[i].getRno() == rNo) {

				return studentList[i].getDetails();
			}
		}

		return "Student Not Registered!!\n";
	}

	public static void sortByMarks(Student[] studentList, int index, int size) {
		// assuming that if there is no student on index 0th then list is empty, then
		// return
		if (studentList[0] == null) {
			System.out.println("No student registered yet!!");
		}

		Student[] tempStudentList = studentList.clone();

		for (int i = 0; i < size && tempStudentList[i] != null; i++) {
			boolean isSorted = true;
			for (int j = i + 1; j < size && tempStudentList[j] != null; j++) {
				if (tempStudentList[i].getMarks() >= tempStudentList[j].getMarks()) {
					isSorted = false;
					Student tempStudent = tempStudentList[i];
					tempStudentList[i] = tempStudentList[j];
					tempStudentList[j] = tempStudent;
				}

			}

			if (isSorted) {
				break;
			}
		}

		for (int i = 0; i < size && tempStudentList[i] != null; i++) {
			System.out.println(tempStudentList[i].getDetails());
		}

	}
}
