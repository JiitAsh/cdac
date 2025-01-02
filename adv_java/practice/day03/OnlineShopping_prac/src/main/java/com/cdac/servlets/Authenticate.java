package com.cdac.servlets;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if(userName==null || password==null) {
			throw new ServletException("Invalid Parameters");
		}
		
//		if(userName.equals("acts") && password.equals("cdac@123")) {
//			out.println("User Authenticated!!");
//		}else {
//			out.println("User Not Authenticated!!");
//		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac_acts","root","Mysql@1500");
					PreparedStatement psAuthenticate = connection.prepareStatement("select * from users where  userName=? and password=?");
					) {
				
				 // bcz now prepared statement having parameter which not passed yet.  that's why we can not use ResultSet here ( ? here and need to be passed value)
				psAuthenticate.setString(1, userName);
				psAuthenticate.setString(2, password);
				
				ResultSet result = psAuthenticate.executeQuery();
				
				if(result.next()) {
//					response.sendRedirect("admin/loginTwo.html");   // if to run other file but and it should be in webapp directory and do not use '/' bcz it already present in url
					response.sendRedirect("Category");
					out.println("User Authenticated!!");
				}else {
					out.println("User Not Authenticated!!");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
