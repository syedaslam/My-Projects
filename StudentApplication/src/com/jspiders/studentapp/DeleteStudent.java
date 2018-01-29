package com.jspiders.studentapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.dao.GenerateDAO;
import com.jspiders.dao.StudentDAO;

public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*JDBCimp jdbc = new JDBCimp();
		boolean check = jdbc.deleteStudent(req.getParameter("regno"));*/
		StudentDAO dao = GenerateDAO.getDAOImpl();
		boolean check = dao.deleteStudent(req.getParameter("regno"));
		PrintWriter out=resp.getWriter();
		RequestDispatcher dispatcher2 = req.getRequestDispatcher("./Header.jsp");
		dispatcher2.include(req, resp);	
		if (check) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("./viewAll");
			dispatcher.forward(req, resp);		
		}else {		
			out.print("<p style=\"color:red\">not deleted </p>");
		}
		RequestDispatcher dispatcher3 = req.getRequestDispatcher("./footer.jsp");
		dispatcher3.include(req, resp);	
		
	}
}
