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
 * Servlet implementation class Category
 */
@WebServlet("/Category")
public class Category extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac_acts","root","Mysql@1500");
				PreparedStatement psCategory = connection.prepareStatement("select * from category");
				ResultSet result = psCategory.executeQuery(); // bcz now prepared statement not having any parameter that is not passed. (we did not use ? here)
					){   
				
//				System.out.println("Category doGet fired....");
				
				out.println("<html>");
				out.println("<body>");
				out.println("<table border='1'>");
				out.println("<tr>");
				out.println("<th>Name</th>");
				out.println("<th>Description</th>");
				out.println("<th>Image</th>");
				out.println("</tr>");
				
				while(result.next()) {
					out.println("<tr>");
					out.println("<td><a href='Products?categoryId=" + result.getInt("categoryId") + "'>" + result.getString("categoryName") + "</a></td>");
					
					out.println("<td>" + result.getString("categoryDescription") + "</td>");
					
					
					out.println("<td><img src='Images/" + result.getString("categoryImageUrl") + "' height='60px' width='60px'/></td>");
					
					out.println("</tr>");
				}
				
				
				
				out.println("</table>");
				out.println("</body>");
				out.println("</html>");
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
