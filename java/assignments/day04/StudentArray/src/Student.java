package com.jitesh;
public class Student{
	private int rNo;
	private String name;
	private double marks;
	private static int cnt=1;
	
	public Student(){
		rNo=cnt++;
	}
	
	public Student(String name, double marks){
		this.name=name;
		this.marks=marks;
	}
	
	public void display(){
		System.out.println("Student details are [ rNo = " + rNo + " name = " + name + " marks = " + marks + " ]");
	}
}