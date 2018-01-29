package com.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateImpl {
	public boolean sportTable(SportDTO sports) {
		boolean check;
		// components of hibernate
		Configuration config = new Configuration();
		// to load hibernate.cfg.xml file
		config.configure();
		// to load mapping class
		config.addAnnotatedClass(SportDTO.class);
		// obtain SessionFactory using configuration.
		SessionFactory sf = config.buildSessionFactory();
		// obtain session to perform CRUD operation
		Session session = sf.openSession();
		session.save(sports);
		// obtain transaction to commit.
		try {
			Transaction trans = session.beginTransaction();
			trans.commit();
			return check = true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return check = false;
		}
	}
	public SportDTO searchSports(String sport) {
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(SportDTO.class);
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		SportDTO obj=session.load(SportDTO.class, sport);
		return obj;
	}
}
