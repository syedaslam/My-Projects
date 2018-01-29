<!DOCTYPE html>
<html>
<head>
<title>Home Page</title>
<meta  charset="utf-8">
<meta   name="viewport" content="width=device-width, initial-scale=1">
<link   href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link   rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link  rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link  rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<link  rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link  rel="stylesheet" href="../lib/w3.css">
<style type="text/css">
#li:hover {
	background-color: white;
	color: darkorange;
}
#li {
	color: white;
}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> 
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a id="li" href="./bodyPage?body=Home">Home</a></li>
					<li class="active"><a id="li" href="./bodyPage?body=CreateProfile">Create Profile</a></li>
					<li class="active"><a id="li" href="./bodyPage?body=search">Search</a></li>
					<li class="active"><a id="li" href="./bodyPage?body=changePassword">Change Password</a></li>
					<li class="active"><a id="li" href="./bodyPage?body=logout">Logout</a></li>
				</ul>
			</div>
		</div>
	</nav>
</body>
</html>