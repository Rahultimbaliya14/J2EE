package CrudOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class delete
 */
public class delete extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String no=request.getParameter("no");
		operation o=new operation();
		o.getconnection();
		int result=o.delete(no);
		 if(result==1){
		    	out.println("<h1> Record Deleted Succesfull");
		    	out.println("<h4>Go To Home:</h4><a href=http://localhost:7078/servletprogram//index.html>Click Hare</a>");
		    }
		    else{
		    	out.println("<h1>Record Is Not Deleted"+result);
		    	out.println("<h4>Go To Home:</h4><a href=http://localhost:7078/servletprogram//index.html>Click Hare</a>");
		    }
	}

}
