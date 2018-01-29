<%@page import="java.util.List"%>
<%@page import="com.jspiders.bean.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	List<StudentBean> studentList = (List<StudentBean>) request.getAttribute("studentList");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
		<div class="table-responsive">
			<h1>
				No.of Students :
				<%=studentList.size()%>
			</h1>
			<table class="table">
				<thead>
					<tr style="color: coral">
						<th>Regno</th>
						<th>First Name</th>
						<th>Middle Name</th>
						<th>Last Name</th>
						<th>Guardian First Name</th>
						<th>Guardian Middle Name</th>
						<th>Guardian Last Name</th>
						<th>isAdmin</th>
						<th>Delete</th>
						<th>Edit</th>
					</tr>
				</thead>
				<%
					for (StudentBean data : studentList) {
				%>
				<tbody>
					<tr>
						<td class="success"><%=data.getRegno()%></td>
						<td class="active"><%=data.getFirstname()%></td>
						<td class="warning"><%=data.getMiddlename()%></td>
						<td class="active"><%=data.getLastname()%></td>
						<td class="warning"><%=data.getG_firstname()%></td>
						<td class="success"><%=data.getG_middlename()%></td>
						<td class="active"><%=data.getG_lastname()%></td>
						<td class="warning"><%=data.getIsAdmin()%></td>
						<td><a href="./deleteStudent?regno=<%=data.getRegno()%>">delete</a></td>
						<td class="success"><a
							href="./editProfile?regno=<%=data.getRegno()%>">edit</a></td>
					</tr>
				</tbody>
				<%
					}
				%>
			</table>
		</div>
	</div>
	<br>
	<br>
</body>
</html>