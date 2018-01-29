package com.jspiders.studentapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.bean.StudentBean;
import com.jspiders.dao.GenerateDAO;
import com.jspiders.dao.StudentDAO;

public class UpdateProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
									throws ServletException, IOException {
		StudentBean data = new StudentBean();
		String regno=req.getParameter("regno");
		System.out.println(regno);
		data.setRegno((Integer.parseInt(req.getParameter("regno"))));
		data.setFirstname(req.getParameter("f_name"));
		data.setMiddlename(req.getParameter("m_name"));
		data.setLastname(req.getParameter("l_name"));
		data.setG_firstname(req.getParameter("G_f_name"));
		data.setG_middlename(req.getParameter("G_m_name"));
		data.setG_lastname(req.getParameter("G_l_name"));
		/*JDBCimp jdbc = new JDBCimp();
		boolean check = jdbc.updateProfile(data);*/
		StudentDAO dao = GenerateDAO.getDAOImpl();
		boolean check = dao.updateProfile(data);
		PrintWriter out=resp.getWriter();
		RequestDispatcher dispatcher = req.getRequestDispatcher("./Header.jsp");
		dispatcher.include(req, resp);
		if (check) {
			out.print("<h2>updated</h2>");
			
		} else {
			out.print("<h2 style=\"color:red\">not updated</h2>");
		}
		RequestDispatcher dispatcher1 = req.getRequestDispatcher("./footer.jsp");
		dispatcher1.include(req, resp);
	}
}
