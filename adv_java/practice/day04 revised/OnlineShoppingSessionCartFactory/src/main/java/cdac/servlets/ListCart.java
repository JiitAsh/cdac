package cdac.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import cdac.cart.CartItem;
import cdac.cart.ShoppingCart;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ListCart
 */
@WebServlet("/ListCart")
public class ListCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session == null) {
			response.sendRedirect("login.html");
			return;
		}
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Welcome <b>" + session.getAttribute("userName") + "</b><br/><br/>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>CategoryId</th>");
		out.println("<th>ProductId</th>");
		out.println("<th>Price</th>");
		out.println("</tr>");
		ShoppingCart objCart = (ShoppingCart) session.getAttribute("cart");
//		Vector<ShoppingCart> objCart = (Vector<ShoppingCart>) session.getAttribute("cart");
//		ShoppingCart objCart = (ShoppingCart) session.getAttribute("cart");
		if (objCart == null || objCart.listCart().hasNext()==false) {
			out.println("Cart is empty...");
		} else {
			Iterator<CartItem> iter = objCart.listCart();
			double total = 0.0;
			while (iter.hasNext()) {
				CartItem cartItem = iter.next();
				out.println("<tr>");
				out.println("<td>" + cartItem.getCategoryId() + "</td>");
				out.println("<td>" + cartItem.getProductId() + "</td>");
				out.println("<td>" + cartItem.getProductPrice() + "</td>");
				out.println("</tr>");

				total += cartItem.getProductPrice();
			}

			out.println("</table>");
			out.println("Total : <b>" + total + "</b><br/>");
			out.println("<a href='Category'>Continue Shopping</a><br/>");
			out.println("<a href='Logout'>Logout</a>");
		}
	}

}
