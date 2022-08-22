package Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      response.setContentType("text/html");
	      PrintWriter out=response.getWriter();
	      String username=request.getParameter("loginid");
	      String password=request.getParameter("password");
	      String session=request.getParameter("Session_No");
	      out.println("<h1>WelCome User "+username+"<br>");
	      out.println("Your Seesion Tracking No:"+session);
	      

	      
	}

}
