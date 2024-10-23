package com.batch;
import com.batch.student.Student;
import java.util.Scanner;
public class StudentMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name;
		Float marks;
		System.out.print("Enter name : ");
		name=sc.nextLine();
		System.out.print("Enter marks : ");
		marks=sc.nextFloat();
		sc.nextLine();   // eater so that we can take input for student 2
		
		Student s1 = new Student(name,marks);
		s1.display();
		
		
		// for student 2
		System.out.print("Enter name : ");
		name=sc.nextLine();
		System.out.print("Enter marks : ");
		marks=sc.nextFloat();
		sc.nextLine();
		
		Student s2 = new Student(name,marks);
		s2.display();
		
		sc.close();
	}
}