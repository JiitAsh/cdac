package com.champion;

public class Student {
	private int rNo;
	private String name;
	private Address addr;  // association
	public Student() {
		//super();
		System.out.println("Student class default ctor called!!");
		rNo=0;
		name="";
		addr=null;
	}
	
	public Student(int rNo, String name, Address addr) {
		System.out.println("Studet class param ctor called!!");
		this.rNo = rNo;
		this.name = name;
		this.addr = addr;
	}
	
	
	public String getDetails() {
		return  addr.getAddress() 
				+ ", rNo: " + rNo
				+ ", name: " + name
				+ ".";
	}

//	public int getrNo() {
//		return rNo;
//	}
//
//	public void setrNo(int rNo) {
//		this.rNo = rNo;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Address getAddr() {
//		return addr;
//	}
//
//	public void setAddr(Address addr) {
//		this.addr = addr;
//	}
	
	
}