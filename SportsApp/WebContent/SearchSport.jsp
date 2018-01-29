<%@page import="com.hibernate.app.SportDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	SportDTO sport = (SportDTO) request.getAttribute("sport");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Sports Timings</title>
<style>

td, th {
	font-size: 18px;
}
</style>
</head>
<body>
	<div class="container-fluid">
		<div class="table-responsive">
			<br> <br>
			<h1>Sports Information</h1>
			<br> <br> <br>
			<table class="table">
				<thead>
					<tr style="color: coral">
						<th>Sports Name</th>
						<th>Sports Type</th>
						<th>No of Players</th>
						<th>Duration</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td class="success"><%=sport.getSportName()%></td>
						<td class="active"><%=sport.getSportType()%></td>
						<td class="warning"><%=sport.getNoOfPlayers()%></td>
						<td class="active"><%=sport.getDuration()%></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>