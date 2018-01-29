package com.app.AutoGen;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.dao.SingletonClass;

public class NamedQueryDAO {

	public static void main(String[] args) {
		
		SessionFactory sf=SingletonClass.getSf();
		Session sess=sf.openSession();
		Query qry=sess.getNamedQuery("getBySlNo");
		qry.setParameter("slno", 3);
		
		SuperMarketDTO market=(SuperMarketDTO)qry.uniqueResult();
		System.out.println(market.getName());
		
		//get the second query
		Query qry2=sess.getNamedQuery("getByNoOfEmp");
		qry2.setParameter("noOfEmp", 40);
		
		List<SuperMarketDTO> l1=qry2.list();
		for (SuperMarketDTO superMarketDTO : l1) {
			System.out.println(superMarketDTO.getSlNo());
		}
		
		
		
		
		
		
		
		
		
	}
}
