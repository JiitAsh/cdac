package cdac.sessions;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class AddSeesion
 */
@WebServlet("/AddSession")
public class AddSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		out.println("Id " + session.getId());
		session.setMaxInactiveInterval(20);
		out.println("" + session.getMaxInactiveInterval());
		session.setAttribute("data", "this is the session");
		session.setAttribute("userName", "pankaj");
		out.println("Session Created...");
	}

}