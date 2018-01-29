package com.hibernate.app;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sports_table")
public class SportDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	// private data members.
	private String sportName;
	private String sportType;
	private int noOfPlayers;
	private int duration;

	// having getters and setters
	@Id
	@Column(name = "sports_name")
	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	@Column(name = "sports_type")
	public String getSportType() {
		return sportType;
	}

	public void setSportType(String sportType) {
		this.sportType = sportType;
	}

	@Column(name = "spots_noofplayers")
	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	@Column(name = "sports_duration")
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}

