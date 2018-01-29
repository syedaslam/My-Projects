package com.app.POI;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Vehicle_table")
@Inheritance(strategy=InheritanceType.JOINED)
public class VehicleDTO implements Serializable {
	@Column(name="fuel_Type")
	private String fuelType;
	@Column(name="vehicle_mileage")
	private int mileage;
	@Id
	@GenericGenerator(name="gen",
	strategy="increment")
	@GeneratedValue(generator="gen")
	@Column(name="chasis_Number")
	private int chasisNumber;

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(int chasisNumber) {
		this.chasisNumber = chasisNumber;
	}

}
