<!DOCTYPE html>
<%String  user=(String)request.getAttribute("user"); %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="Style.css">
</head>
<body>
	<div id="fullscreen_bg" class="fullscreen_bg">
		<div class="container">
			<form class="form-signin"
				action="./login"
				method="post">
				<h1 class="form-signin-heading text-muted">Login</h1>
				<%if(user!=null) {%>
				<input type="text" class="form-control" placeholder="Regno"
					name="regno" value="<%=user%>" required autofocus> 
					<%}else{ %>
				<input type="text" class="form-control" placeholder="Regno"
					name="regno" required autofocus>
					<%} %>
				<input type="password"
					class="form-control" placeholder="Password" name="password"
					required>
				<button class="btn btn-lg btn-primary btn-block" type="submit">
					Log in</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="checkbox" name="remember"><label style="color:white"> Remember Me</label>
				<p>
					<a style="color: white; text-decoration: none;"
						href="./ProfileCreation.jsp">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;click
						here to create profile</a>
				</p>
				
			</form>
		</div>
	</div><br><br><br>
</body>
</html>