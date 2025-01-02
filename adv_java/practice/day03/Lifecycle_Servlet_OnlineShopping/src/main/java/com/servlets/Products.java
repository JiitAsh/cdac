package com.servlets;

import jakarta.servlet.ServletConfig;
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
 * Servlet implementation class Products
 */
@WebServlet("/Products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;
	PreparedStatement psProducts;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac_acts", "root", "Mysql@1500");

			psProducts = connection.prepareStatement("select * from products where categoryId=?");

		} catch (ClassNotFoundException | SQLException e) {
			throw new ServletException("Failed to initialized Authentication Servlet due to DB Connection Failure", e);
		}
	}

	public void destroy() {
		// TODO Auto-generated method stub
		try {
			if (psProducts != null) {
				psProducts.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String tmp = request.getParameter("categoryId");

		int categoryId = Integer.parseInt(tmp);

		try {
			psProducts.setInt(1, categoryId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (ResultSet result = psProducts.executeQuery()) {

//					System.out.println("Products doGet fired....");

			out.println("<html>");
			out.println("<body>");
			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<th>Name</th>");
			out.println("<th>Description</th>");
			out.println("<th>Price</th>");
			out.println("<th>Imgae</th>");
			out.println("</tr>");

			while (result.next()) {
				out.println("<tr>");
				out.println("<td>" + result.getString("productName") + "</td>");
				out.println("<td>" + result.getString("productDescription") + "</td>");
				out.println("<td>" + result.getString("productPrice") + "</td>");
				out.println("<td><img src='Images/" + result.getString("productImageUrl")
						+ "'height='60px' width='60px'/></td>");
				out.println("</tr>");
			}

			out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
