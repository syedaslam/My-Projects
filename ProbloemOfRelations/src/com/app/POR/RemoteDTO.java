package com.app.POR;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="remote_properties")
public class RemoteDTO implements Serializable {
	@Column(name="remote_range")
	private int range;
	@Id
	@Column(name="remote_buttons")
	private int noOfButtons;
	@Column(name="remote_shape")
	private String shape;

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getNoOfButtons() {
		return noOfButtons;
	}

	public void setNoOfButtons(int noOfButtons) {
		this.noOfButtons = noOfButtons;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

}
