package com.hibernate.tollowood;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Actors_table")
public class ActorsDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="Actor_name")
	private String name;
	@Column(name="Actor_age")
	private int age;
	@Id
	@Column(name="phone_no")
	private long phone;
	@Column(name="charactor")
	private String charactor;
	
	//creating the instance of movie (manytoone) 
	@JoinColumn(name="Actor_ref")
	@ManyToOne(cascade=CascadeType.ALL)
	private MovieDTO movie;

	//generating the getters and setters 
	public MovieDTO getMovie() {
		return movie;
	}

	public void setMovie(MovieDTO movie) {
		this.movie = movie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	

	public String getCharactor() {
		return charactor;
	}

	public void setCharactor(String charactor) {
		this.charactor = charactor;
	}
	
	
}
