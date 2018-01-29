package com.app.POR;

import org.hibernate.Session;

import com.Sf.util.SingleTonSessionFactory;

public class LoadTVDAO {

	
	public static void main(String[] args) {
		
		Session sess=SingleTonSessionFactory.getSF().openSession();
		
		TVDTO tv=sess.load(TVDTO.class, "sony");
		
	System.out.println(tv.getColor());
	
	
	//using tv get remote
	
	RemoteDTO remote =tv.getRemote();
	System.out.println(remote.getNoOfButtons());
	
	
	//load Remote
	
	RemoteDTO remote2=sess.load(RemoteDTO.class, 40);
	System.out.println(remote2.getShape());
	
	TVDTO tv2 =remote2.getTv();
	System.out.println(tv2 .getColor());
	
	
	
		
		
		
	}
}
