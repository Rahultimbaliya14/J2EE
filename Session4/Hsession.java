package Session4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Hsession
 */
public class Hsession extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession hs=request.getSession();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		hs.setAttribute("s1","666");
		out.println("Session Is Created With S_id No: "+hs.getAttribute("s1"));
		out.println("<br><a href=http://localhost:7078/servletprogram/Session2>Click Hare To Go The Second Page");
		
	}

}
