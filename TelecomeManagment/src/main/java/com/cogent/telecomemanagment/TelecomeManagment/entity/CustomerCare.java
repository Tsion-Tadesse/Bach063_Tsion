package com.cogent.telecomemanagment.TelecomeManagment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CustomerCare {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long complaint_id;
private String complaint_description;
private long user_id;
private String complaint_status;
public long getComplaint_id() {
	return complaint_id;
}
public void setComplaint_id(long complaint_id) {
	this.complaint_id = complaint_id;
}
public String getComplaint_description() {
	return complaint_description;
}
public void setComplaint_description(String complaint_description) {
	this.complaint_description = complaint_description;
}
public long getUser_id() {
	return user_id;
}
public void setUser_id(long user_id) {
	this.user_id = user_id;
}
public String getComplaint_status() {
	return complaint_status;
}
public void setComplaint_status(String complaint_status) {
	this.complaint_status = complaint_status;
}
public CustomerCare() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "CustomerCare [complaint_id=" + complaint_id + ", complaint_description=" + complaint_description
			+ ", user_id=" + user_id + ", complaint_status=" + complaint_status + "]";
}

}
