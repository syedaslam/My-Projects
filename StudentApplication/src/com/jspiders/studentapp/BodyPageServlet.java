package com.jspiders.studentapp;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class BodyPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher = null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session == null) {
			dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, resp);
		} else {
			String bodyPage = req.getParameter("body");
			String url = null;
			if (bodyPage.equals("Home")) {
				url = "./Home.jsp";
			} else if (bodyPage.equals("CreateProfile")) {
				url = "./ProfileCreation.jsp";
			} else if (bodyPage.equals("search")) {
				url = "./Search.jsp";
			} else if (bodyPage.equals("changePassword")) {
				url = "./ChangePassword.jsp";
			} else if (bodyPage.equals("logout")) {
				dispatcher = req.getRequestDispatcher("./logout");
				dispatcher.forward(req, resp);
			}
			dispatcher = req.getRequestDispatcher("Header.jsp");
			dispatcher.include(req, resp);
			dispatcher = req.getRequestDispatcher(url);
			dispatcher.include(req, resp);
			dispatcher = req.getRequestDispatcher("footer.jsp");
			dispatcher.include(req, resp);
		}
	}
}