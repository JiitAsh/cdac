package day6;

import java.util.Date ;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Student {
	private int rollNo;
	private String name;
	private int marks ;
	private Date dob ;
	private CourseEnum ce ;
	
	private static int referenceRollNo = 100 ;
	
	
	public Student () {
		this.rollNo = referenceRollNo++ ;
		this.name = "" ;
		this.marks = 0 ;
		dob = null ;
	}
	
	public Student (String name , int marks, Date dob, CourseEnum ce) {
		this.rollNo = referenceRollNo++ ;
		this.name = name ;
		this.marks = marks ;
		this.dob = dob ;
		this.ce = ce ;
		
	}
	
	public static String getFormattedDate(Date date) {
		if(date != null) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy") ;
		return sdf.format(date) ;
		}
		return "Date is given Null" ;
	}
	
	public static Date getDate(String date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy") ;
		return sdf.parse(date) ;
	}
	
	public int getRollNo() {
		return rollNo ;
	}
	
	public int getMarks() {
		return marks ;
	}
	public Date getNormalDate() {
		return dob ;
	}
	public String toString() {
		return "Student" + " [" + "rollNo : " + rollNo + ", name : " + name + ", marks : " + marks + ", DateOfBirth : " +  Student.getFormattedDate(dob) 
		+ ", Course : " + ce.getValue() + " ]" ;
		
	}
	
}
