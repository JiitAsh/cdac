package com.servlets;

import java.io.IOException;
import java.util.Vector;

import com.cart.CartItem;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class AddCart
 */
@WebServlet("/AddCart")
public class AddCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session==null) {
			response.sendRedirect("login.html");
			return;
		}
		
		String tmp = request.getParameter("categoryId");
		int categoryId = Integer.parseInt(tmp);
		
		tmp=request.getParameter("productId");
		int productId = Integer.parseInt(tmp);
		
		tmp=request.getParameter("productPrice");
		float productPrice = Float.parseFloat(tmp);
		
		CartItem objItem = new CartItem(categoryId, productId, productPrice);
		
		Vector<CartItem> objCart = (Vector<CartItem>)session.getAttribute("cart");
		
		if(objCart==null) {
			objCart = new Vector<>();
			session.setAttribute("cart", objCart);
		}
		
		objCart.add(objItem);
		response.sendRedirect("ListCart");
		
	}

}
