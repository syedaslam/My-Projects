package com.jspiders.studentapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jspiders.bean.StudentBean;
import com.jspiders.dao.GenerateDAO;
import com.jspiders.dao.StudentDAO;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*JDBCimp jdbc = new JDBCimp();
		StudentBean data = jdbc.login(req.getParameter("regno"), req.getParameter("password"));*/
		StudentDAO dao = GenerateDAO.getDAOImpl();
		StudentBean data = dao.login(req.getParameter("regno"), req.getParameter("password"));
		resp.setContentType("text/html");
		
		if (data != null) {
			HttpSession session = req.getSession(true);
			String rem=req.getParameter("remember");
			if(rem!=null) {
			Cookie userNameCookie = new Cookie("UserName",req.getParameter("regno"));
			resp.addCookie(userNameCookie);
			String value= userNameCookie.getValue();
			req.setAttribute("user", value);
			System.out.println(value);
			}
			/*Cookie myLocationCookie = new Cookie("Location","Banglore");
			myLocationCookie.setMaxAge(5*24*60*60);
			resp.addCookie(myLocationCookie);*/
			
			
			/*RequestDispatcher dispatcher = req.getRequestDispatcher("./Header.jsp");
			dispatcher.include(req, resp); */
			session.setAttribute("data", data);
			/*RequestDispatcher dispatcher = req.getRequestDispatcher("./Home.jsp");
			dispatcher.include(req, resp);*/
			resp.sendRedirect("./bodyPage?body=Home");
			/*RequestDispatcher dispatcher1 = req.getRequestDispatcher("./footer.html");
			dispatcher1.include(req, resp);*/
		} else {
			RequestDispatcher dispatcher2 = req.getRequestDispatcher("./loginPage");
			dispatcher2.include(req, resp);
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
		
		
		
	}
}
