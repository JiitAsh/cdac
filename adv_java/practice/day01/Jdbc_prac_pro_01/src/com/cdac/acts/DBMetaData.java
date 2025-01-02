package com.cdac.acts;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DBMetaData {

	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		System.out.println("Hello Programme :)");
		Properties dbDetails = new Properties();
		dbDetails.load(new FileInputStream("DB_details"));
		
		String url = dbDetails.getProperty("url");
		String userName = dbDetails.getProperty("userName");
		String password = dbDetails.getProperty("password");
		
		Connection connection = DriverManager.getConnection(url,userName,password);
		
		DatabaseMetaData dmd = connection.getMetaData();
		
		ResultSet resultTables = dmd.getTables(null, "cdac_acts", null, new String[] {"TABLE"});
		
		
		
		while(resultTables.next()) {
			if(resultTables.getString(1).equals("cdac_acts")) {
				System.out.println(resultTables.getString(3));
			}
		}
		
		ResultSet resultColumns = dmd.getColumns("cdac_acts", null, "student", null);
		
		while(resultColumns.next()) {
			System.out.println(resultColumns.getString(1));
			System.out.println(resultColumns.getString(2));
			System.out.println(resultColumns.getString(3));
			System.out.println(resultColumns.getString(4));
			System.out.println(resultColumns.getString(5));
			System.out.println();
		}
		
		System.out.println("End");
	}

}
