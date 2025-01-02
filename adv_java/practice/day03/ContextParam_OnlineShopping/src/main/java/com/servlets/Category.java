package com.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
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

	Connection connection;
	PreparedStatement psCategory;
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		try {
			ServletContext application = getServletContext();
			String dbUrl = application.getInitParameter("dbUrl");
			
			String dbDriver = application.getInitParameter("dbDriver");
			String dbUser = application.getInitParameter("dbUser");
			String dbPassword = application.getInitParameter("dbPassword");
			
			
			Class.forName(dbDriver);

			connection = DriverManager.getConnection(dbUrl,dbUser,dbPassword);

			
			psCategory=connection.prepareStatement("select * from category");
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new ServletException("Failed to initialized Authentication Servlet due to DB Connection Failure", e);
		}
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
		try {
			if(psCategory!=null) {
				psCategory.close();
			}
			if(connection!=null) {
				connection.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		try(ResultSet result = psCategory.executeQuery()){
			
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
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
