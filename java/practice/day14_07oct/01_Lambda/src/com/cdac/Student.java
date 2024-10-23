package com.cdac;

public class Student {
	private Integer rNo;
	private String name;
	
	public Student(int rNo, String name) {
		super();
		this.rNo = rNo;
		this.name = name;
	}
	
	public Integer getrNo() {
		return rNo;
	}
	
	public void setrNo(int rNo) {
		this.rNo = rNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [ rNo=" + rNo
				+ " name=" + name
				+ " ]";
	}
	
}
