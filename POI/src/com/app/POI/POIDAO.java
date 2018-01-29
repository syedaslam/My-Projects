package com.app.POI;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Sf.util.SingleTonSessionFactory;

public class POIDAO {
	public static void main(String[] args) {
			
		
		// create object of super class
		
		VehicleDTO vehicle=new VehicleDTO();
		
		
		//create objects of subclasses
		
		CarDTO car=new CarDTO();
		car.setFuelType("Diesel");
		car.setGearType("Manual");
		car.setSteeringType("Power");
		car.setMileage(16);
		
		BikeDTO bike=new BikeDTO();
		bike.setStarterType("Self");
		bike.setMileage(50);
		bike.setFuelType("Petrol");
		
		
		SessionFactory sf=SingleTonSessionFactory.getSF();
		Session sess=sf.openSession();
		
		sess.save(vehicle);
		sess.save(car);
		sess.save(bike);
		
		
		sess.beginTransaction().commit();
		
		
		
		
		
		
		
		
		
		
		
	}
}
