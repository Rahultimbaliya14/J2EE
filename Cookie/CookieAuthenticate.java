package Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieAuthenticate
 */
public class CookieAuthenticate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String Usernamec;
		String Passwordc;
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Cookie[] c;
		c=request.getCookies();
		if(c==null){
			out.println("<h4> Cokkie Is Not Creted That's Why Create The Cookie Automatically<br>");
		      Cookie e=new Cookie("username",username);
		      Cookie f=new Cookie("password",password);
		      Cookie g=new Cookie("Name","Rahul");
		      Cookie r=new Cookie("City","Dhari");
		      Cookie a=new Cookie("Enrollment","03052001105");
		      Cookie b=new Cookie("Mobile","6353647592");
		      Usernamec=password;
		      Passwordc=password;
		      response.addCookie(e);
		      response.addCookie(f);
		      response.addCookie(g);
		      response.addCookie(r);
		      response.addCookie(a);
		      response.addCookie(b);
		      out.println("<h3>The Username And Asigned Please Go Back And Login Again");
		      out.println("<a href=http://localhost:7078/servletprogram/CookiePro4.html>Click Hare");
		      
		}
		else{
			Cookie l[]=request.getCookies();
			if(password.equals(l[1].getValue())&& username.equals(l[0].getValue())){	
					RequestDispatcher rd;
					rd=request.getRequestDispatcher("Home.jsp");
					rd.forward(request, response);
					
			   }
			else{
				out.println("<center><h1> Username And Password Is Wrong");
				out.println("<br><a href=http://localhost:7078/servletprogram/CookiePro4.html>Click Hare To GO Back");
				RequestDispatcher rd;
				rd=request.getRequestDispatcher("CookiePro4.html");
				rd.forward(request, response);
			}
		}
			 			
		}
	}


