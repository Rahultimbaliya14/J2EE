package Servlet_package;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Intrest
 */
public class Intrest extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int amount=Integer.parseInt(request.getParameter("Amount"));
		int rate=Integer.parseInt(request.getParameter("Rate"));
		int time=Integer.parseInt(request.getParameter("time"));
		int intrest1=amount*time*rate/100;
		out.println("<html><body><center><table border='3'><tr>");
		out.println("<th>Amount</th><th>Rate</th><th>Prioud</th><th>Intrest</th></tr>"
				+ "<tr><td>"+amount+"<td>"+rate+"<td>"+time+"<td>"+intrest1+"</table>");
		
	}

}
