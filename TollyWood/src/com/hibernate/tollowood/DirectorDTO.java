package com.hibernate.tollowood;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Directors_table")
public class DirectorDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "Director_name")
	private String name;
	@Column(name = "age")
	private int age;
	@Id
	@Column(name = "phone_no")
	private long phone;

	//creating the instance of movie (one to many)
	@JoinColumn(name = "Director_ref")
	@OneToMany(cascade = CascadeType.ALL)
	private Collection<MovieDTO> movies;
	
	//creating the instance of home (one to one)
	@JoinColumn(name = "Address_ref")
	@OneToOne(cascade = CascadeType.ALL)
	private HomeDTO home;
	
	//generating the getters and setters
	public Collection<MovieDTO> getMovies() {
		return movies;
	}

	public void setMovies(Collection<MovieDTO> movies) {
		this.movies = movies;
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

	public HomeDTO getHome() {
		return home;
	}

	public void setHome(HomeDTO home) {
		this.home = home;
	}

}
