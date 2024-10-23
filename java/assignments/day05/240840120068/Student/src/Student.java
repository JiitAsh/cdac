package com.cdac.acts;

public class Student{
	private String name;
	private int rNo;
	public Student(String name, int rNo){
		this.rNo=rNo;
		this.name=name;
	}
	@Override
	public String toString()
	{
		return "name is : " + name +" and rNo is : " + rNo;
	}
}