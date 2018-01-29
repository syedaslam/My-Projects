package com.jspiders.dao;

public class GenerateDAO {
	private GenerateDAO() {}
	public static StudentDAO getDAOImpl() {
		StudentDAO dao;
		try {
			dao = (StudentDAO)Class.forName("com.jspiders.dao.JDBCimp").newInstance();
		} catch (Exception e) {
			dao = null;
			e.printStackTrace();
		}	
		return dao;
	}
}
