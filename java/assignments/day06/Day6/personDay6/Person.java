/*Create Person class with basic details like addharNumber, name,
date of birth, address ( use Adress class for this). Find out whether
the person is born before 15 th August 1947.
*/
package com.person;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Person {
	
	

		private String adharNumber;
		private String name;
		private Date doj;
		Address address;
		
		public Person(String adharNumber, String name, Date doj, Address address) {
			this.adharNumber = adharNumber;
			this.name = name;
			this.doj = doj;
			this.address = address;
		}
		
		/*public static String getDateFormatted( Date date ) throws ParseException{
			SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
			return sdf.format(date);
			
		}*/
		public static Date getDate(String strDate) throws ParseException { 
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sdf.parse(strDate);
			return date;
		}
		public Date getDoj() {
			return doj;
		}

		@Override
		public String toString() {
			return "Person [adharNumber=" + adharNumber + ", name=" + name + ", doj=" + doj + ", address=" + address + "]";
		}



		/*public void setDoj(Date doj) {
			this.doj = doj;
		}*/
		
}
