package com.cogent.telecomemanagment.TelecomeManagment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Plans {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long plan_id;
	private String plan_name;
	private double cost;
	private String validity;
	
	public long getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(long plan_id) {
		this.plan_id = plan_id;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public Plans() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Palns [plan_id=" + plan_id + ", plan_name=" + plan_name + ", cost=" + cost + ", validity=" + validity
				+ "]";
	}
	
	
}
