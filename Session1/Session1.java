package Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oracle.jrockit.jfr.RequestDelegate;

public class Session1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String loginid=request.getParameter("loginid");
        String password=request.getParameter("password");
        String session=request.getParameter("Session_No");
        out.println(loginid);
        out.println(password);
        out.println(session);
        RequestDispatcher rd;
        if(loginid.equals("rahul") && password.equals("5678")){
        rd=request.getRequestDispatcher("login");
        rd.forward(request,response);
        
        }
        else{
        	rd=request.getRequestDispatcher("/Hiddenformfield.html?error=this is not fine");
        	rd.forward(request, response);
        }
	}

}
