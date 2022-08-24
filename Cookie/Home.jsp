<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("<center><h1>The User's Info<br><br>");
Cookie m[]=request.getCookies();
out.println("<h4> Username:  "+m[0].getValue());
out.println("<br><br>Name:  "+m[1].getValue());
out.println("<br><br>City:  "+m[3].getValue());
out.println("<br><br>Enrollment NO:  "+m[4].getValue());
out.println("<br><br>Mobile:  "+m[5].getValue());
%>
</body>
</html>