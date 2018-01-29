package com.app.POI;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="car_table")
public class CarDTO extends VehicleDTO {
	@Column(name="steering_Type")
	private String steeringType;
	@Column(name="gear_Type")
	private String gearType;
	

	public String getSteeringType() {
		return steeringType;
	}

	public void setSteeringType(String steeringType) {
		this.steeringType = steeringType;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

}
