package com.hibernate.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SportsData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		SportDTO sport=new SportDTO();
		String name=req.getParameter("name");
		System.out.println(name);
		sport.setSportName(name);
		sport.setSportType(req.getParameter("type"));
		sport.setNoOfPlayers(Integer.parseInt(req.getParameter("players")));
		sport.setDuration(Integer.parseInt(req.getParameter("time")));
		HibernateImpl impl=new HibernateImpl();
		PrintWriter out=resp.getWriter();
		boolean check=impl.sportTable(sport);
		if (check) {
			out.print("<h1>date sucessfully inserted</h1>");
		}else {
			out.print("<h1>Oops! something wrong</h1>");
		}
		
	}
}
