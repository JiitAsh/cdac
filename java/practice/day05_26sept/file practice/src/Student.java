package com.jitesh.kumawat;
public class Student{
	private int rNo=1000;
	private String name;
	public Student(){
		rNo++;
		name="";
	}
	
	public Student(String name){
		rNo++;
		this.name=name;
	}
	
	public String showDetails(){
		return "rNO: " + rNo + " \nname: " + name;
	}
}