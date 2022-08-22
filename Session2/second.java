package Session2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class second
 */
public class second extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Second Page");
	    String S1=request.getParameter("s1");
	    String s2=request.getParameter("s2");
	    String Path="http://localhost:7078/servletprogram/UrlRewriting.html";
		out.println("<h3>The First Session id S1="+S1+"</h3><br>");
		out.println("<h3> The Second Session Id S2="+s2+"</h3><br>");
		out.println("<h4>Go TO The First Page");
		out.println("<a href="+Path+">Click Hare");
		
	}

}
