package Session2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firsts
 */
public class firsts extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                  response.setContentType("text/html");
                  PrintWriter out=response.getWriter();
                    String login=request.getParameter("s1");
                    
                    String url="http://localhost:7078/servletprogram/second?s1="+login+"&s2=55";
                    out.println("<h1>The First Page<h2><br>");
                    out.println("The First Session Tracking Id S1:"+login+"<br>");
                    out.println("<a href="+url+">Click Hare</a>");
                   
	}

}
