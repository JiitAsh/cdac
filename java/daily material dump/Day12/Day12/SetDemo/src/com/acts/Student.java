package com.acts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
	
	public static final String EMPTY_STRING = "";
	
	private Integer rollNo;
	private String name;
	private Course course;
	//New feature java 8 (yyyy-MM-dd)
	private LocalDate dob;
	
	public Student() {
		this.rollNo = 0;
		this.name = EMPTY_STRING;
		this.dob = null;
		this.course = null;
	}
	
	public Student(int rollNo, String name, LocalDate dob, Course course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.course = course;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", dob=" + dob  + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.rollNo.compareTo(o.rollNo); // ASC
		//return o.rollNo.compareTo(this.rollNo); // DSC
	}
	
	@Override
	public int hashCode() {
		 int readyHash = Objects.hash(course, dob, name, rollNo);
		 System.out.println("Ready hash "+ name + "" + readyHash);
		//return Objects.hash(course, dob, name, rollNo);
//		int result = 1;
//        result = 31 * result + (course == null ? 0 : course.hashCode());
//        result = 31 * result + (dob == null ? 0 : dob.hashCode());
//        result = 31 * result + (name == null ? 0 : name.hashCode());
//        result = 31 * result + (rollNo == null ? 0 : rollNo.hashCode());
//        
//        System.out.println("My hash "+ name + "" + result);
        return readyHash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return course == other.course && Objects.equals(dob, other.dob) && Objects.equals(name, other.name)
				&& Objects.equals(rollNo, other.rollNo);
	}

}
