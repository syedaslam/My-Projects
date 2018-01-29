package com.app.AutoGen;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLDAO {
	public static void main(String[] args) {
		Configuration confg = new Configuration();
		confg.configure("com/app/AutoGen/configuration.xml");
		confg.addAnnotatedClass(SuperMarketDTO.class);
		Session sess= confg.buildSessionFactory().openSession();
		
		
		//create the query
		/*To select single record
String hql="from SuperMarketDTO where slNo=1";
		Query qry=sess.createQuery(hql);
		//process the result
		//uniqueResult() -- single record
		//list() --multiple records
SuperMarketDTO market=
(SuperMarketDTO)qry.uniqueResult();
		System.out.println(market.getOwner());
		System.out.println(market.getName());
		*/
		
	/*	
		//To Select Multiple Records
		String hql="from SuperMarketDTO";
		Query qry=sess.createQuery(hql);
		//process the result
		List<SuperMarketDTO> superMarkets=qry.list();
for (SuperMarketDTO superMarketDTO :
	superMarkets) {
System.out.println(superMarketDTO.getSlNo());
}		*/
		

	/*	
		//To select single property
String hql="select name "
		+ "from SuperMarketDTO where slNo=2";
Query qry=sess.createQuery(hql);
//process the result
String market=(String)qry.uniqueResult();
System.out.println(market);
		
		
		*/
		/*
		
		//To select multiple columns
String hql="select name,noOfEmployees from "
		+ "SuperMarketDTO"
				+ " where slNo=2";
Query qry=sess.createQuery(hql);
Object[] obj=(Object[])qry.uniqueResult();
System.out.println(obj[0]);
		System.out.println(obj[1]);
		
		*/
	/*	
		//Build dynamic queries
		String hql="select name,noOfEmployees from "
		+ "SuperMarketDTO"
				+ " where slNo=?";
		
		Query qry=sess.createQuery(hql);
		qry.setInteger(0, 2);
	
		Object[] obj=(Object[])qry.uniqueResult();
		System.out.println(obj[0]);
				System.out.println(obj[1]);
		*/
		
		
		
/*String hql="select name,noOfEmployees from "
		+ "SuperMarketDTO";
		
		Query qry=sess.createQuery(hql);
List<Object[]> market=qry.list();
for (Object[] objects : market) {
	System.out.println(objects[0]);
	System.out.println(objects[1]);
}
	
	*/
		
		/*
		//Hql with Named Parameters
		String hql="from SuperMarketDTO where"
				+ " slNo=:slno and name=:nme";
		Query qry=sess.createQuery(hql);
		qry.setParameter("slno", 2);
		qry.setParameter("nme", "More");
		SuperMarketDTO market=
				(SuperMarketDTO)qry.uniqueResult();
		System.out.println(market.getOwner());
		
		*/
		
		
		
		//update a record using HQL
String hql="update SuperMarketDTO "
		+ "set noOfEmployees=:noOfEmp "
		+ "where slNo=:slno";
		
	Query qry=sess.createQuery(hql);
	qry.setParameter("noOfEmp", 100);
	qry.setParameter("slno",2);
	
	qry.executeUpdate();
	
	
	sess.beginTransaction().commit();
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
