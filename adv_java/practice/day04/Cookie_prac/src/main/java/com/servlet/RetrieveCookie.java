package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RetrieveCookie
 */
@WebServlet("/RetrieveCookie")
public class RetrieveCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] allCookies = request.getCookies();
		PrintWriter out = response.getWriter();
		
		if(allCookies==null || allCookies.length==0) {
			out.println("No cookies sent from the client...");
		}else {
			for(Cookie objCookie:allCookies) {
				out.println("Name: " + objCookie.getName());
				out.println("Value: " + objCookie.getValue());
				out.println("Age: " + objCookie.getMaxAge());
				
			}
		}
		
	}

}
