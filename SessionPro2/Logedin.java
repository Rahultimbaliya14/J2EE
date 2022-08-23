package SessionPro2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logedin
 */
public class Logedin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<center><h1>User Info</h3>");
		HttpSession hs=request.getSession(false);
		out.println("<br><br><br><h4>Name:  "+hs.getAttribute("name"));
		out.println("<br><br>Email:  "+hs.getAttribute("email"));
		out.println("<br><br>Mobile No :  "+hs.getAttribute("mobile"));
		out.println("<br><br>City  :  "+hs.getAttribute("city"));
		out.println("<br><br>Department  :  "+hs.getAttribute("Department"));
		out.println("<br><br>Enrollment No  :  "+hs.getAttribute("Enrollment"));
		out.println("");
	}

}
