package com.batch.student;
public class Student{
	private int rNo;
	private String name;
	private float marks;
	private static int rNoCounter = 1;
	
	public Student(String name, float marks){
		this.rNo = rNoCounter++;
		this.name = name;
		this.marks = marks;
	}
	
	public void display(){
		System.out.println("Student details : [ rNo=" + rNo + " name=" + name + " marks=" + marks + " ]");
	}
}