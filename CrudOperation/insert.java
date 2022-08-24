package CrudOperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class insert
 */
public class insert extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		set s=new set();
		s.setno(request.getParameter("no"));
		s.setname(request.getParameter("name"));
		s.setcity(request.getParameter("city"));
		s.setmobile(request.getParameter("mobile"));
		s.setsalary(request.getParameter("salary"));
		operation o=new operation();
	    o.getconnection();
	    int result=o.insert(s);
	    if(result==1){
	    	out.println("<h1> Data Inserted Succesfull");
	    	out.println("<h4>Go To Home:</h4><a href=http://localhost:7078/servletprogram//index.html>Click Hare</a>");
	    }
	    else{
	    	out.println("<h1>Data Is Not Inserted");
	    	out.println("<h4>Go To Home:</h4><a href=http://localhost:7078/servletprogram//index.html>Click Hare</a>");
	    }
	    
	}

}
