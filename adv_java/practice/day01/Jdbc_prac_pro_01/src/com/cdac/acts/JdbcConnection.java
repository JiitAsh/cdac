package com.cdac.acts;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Scanner;

public class JdbcConnection {

	public static void main(String[] args) throws SQLException {
		System.out.println("Hello Programmer :)");
		
		Connection connection = null;
		Statement stSelect = null;
		ResultSet result = null;
		
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac_acts","root","Mysql@1500");
		
		 stSelect = connection.createStatement();
		 result = stSelect.executeQuery("select * from student");
		 
		 while(result.next()) {
			 System.out.println(result.getString(1));
			 System.out.println(result.getString("stdName"));
			 System.out.println(result.getString(3));
//			 System.out.println(result.getString(4));
		 }
		 
		 Statement stInsert = connection.createStatement();
//		 stInsert.executeUpdate("insert into student values(102,'Shyam', 'shyam@cdac.com')");
		 
		 Statement stUpdate = connection.createStatement();
		 stUpdate.executeUpdate("update student set stdEmail='shyam@acts.com' where rollNo=102");
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter roll No: ");
		 int rollNo = sc.nextInt();
		 sc.nextLine();
		 System.out.print("Enter name: ");
		 String stdName = sc.nextLine();
		 System.out.print("Enter email: ");
		 String stdEmail = sc.nextLine();
		 
		 stInsert.executeUpdate("insert into student values(" + rollNo + ","+"'" + stdName + "','" + stdEmail + "')");
		 
	}

}
