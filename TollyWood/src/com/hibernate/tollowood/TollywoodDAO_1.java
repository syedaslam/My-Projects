package com.hibernate.tollowood;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.hibernate.dao.SingletonClass;

public class TollywoodDAO_1 {

	public static void main(String[] args) {

		MovieDTO movie1 = new MovieDTO();

		movie1.setTitle("Bahubali");
		movie1.setCaption("The Truth");
		movie1.setBudget(2.5);
		movie1.setRatings(8.2);

		MovieDTO movie2 = new MovieDTO();

		movie2.setTitle("Chatrapathi");
		movie2.setCaption("no Caption");
		movie2.setBudget(1.0);
		movie2.setRatings(7.6);

		MovieDTO movie3 = new MovieDTO();

		movie3.setTitle("Eaga");
		movie3.setCaption("The ultimate Revange Story");
		movie3.setBudget(1.3);
		movie3.setRatings(7.8);

		ActorsDTO actor1 = new ActorsDTO();

		actor1.setName("prabash");
		actor1.setAge(38);
		actor1.setPhone(9144785623l);
		actor1.setCharactor("bahubali");

		ActorsDTO actor2 = new ActorsDTO();

		actor2.setName("Anushka");
		actor2.setAge(36);
		actor2.setPhone(9144785523l);
		actor2.setCharactor("Devasena");

		ActorsDTO actor3 = new ActorsDTO();

		actor3.setName("Sharath kumar");
		actor3.setAge(42);
		actor3.setPhone(9144786623l);
		actor3.setCharactor("kattapa");

		DirectorDTO director = new DirectorDTO();

		director.setName("Rajamouli");
		director.setAge(44);
		director.setPhone(9566332652l);

		HomeDTO home = new HomeDTO();
		home.setCountry("india");
		home.setState("Andhra pradesh");
		home.setStreet("Amir pate");
		home.setDoorno("3-37/3");
		
		//adding the actors to the list
		List<ActorsDTO> list = new ArrayList<>();
		list.add(actor1);
		list.add(actor2);
		list.add(actor3);
		
		//relating movie to actors
		movie1.setActors(list);
		//relating movie to director
		movie1.setDirector(director);
		movie2.setDirector(director);
		movie3.setDirector(director);
		//relating director to home
		director.setHome(home);

		Session session = SingletonClass.getSf().openSession();
		//saving all the data into the tables
		session.save(movie1);
		session.save(movie2);
		session.save(movie3);
		session.save(home);
		session.save(director);
		session.save(actor1);
		session.save(actor2);
		session.save(actor3);
		
		//Committing the database
		session.beginTransaction().commit();

	}
}
