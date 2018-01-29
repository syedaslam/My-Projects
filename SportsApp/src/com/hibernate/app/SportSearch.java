package com.hibernate.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SportSearch extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HibernateImpl impl = new HibernateImpl();
		SportDTO sport=impl.searchSports(req.getParameter("name"));
		req.setAttribute("sport", sport);
		/*PrintWriter out=resp.getWriter();
		String html="<h1>Sports Name : "+sport.getSportName()+"</h1>"
				+ "<h1>Sports Type : "+sport.getSportType()+"</h1>"
						+ "<h1>No of Players : "+sport.getNoOfPlayers()+"</h1>"
								+ "<h1>Duration : "+sport.getDuration()+"</h1>";
		out.print(html);*/
		
		RequestDispatcher dispatcher2 = req.getRequestDispatcher("./SearchSport.jsp");
		dispatcher2.include(req, resp);
	}
}
