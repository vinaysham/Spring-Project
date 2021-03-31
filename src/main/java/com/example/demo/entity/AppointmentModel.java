package com.example.demo.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AppointmentTable")
public class AppointmentModel {
	
	@Id
	@GeneratedValue
	private String AppointmentId;
	
	@Column(name = "userId")
	private UserModel userId;
	
	@Column(name = "date")
	private Date data;
	
	@Column(name= "description")
	private String Description;

	@Column(name = "issuedBy")
	private UserModel issuedBy;

	public String getAppointmnetId() {
		return AppointmentId;
	}

	public void setAppointmentId(String AppointmentId) {
		this.AppointmentId = AppointmentId;
	}

	public UserModel getUserId() {
		return userId;
	}

	public void setUserId(UserModel userId) {
		this.userId = userId;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescription() {
		return Description; 
	}
	public void setDescription(String Description) {
		this.Description = Description;
	}
	public UserModel getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(UserModel issuedBy) {
		this.issuedBy = issuedBy;
	}

}
