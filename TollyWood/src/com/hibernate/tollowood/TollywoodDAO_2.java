package com.hibernate.tollowood;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.hibernate.dao.SingletonClass;

public class TollywoodDAO_2 {

	public static void main(String[] args) {

		ActorsDTO actor1 = new ActorsDTO();

		actor1.setName("Ramya Krishna");
		actor1.setAge(47);
		actor1.setCharactor("Sivagami");
		actor1.setPhone(9622351225l);

		ActorsDTO actor2 = new ActorsDTO();

		actor2.setName("Rana Daggubati");
		actor2.setAge(33);
		actor2.setCharactor("Bhallaladeva");
		actor2.setPhone(9623351225l);

		MovieDTO movie4 = new MovieDTO();

		movie4.setTitle("Student no.1");
		movie4.setCaption("no caption");
		movie4.setBudget(0.7);
		movie4.setRatings(8.0);

		MovieDTO movie5 = new MovieDTO();

		movie5.setTitle("Magadheera");
		movie5.setCaption("no caption");
		movie5.setBudget(1.4);
		movie5.setRatings(8.1);

		List<MovieDTO> list = new ArrayList<>();
		list.add(movie4);
		list.add(movie5);

		Session sess = SingletonClass.getSf().openSession();
		MovieDTO movie = sess.load(MovieDTO.class, "Bahubali");

		DirectorDTO director = new DirectorDTO();

		actor1.setMovie(movie);
		actor2.setMovie(movie);

		movie4.setDirector(director);
		movie5.setDirector(director);

		sess.save(actor1);
		sess.save(actor2);
		sess.save(movie4);
		sess.save(movie5);

		sess.beginTransaction().commit();

	}

}
