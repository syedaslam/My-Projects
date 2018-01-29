<%@page import="com.jspiders.bean.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%StudentBean data=(StudentBean)request.getAttribute("data"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid">
  <h2 style=color:hotpink>Edit Profile form</h2>
  <form class="form-horizontal" action="./updateProfile" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2">Reg no : </label>
      <div class="col-sm-10">
        <input type="text" name="regno"  class="form-control" value=<%=data.getRegno()%>>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2">First Name : </label>
      <div class="col-sm-10">
        <input type="text" name="f_name"  class="form-control" value=<%=data.getFirstname() %>>
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2">Middle Name : </label>
      <div class="col-sm-10">
        <input type="text" name="m_name"  class="form-control" value=<%=data.getMiddlename() %>>
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2">Last Name : </label>
      <div class="col-sm-10">
        <input type="text" name="l_name"  class="form-control" value=<%=data.getLastname() %>>
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2">Guardian First Name : </label>
      <div class="col-sm-10">
        <input type="text" name="G_f_name"  class="form-control" value=<%=data.getG_firstname() %>>
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2">Guardian Middle Name : </label>
      <div class="col-sm-10">
        <input type="text"  name="G_m_name"  class="form-control" value=<%=data.getG_middlename() %>>
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2">Guardian Last Name : </label>
      <div class="col-sm-10">
        <input type="text"  name="G_l_name"  class="form-control" value=<%=data.getG_lastname() %>>
      </div>
    </div>
    <!--  <div class="form-group">
      <label class="control-label col-sm-2">Profile Photo : </label>
      <div class="col-sm-10">
        <input type="file"  name="photo"  class="form-control" placeholder="choose an image">
      </div>
    </div>
     -->
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>
</body>
</html>