package com.champion;

public class Address {
  private String area;
  private String houseNo;
  private String pinCode;
  public Address() {
	  System.out.println("Address class default ctor called!!");
	  area="";
	  houseNo="";
	  pinCode="";
  }
  
  public Address(String area, String houseNo, String pinCode) {
	  System.out.println("Address class param ctor called!!");
	  this.area=area;
	  this.houseNo=houseNo;
	  this.pinCode=pinCode;
  }

/*
public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}

public String getHouseNo() {
	return houseNo;
}

public void setHouseNo(String houseNo) {
	this.houseNo = houseNo;
}

public String getPinCode() {
	return pinCode;
}

public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
}
*/
  
  public String getAddress() {
	  return "area: " + area
			  + ", houseNo: " + houseNo
			  + ", pinCode: " + pinCode;
  }
  
}
