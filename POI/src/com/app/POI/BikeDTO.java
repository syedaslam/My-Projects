package com.app.POI;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bike_table")
public class BikeDTO extends VehicleDTO
{

	@Column(name="starter_Type")
	private String starterType;

	public String getStarterType() {
		return starterType;
	}

	public void setStarterType(String starterType) {
		this.starterType = starterType;
	}

}
