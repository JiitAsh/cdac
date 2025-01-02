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
 * Servlet implementation class Authenticate
 */
@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;
	PreparedStatement psAuthenticate;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		// what to do here is: loading DB Driver, make connection and execute prepared
		// statement

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac_acts", "root", "Mysql@1500");

			psAuthenticate = connection.prepareStatement("select * from users where userName=? and password=?");
		} catch (ClassNotFoundException | SQLException e) {

			throw new ServletException("Failed to initialized Authentication Servlet due to DB Connection Failure", e);
		}
	}

	@Override
	public void destroy() {
		try {
			if (psAuthenticate != null) {
				psAuthenticate.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		if (userName == null || password == null) {
			throw new ServletException("Input parameter are not valid");
		}

		try {
			psAuthenticate.setString(1, userName);
			psAuthenticate.setString(2, password);

			try (ResultSet result = psAuthenticate.executeQuery()) {
				if (result.next()) {
					response.sendRedirect("Category");
				} else {
					out.println("Authentication Failure");

				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
