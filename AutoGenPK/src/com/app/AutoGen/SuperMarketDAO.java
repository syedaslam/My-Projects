package com.app.AutoGen;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SuperMarketDAO {

	public static void main(String[] args) {

		SuperMarketDTO market = new SuperMarketDTO();
		market.setName("More");
		market.setNoOfEmployees(40);
		market.setOwner("Kumar Mangalam");
		market.setRating(4);

		// components of hibernate
		Configuration config = new Configuration();
		config.configure("com/app/AutoGen/configuration.xml");
		config.addAnnotatedClass(SuperMarketDTO.class);
		SessionFactory sf = config.buildSessionFactory();
		Session sess = sf.openSession();

		sess.save(market);
		Transaction tx = sess.beginTransaction();
		tx.commit();

	}
}
