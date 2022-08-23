package Session3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie3
 */
public class Cookie3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.setContentType("text/html");
          PrintWriter out=response.getWriter();
          Cookie c3=new Cookie("c3", "655");
          response.addCookie(c3);
          Cookie c[]=request.getCookies();
          out.println("The THird Cookie Is Created With Id"+c3.getName());
          out.println("<br><h3>The C1 Cookie Value Is :"+c[0].getValue());
          out.println("<br><h3>The C2 Cookie Value Is :"+c[1].getValue());
          out.println("<br><a href=http://localhost:7078/servletprogram/Cookie.html>Click Haer To GO Home");
	}

}
