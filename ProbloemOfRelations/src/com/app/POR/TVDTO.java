package com.app.POR;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="tv_properties")
public class TVDTO implements Serializable {
	@Id
	@Column(name="tv_name")
	private String name;
	@Column(name="tv_size")
	private int size;
	@Column(name="tv_type")
	private String type;
	@Column(name="tv_color")
	private String color;
	
	//has a relationship
	@OneToOne(cascade=CascadeType.ALL)
	private RemoteDTO remote;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public RemoteDTO getRemote() {
		return remote;
	}

	public void setRemote(RemoteDTO remote) {
		this.remote = remote;
	}

}
