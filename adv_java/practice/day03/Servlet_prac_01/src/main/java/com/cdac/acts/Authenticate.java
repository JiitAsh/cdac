package com.cdac.acts;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(userName==null || password==null) {
			out.println("Something went wrong :( ");
		}
//		else if(userName.equals("acts") && password.equals("Cdac@123")) {
//			out.println("User Authenticated Successfully!");
//		}else {
//			out.println("User not found!!");
//		}
		
		
		//using database
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // it is mandatory for jdbc connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac_acts","root","Mysql@1500");
			Statement stSelect = connection.createStatement();
			ResultSet result = stSelect.executeQuery("select * from cdac_acts.users");
			
			boolean userExists = false;
			while(result.next()) {
				if(result.getString("userName").equals(userName) && result.getString("password").equals(password)) {
					out.println("User Authenticated!");
					userExists = true;
					break;
				}
			}
			if(!userExists) {
				out.println("User Not Found!");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			out.println("Something wrong in try block...");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
