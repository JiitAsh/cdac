package com.cdac;

public class Employee {
	private int empId;
	private String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	
//	public Integer getEmpId() {   // this function is returning 'Integer' and it's a class(wrapper). and as we know that '==' checks the reference for classes/objects, and 'Integer' is also a class then ref will be compared rather than values, so the result will be always false
//		return empId;
//	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Employee) {
			Employee other = (Employee) obj;
			if(other.getEmpId() == this.getEmpId()) {  // here compare values(primitive data tyeps ex: int, float, double, char etc) do not compare Wrapper class objects or objects(ex: Integer, Double, String, Student, Employee etc.) bcz '==' compare ref for Wrapper Class data types or objects and in this case it will always give false, bcz both address/ref is differ at every time.
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		
		return "[ empId: " + empId
				+ " empName: " + empName
				+" ]";
	}
	
	
}
