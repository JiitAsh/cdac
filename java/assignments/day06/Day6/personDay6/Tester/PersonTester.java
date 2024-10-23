package com.person.Tester;
import java.util.Scanner;
import com.person.Person;
import com.person.Address;
import java.text.ParseException;
import java.util.Date;

public class PersonTester {
	
		public static void main(String[] args) throws ParseException {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter your Adhar Number: ");
			String AdharNo = sc.nextLine();
			System.out.println("Please Enter your Name: ");
			String name = sc.nextLine();
			System.out.println("Please Enter your Date of Birth");
			String strdate = sc.nextLine();
			Date doj = Person.getDate(strdate);
			System.out.println("Please enter line1");
			String line1 = sc.nextLine();
			System.out.println("Please enter line2");
			String line2 = sc.nextLine();
			System.out.println("Please enter landmark");
			String landmark = sc.nextLine();
			System.out.println("Please enter pin");
			String pin = sc.nextLine();
			Address address = new Address(line1, line2, landmark, pin);
			Person person = new Person(AdharNo, name, doj, address);
			System.out.println(person);
			String date = new String("15/8/1947");
			Date date1 =  Person.getDate(date);
			
			if(person.getDoj().before(date1)) {
				System.out.println("The Person is born before 15th august 1947");
		}else {
			System.out.println("The Person is born After 15th august 1947");

		}
}
}
