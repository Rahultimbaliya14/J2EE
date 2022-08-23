package Session3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie2
 */
public class Cookie2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.setContentType("text/html");
          PrintWriter out=response.getWriter();
          Cookie c2=new Cookie("c2","554");
          out.println("<h1>Second Page</h1><br>");
          out.println("Another Cookie Is Created With Id: "+c2.getName());
          Cookie c[]=request.getCookies();
          out.println("<br>The C1 Cookie Value Is: "+c[0].getValue());
          response.addCookie(c2);
          out.println("<br><a href=http://localhost:7078/servletprogram/Cookie3>Click Hare To Go Third Page");
          
          
	}

}
