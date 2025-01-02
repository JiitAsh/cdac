package cdac.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Products
 */
@WebServlet("/Products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;
	PreparedStatement psProducts;

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
			psProducts = connection.prepareStatement("select * from products where categoryId=?");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			throw new ServletException("Failed to initialize Products servlet due to DB connection issues.....", e);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			if (psProducts != null) {
				psProducts.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		try {
			HttpSession session = request.getSession(false);
			if (session == null) {
				response.sendRedirect("login.html");
				return;
			}

			String userName = (String) session.getAttribute("userName");
			String temp = request.getParameter("categoryId");
			int categoryId = Integer.parseInt(temp);
			psProducts.setInt(1, categoryId);

			try (ResultSet result = psProducts.executeQuery()) {
				out.println("<html>");
				out.println("<body>");
				out.println("Welcome <b>" + userName + "</b><br/><br/>");
				out.println("<table border='1'>");
				out.println("<tr>");
				out.println("<th>Name</th>");
				out.println("<th>Description</th>");
				out.println("<th>Price</th>");
				out.println("<th>Image</th>");
				out.println("</tr>");

				while (result.next()) {
					out.println("<tr>");
					out.println("<td>" + result.getString("productName") + "</td>");
					out.println("<td>" + result.getString("productDescription") + "</td>");
					out.println("<td>" + result.getString("productPrice") + "</td>");
					out.println("<td><img src='Images/" + result.getString("productImageUrl")
							+ "' height='60px' width='60px'/></td>");
					out.println("<td><a href='AddCart?categoryId=" + result.getInt("categoryId") + "&productId="
							+ result.getInt("productId") + "&productPrice=" + result.getFloat("productPrice")
							+ "'>Add to Cart</a></td>");
					out.println("</tr>");

				}

				out.println("</table>");
				out.println("</body>");
				out.println("</html>");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
