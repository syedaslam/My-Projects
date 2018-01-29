package com.jspiders.bean;

import java.io.InputStream;

public class StudentBean {
	private int    regno;
	private String firstname;
	private String middlename;
	private String lastname;
	private String g_firstname;
	private String g_middlename;
	private String g_lastname;
	private InputStream photo;
	
	
	public InputStream getPhoto() {
		return photo;
	}
	public void setPhoto(InputStream photo) {
		this.photo = photo;
	}
	private String isAdmin;
	private String password;
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getG_firstname() {
		return g_firstname;
	}
	public void setG_firstname(String g_firstname) {
		this.g_firstname = g_firstname;
	}
	public String getG_middlename() {
		return g_middlename;
	}
	public void setG_middlename(String g_middlename) {
		this.g_middlename = g_middlename;
	}
	public String getG_lastname() {
		return g_lastname;
	}
	public void setG_lastname(String g_lastname) {
		this.g_lastname = g_lastname;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
