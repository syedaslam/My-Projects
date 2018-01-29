package com.jspiders.studentapp;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jspiders.bean.StudentBean;
import com.jspiders.dao.GenerateDAO;
import com.jspiders.dao.StudentDAO;

public class ViewAllStudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("./login.jsp");
			dispatcher.include(req, resp);
		} else {
			resp.setContentType("text/html");
			/*JDBCimp jdbc = new JDBCimp();
			ArrayList<StudentBean> studentList = jdbc.getAllStudentDetails();*/
			StudentDAO dao = GenerateDAO.getDAOImpl();
			ArrayList<StudentBean> studentList = dao.getAllStudentDetails();
			req.setAttribute("studentList", studentList);
			if (studentList != null) {
				RequestDispatcher dispatcher = req.getRequestDispatcher("./Header.jsp");
				dispatcher.include(req, resp);
				RequestDispatcher dispatcher2 = req.getRequestDispatcher("./ViewallStudents.jsp");
				dispatcher2.include(req, resp);
				RequestDispatcher dispatcher1 = req.getRequestDispatcher("./footer.jsp");
				dispatcher1.include(req, resp);
			}
		}
	}
}
