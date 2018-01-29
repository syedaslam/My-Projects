package com.jspiders.studentapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jspiders.dao.GenerateDAO;
import com.jspiders.dao.StudentDAO;

public class ChangePassword extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("./login.jsp");
			dispatcher.include(req, resp);
		} else {
			String regno = req.getParameter("regno");
			String oldPassword = req.getParameter("currPass");
			String newPassword = req.getParameter("newPass");
			String reTypePassword = req.getParameter("retypePass");

			PrintWriter out = resp.getWriter();
			RequestDispatcher dispatcher1 = req.getRequestDispatcher("./Header.jsp");
			dispatcher1.include(req, resp);
			if (newPassword.equals(reTypePassword)) {

				/*JDBCimp jdbc = new JDBCimp();
				boolean check = jdbc.changePassword(regno, oldPassword, newPassword);*/
				StudentDAO dao = GenerateDAO.getDAOImpl();
				boolean check = dao.changePassword(regno, oldPassword, newPassword);
				if (check) {
					out.print("<p style=\"color:green\">password is sucessfully changed, plz... login to contunue</p>");
					RequestDispatcher dispatcher = req.getRequestDispatcher("./login.jsp");
					dispatcher.forward(req, resp);
				} else {
					out.print("<p style=\"color:red\">invalid reg. no. or password </p>");
					RequestDispatcher dispatcher2 = req.getRequestDispatcher("./ChangePassword.jsp");
					dispatcher2.include(req, resp);
				}
			} else {
				out.print("<p style=\"color:red\">password mismatch</p>");
				RequestDispatcher dispatcher3 = req.getRequestDispatcher("./ChangePassword.jsp");
				dispatcher3.include(req, resp);
			}
			RequestDispatcher dispatcher4 = req.getRequestDispatcher("./fotter.jsp");
			dispatcher4.include(req, resp);
		}
	}
}
