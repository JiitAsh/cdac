package com.cdac;

public class Student {
	private int rNo;
	private String name;
	private double marks;

	Student() {
		rNo = 0;
		name = "";
		marks = 0.0;
	}

	public int getRno() {
		return this.rNo;
	}

	public double getMarks() {
		return this.marks;
	}

	Student(int rNo, String name, double marks) {
		this.rNo = rNo;
		this.name = name;
		this.marks = marks;
	}

	public String getDetails() {
		return "\nRoll No: " + this.rNo + "\nName : " + this.name + "\nMarks : " + this.marks + "\n";
	}

}
