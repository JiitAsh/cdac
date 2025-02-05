package com.acts.jvm;

import java.io.Serializable;

public class Student implements Serializable{
	private int rollNo;
	private String name;
	
	
	public Student() {
		super();
	}
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called for " + this);
	}

}
