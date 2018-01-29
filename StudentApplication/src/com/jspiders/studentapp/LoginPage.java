package com.jspiders.studentapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPage extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String html = "<!DOCTYPE html>\r\n" +
				"<html>\r\n" +
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Log in Page</title>\r\n" + 
				"<meta charset=\"utf-8\">\r\n" + 
				"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"<link rel=\"stylesheet\"\r\n" + 
				"	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n" + 
				"<script\r\n" + 
				"	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n" + 
				"<script\r\n" + 
				"	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n" + 
				"<link rel=\"stylesheet\" href=\"Style.css\">\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	<div id=\"fullscreen_bg\" class=\"fullscreen_bg\">\r\n" + 
				"		<div class=\"container\">\r\n" + 
				"			<form class=\"form-signin\"\r\n" + 
				"				action=\"./login\"\r\n" + 
				"				method=\"post\">\r\n" + 
				"				<h1 class=\"form-signin-heading text-muted\">Login</h1>\r\n" + 
				"				<input type=\"text\" class=\"form-control\" placeholder=\"Regno\"\r\n" + 
				"					name=\"regno\" required autofocus> <input type=\"password\"\r\n" + 
				"					class=\"form-control\" placeholder=\"Password\" name=\"password\"\r\n" + 
				"					required>\r\n" + 
				"				<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">\r\n" + 
				"					Log in</button>\r\n" + 
				"				<p>\r\n" + 
				"					<a style=\"color: white; text-decoration: none;\"\r\n" + 
				"						href=\"./ProfileCreation.jsp\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;click\r\n" + 
				"						here to create profile </a>" + 
				"				</p> "+
				"				<p Style=\"color:red\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; invalid regno or password</p>"+
				"			</form>\r\n" +
				"		</div>\r\n" + 
				"	</div>\r\n" + 
				"</body>\r\n" + 
				"</html>";	
		
		out.println(html);	
		
	}	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String html = "<!DOCTYPE html>\r\n" +
				"<html>\r\n" +
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Log in Page</title>\r\n" + 
				"<meta charset=\"utf-8\">\r\n" + 
				"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
				"<link rel=\"stylesheet\"\r\n" + 
				"	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n" + 
				"<script\r\n" + 
				"	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n" + 
				"<script\r\n" + 
				"	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n" + 
				"<link rel=\"stylesheet\" href=\"Style.css\">\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	<div id=\"fullscreen_bg\" class=\"fullscreen_bg\">\r\n" + 
				"		<div class=\"container\">\r\n" + 
				"		<h3 style=\"color:white\"> Thanks for visiting..</h3>"+
				"			<form class=\"form-signin\"\r\n" + 
				"				action=\"./login\"\r\n" + 
				"				method=\"post\">\r\n" + 
				"				<h1 class=\"form-signin-heading text-muted\">Login</h1>\r\n" + 
				"				<input type=\"text\" class=\"form-control\" placeholder=\"Regno\"\r\n" + 
				"					name=\"regno\" required autofocus> <input type=\"password\"\r\n" + 
				"					class=\"form-control\" placeholder=\"Password\" name=\"password\"\r\n" + 
				"					required>\r\n" + 
				"				<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">\r\n" + 
				"					Log in</button>\r\n" + 
				"				<p>\r\n" + 
				"					<a style=\"color: white; text-decoration: none;\"\r\n" + 
				"						href=\"./ProfileCreation.jsp\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;click\r\n" + 
				"						here to create profile </a>" + 
				"				</p> "+
				"			</form>\r\n" +
				"		</div>\r\n" + 
				"	</div>\r\n" + 
				"</body>\r\n" + 
				"</html>";	
		
		out.println(html);	
	}
}
