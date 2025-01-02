package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RetrieveSession
 */
@WebServlet("/RetrieveSession")
public class RetrieveSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);  // false bcz not creating here we are accessing session
		PrintWriter out = response.getWriter();
		if(session==null) {
			out.println("No session for this user, you need to login");
		}else {
			out.println(session.getAttribute("userName"));
			out.println("Id : " + session.getId());
			out.println("Inactive : " + session.getMaxInactiveInterval());
		}
	}

}
