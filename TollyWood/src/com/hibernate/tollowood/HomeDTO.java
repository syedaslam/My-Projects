package com.hibernate.tollowood;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Directors_Address")
public class HomeDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Column(name="country")
	private String country;
	@Column(name="state")
	private String state;
	@Column(name="street")
	private String street;
	@Id
	@Column(name="door_no")
	private String doorno;
	
	//generating the getters and setters
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDoorno() {
		return doorno;
	}

	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}

}
