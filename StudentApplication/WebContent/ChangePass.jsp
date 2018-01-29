<%@page import="com.jspiders.bean.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	boolean check = (boolean) request.getAttribute("check");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>change password</title>
</head>
<body>
	<%
		if (check) {
			boolean pass=true;
			request.setAttribute("pass", pass);
	%>
	<p style="color: green">password is successfully changed, plz...
		login to continue</p>
	<%
		} else {
	%>
	<p style="color: red">password mismatch</p>
	<%
		}
	%>
</body>
</html>