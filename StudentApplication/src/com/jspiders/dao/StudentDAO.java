package com.jspiders.dao;

import java.util.ArrayList;

import com.jspiders.bean.StudentBean;

public interface StudentDAO {

	boolean createProfile(StudentBean data);

	StudentBean login(String regno, String password);

	ArrayList<StudentBean> getAllStudentDetails();

	StudentBean searchStudent(String regno);

	boolean changePassword(String regno, String oldPassword, String newPassword);

	StudentBean editProfile(String regno);

	boolean updateProfile(StudentBean data);

	boolean deleteStudent(String regno);

}
