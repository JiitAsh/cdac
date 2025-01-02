package com.cdac.acts;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Statement;



public class PraparedStatement {
	
	private static ResultSet selectQuery(Statement stSelect) throws SQLException {
		ResultSet result;
		
		result = stSelect.executeQuery("select * from student");
		
		return result;
	}
	

	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
		System.out.println("Hello Programmer :)");
		
		Scanner sc = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement psInsert = null;
		
		Properties dbDetails = new Properties();
		
		dbDetails.load(new FileInputStream("DB_details"));
		
		String url=dbDetails.getProperty("url");
		String userName=dbDetails.getProperty("userName");
		String password=dbDetails.getProperty("password");
		connection = DriverManager.getConnection(url,userName,password);
		
//		psInsert = connection.createStatement();   // no need to write connection.createStatement();
		
		psInsert = connection.prepareStatement("insert into student(stdName,stdEmail) values(?,?)");
		
//		 System.out.print("Enter roll No: ");
//		 String rollNo = sc.nextLine();
		 System.out.print("Enter name: ");
		 String stdName = sc.nextLine();
		 System.out.print("Enter email: ");
		 String stdEmail = sc.nextLine();
		 
//		 psInsert.setString(1, rollNo);   // setString() takes two arguments 1st index (for preparedStatement ? ) and next it takes only value in as String so rollNo can be int in actual DB but here it should be String 
		 psInsert.setString(1, stdName);
		 psInsert.setString(2, stdEmail);
		 
		 
		 psInsert.executeUpdate();
		 
		 ResultSet result = null;
		 Statement stSelect = connection.createStatement();
		 result = selectQuery(stSelect);
		 
//		 while(result.next()) {
//			 System.out.print(result.getString(1) + '\t');
//			 System.out.print(result.getString(2) + '\t');
//			 System.out.print(result.getString(3) + '\t');
//			 System.out.println();
//		 }
		 
		 while(result.next()) {
			 System.out.printf("%-3s\t%-10s\t%s\n", result.getString(1), result.getString(2), result.getString(3));
//			 System.out.printf("%-3s\t%-10s\t%s%n", result.getString(1), result.getString(2), result.getString(3));
			 
			 
		 }
	}

}
