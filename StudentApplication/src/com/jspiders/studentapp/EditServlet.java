package com.jspiders.studentapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspiders.bean.StudentBean;
import com.jspiders.dao.GenerateDAO;
import com.jspiders.dao.StudentDAO;

public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*JDBCimp jdbc = new JDBCimp();
		StudentBean data=jdbc.editProfile(req.getParameter("regno"));*/
		StudentDAO dao = GenerateDAO.getDAOImpl();
		StudentBean data = dao.editProfile(req.getParameter("regno"));
		req.setAttribute("data", data);
		RequestDispatcher dispatcher = req.getRequestDispatcher("./Header.jsp");
		dispatcher.include(req, resp);
		RequestDispatcher dispatcher2 = req.getRequestDispatcher("./EditPage.jsp");
		dispatcher2.include(req, resp);
		RequestDispatcher dispatcher1 = req.getRequestDispatcher("./footer.jsp");
		dispatcher1.include(req, resp);
	}
}
