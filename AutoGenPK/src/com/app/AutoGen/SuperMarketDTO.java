package com.app.AutoGen;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="supermarket_table")
/*@NamedQuery(name="getBySlNo",
query="from SuperMarketDTO where slNo=:slno")
@NamedQuery(name="getByNoOfEmp",query="from SuperMarketDTO where"
		+ "noOfEmployees=:noOfEmp")*/

@NamedQueries({@NamedQuery(name="getBySlNo",
query="from SuperMarketDTO where slNo=:slno")
	,
	
	@NamedQuery(name="getByNoOfEmp",query="from SuperMarketDTO where "
			+ "noOfEmployees=:noOfEmp")
})
public class SuperMarketDTO implements Serializable {
	@Column(name="market_name")
	private String name;
	@Column(name="market_rating")
	private int rating;
	@Column(name="no_Of_Employees")
	private int noOfEmployees;
	@Column(name="market_owner")
	private String owner;
	@Id
	@GenericGenerator(name="gen",
	strategy="increment")
	@GeneratedValue(generator="gen")
	@Column(name="sl_no")
	private int slNo;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	public SuperMarketDTO() {
	}
	public int getSlNo() {
		return slNo;
	}
	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}	
	
	
}
