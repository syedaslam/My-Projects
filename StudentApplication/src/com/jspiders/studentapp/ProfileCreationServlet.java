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

public class ProfileCreationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
									throws ServletException, IOException {
		StudentBean data = new StudentBean();
		String regnum=req.getParameter("regno");
		String fname=req.getParameter("f_name");
		System.out.println(fname);
		System.out.println(regnum);
		data.setRegno((Integer.parseInt(regnum)));
		data.setFirstname(req.getParameter("f_name"));
		data.setMiddlename(req.getParameter("m_name"));
		data.setLastname(req.getParameter("l_name"));
		data.setG_firstname(req.getParameter("G_f_name"));
		data.setG_middlename(req.getParameter("G_m_name"));
		data.setG_lastname(req.getParameter("G_l_name"));
		data.setIsAdmin(req.getParameter("isAdmin"));
		data.setPassword(req.getParameter("password"));
		/*JDBCimp jdbc=new JDBCimp();
		boolean check=jdbc.createProfile(data);*/
		StudentDAO dao = GenerateDAO.getDAOImpl();
		boolean check = dao.createProfile(data);
		PrintWriter out=resp.getWriter();
		if(check) {
			out.print("<p>profile sucessfully created.</p>"
					);
		}else {
			out.print("<h1>profile not created</h1>"
					);
			RequestDispatcher dispatcher = req.getRequestDispatcher("./ProfileCreation.jsp");
			dispatcher.include(req, resp);
		}
		
		/*RequestDispatcher dispatcher = req.getRequestDispatcher("./login.html");
		dispatcher.include(req, resp);
		out.print("<h1>PROFILE SUCESSFULLY CREATED</H1>"+
				);*/
	}
}
