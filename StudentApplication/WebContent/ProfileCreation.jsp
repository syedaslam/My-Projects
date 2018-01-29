<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
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
		<h2 style="color: hotpink">Student Profile Creation form</h2>
		<form class="form-horizontal" action="./CreateProfile" method="POST">
			<div class="form-group">
				<label class="control-label col-sm-2">Reg no : </label>
				<div class="col-sm-10">
					<input type="text" name="regno" class="form-control"
						placeholder="reg no" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">First Name : </label>
				<div class="col-sm-10">
					<input type="text" name="f_name" class="form-control"
						placeholder="First Name" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Middle Name : </label>
				<div class="col-sm-10">
					<input type="text" name="m_name" class="form-control"
						placeholder="Middle Name" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Last Name : </label>
				<div class="col-sm-10">
					<input type="text" name="l_name" class="form-control"
						placeholder="Last Name" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Guardian First Name :
				</label>
				<div class="col-sm-10">
					<input type="text" name="G_f_name" class="form-control"
						placeholder="Guardian First Name" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Guardian Middle Name :
				</label>
				<div class="col-sm-10">
					<input type="text" name="G_m_name" class="form-control"
						placeholder="Guardian Middle Name" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Guardian Last Name : </label>
				<div class="col-sm-10">
					<input type="text" name="G_l_name" class="form-control"
						placeholder="Guardian Last Name" required>
				</div>
			</div>
			<!-- <div class="form-group">
				<label class="control-label col-sm-2">Profile Photo : </label>
				<div class="col-sm-10">
					<input type="file" name="photo" class="form-control"
						placeholder="choose an image">
				</div>
			</div> -->
			<div class="form-group">
				<label class="control-label col-sm-2">Password</label>
				<div class="col-sm-10">
					<input type="password" name="password" class="form-control"
						placeholder="Enter password">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Admin? : </label>
				<div class="col-sm-10">
					<select name="isAdmin">
						<option value="yes">yes</option>
						<option value="no">no</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Submit</button>
				</div>
			</div>
		</form>
		<p>
			Already have an Account? <a href="./login.jsp"> Login</a>
		</p>
	</div>
	<br>
	<br>
	<br>
</body>
</html>
