package Session3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie1
 */
public class Cookie1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Cookie c=new Cookie("c1","455");
		out.println("Cookie Is Created With Id:  "+c.getName());
		response.addCookie(c);
		out.println("<br><br><a href=http://localhost:7078/servletprogram/Cookie2>Click Hare To Go Second Page");
	}

}
