package com.hibernate.tollowood;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Movies_Table")
public class MovieDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "movie_title")
	private String title;
	@Column(name = "caption")
	private String caption;
	@Column(name = "ratings")
	private double ratings;
	@Column(name = "budget")
	private double budget;

	// creating the instance of actors
	//OneToMany Relation
	@JoinColumn(name = "Actor_ref")
	@OneToMany(cascade = CascadeType.ALL)
	private Collection<ActorsDTO> actors;
	
	//creating the instance director
	//ManyToOne Relation
	@JoinColumn(name = "Director_ref")
	@ManyToOne(cascade = CascadeType.ALL)
	private DirectorDTO director;
	
	//generating the getters and setters methods
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public Collection<ActorsDTO> getActors() {
		return actors;
	}

	public void setActors(Collection<ActorsDTO> actors) {
		this.actors = actors;
	}

	public DirectorDTO getDirector() {
		return director;
	}

	public void setDirector(DirectorDTO director) {
		this.director = director;
	}
}
