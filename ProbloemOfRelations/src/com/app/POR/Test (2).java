package com.app.POR;

import org.hibernate.Session;

import com.Sf.util.SingleTonSessionFactory;

public class Test {
public static void main(String[] args) {
	TVDTO tv=new TVDTO();
	tv.setName("VU");
	tv.setColor("black");
	tv.setType("UHD");
	tv.setSize(42);
	
	
	RemoteDTO remote=new RemoteDTO();
	remote.setNoOfButtons(40);
	remote.setRange(100);
	remote.setShape("rectangle");
	
	
	
	
	//relate tv with remote
	
	tv.setRemote(remote);
	
	//relate remote with tv
	remote.setTv(tv);
	
	
	Session sess=SingleTonSessionFactory.getSF().openSession();
	
	sess.save(remote);
	
	sess.beginTransaction().commit();
	
	
	
	
	
/*	
	//relate TV with remote
	
	tv.setRemote(remote);
	
	
	System.out.println(tv.getName());
	
	
	//get the remote from TV
	
	RemoteDTO remote1=tv.getRemote();
	System.out.println(remote1.getShape());*/
	
	
	
	
	
	
}
}
