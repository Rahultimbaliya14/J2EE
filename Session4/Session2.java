package Session4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session2
 */
public class Session2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		HttpSession hs=request.getSession(false);
		out.println("<h1>Second Page</h3><br><br>");
		out.println("The Seesion Id Is: "+hs.getAttribute("s1"));
		out.println("<br><a href=http://localhost:7078/servletprogram/Session3>CLick Hare TO GO The Third Page");
	}

	

}
