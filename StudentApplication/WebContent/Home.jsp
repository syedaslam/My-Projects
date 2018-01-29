<%@page import="com.jspiders.bean.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<%	session=request.getSession(false);
	StudentBean data = (StudentBean)session.getAttribute("data");%>
<body>
	<div class=container>
		<%-- <img src="<%=data.getPhoto()%>">
		<h1><%=data.getPhoto()%></h1> --%>
		<h2 style="color: red">Reg no :<span style="color: blue"> <%=data.getRegno()%></span>
		</h2>
		<h2 style="color: green">First Name :<span style="color: blue"><%= data.getFirstname()%></span></h2>
		<h2 style="color: green">Last Name : <span style="color: blue"><%= data.getLastname()%></span></h2>
	</div>
	<br>
	<br>
	<br>
	<%if (data.getIsAdmin().equalsIgnoreCase("yes")) { %>
	<a href='./viewAll'>Click here to view all students</a>
	<%} %>

</body>
</html>
