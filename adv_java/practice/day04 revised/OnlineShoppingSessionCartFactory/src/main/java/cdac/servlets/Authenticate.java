package cdac.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Authenticate
 */
@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;
	PreparedStatement psAuthenticate;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		try {
			ServletContext application = getServletContext();
			String dbUrl = application.getInitParameter("dbUrl");
			String dbDriver = application.getInitParameter("dbDriver");
			String dbUser = application.getInitParameter("dbUser");
			String dbPassword = application.getInitParameter("dbPassword");

			Class.forName(dbDriver);

			connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
			psAuthenticate = connection.prepareStatement("select * from users where userName=? and password=?");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			throw new ServletException("Failed to initialize Authenticate servlet due to DB connection issues.....", e);
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		if (userName == null || password == null) {
			throw new ServletException("Input parameters invalid....");
		}

		try {
			psAuthenticate.setString(1, userName);
			psAuthenticate.setString(2, password);

			try (ResultSet result = psAuthenticate.executeQuery()) {
				if (result.next()) {
					HttpSession session = request.getSession();
					session.setAttribute("userName", userName);

					response.sendRedirect("Category");
				} else {
					out.println("Authentication Failure...");
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
