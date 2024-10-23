package com.cdad;

public class Student {
	private Integer rNo;
	private String name;
	
	public Student(Integer rNo, String name) {
		super();
		this.rNo = rNo;
		this.name = name;
	}
	
	
	public Integer getrNo() {
		return rNo;
	}
	public void setrNo(Integer rNo) {
		this.rNo = rNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rNo=" + rNo + ", name=" + name + "]";
	}


	
}
