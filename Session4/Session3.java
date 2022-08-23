package Session4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session3
 */
public class Session3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           response.setContentType("text/html");
           PrintWriter oout=response.getWriter();
           HttpSession hs=request.getSession(false);
           oout.println("<h1>Third Page</h3><br><br>");
           oout.println("Session S_id is: "+hs.getAttribute("s1"));
           oout.println("<a href=http://localhost:7078/servletprogram/Session1> Click Hare TO GO Home");
           
	}

}
