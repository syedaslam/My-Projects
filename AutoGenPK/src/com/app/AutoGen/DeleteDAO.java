package com.app.AutoGen;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Sf.util.SingleTonSessionFactory;

public class DeleteDAO {
public static void main(String[] args) {
	SessionFactory sf=SingleTonSessionFactory.getSF();
	Session sess=sf.openSession();
	String hql="delete from SuperMarketDTO where slNo=:slno";
	Query qry=sess.createQuery(hql);
	qry.setParameter("slno", 2);
	qry.executeUpdate();
	sess.beginTransaction().commit();
	
	
	
	
	
	//SF  -- SingleTOnUtil jar
	//session
	
}
}
