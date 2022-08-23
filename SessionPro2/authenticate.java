package SessionPro2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class authenticate
 */
public class authenticate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(username.equals("rahul123")&& password.equals("5678")){
			HttpSession hs=request.getSession();
			hs.setAttribute("name", "Rahul Timbaliya");
			hs.setAttribute("email", "Rahultimbaliya555@gmail.com");
			hs.setAttribute("city", "Dhari");
			hs.setAttribute("Department", "BCA");
			hs.setAttribute("Enrollment", "03052001005");
			hs.setAttribute("mobile", "6353647592");
			RequestDispatcher rd;
			rd=request.getRequestDispatcher("Logedin");
			rd.forward(request, response);
		}
		else
		{
			out.println("<center><h1>User Name And Password Is Wrong");
		}
	}

}
