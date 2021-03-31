package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BookingTable")
public class BookingModel {
	
	@Id
	@GeneratedValue
	private String bookingId;
	
	@OneToOne
	@JoinColumn(name = "userDetails")
	private UserModel clientDetail;
	
	@OneToOne
	@JoinColumn(name = "TrainerDetails")
	private BeauticianModel BeauticianDetail;
	private String lawfirmName;
	private Date date;
	private Date time;
	private Boolean bookingStatus;
	
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public UserModel getClientDetail() {
		return clientDetail;
	}
	public void setClientDetail(UserModel clientDetail) {
		this.clientDetail = clientDetail;
	}
	public BeauticianModel getBeauticianDetail() {
		return BeauticianDetail;
	}
	public void setBeauticianDetail(BeauticianModel beauticianDetail) {
		TrainerDetails = beauticianDetail;
	}
	public String getLawfirmName() {
		return lawfirmName;
	}
	public void setLawfirmName(String lawfirmName) {
		this.lawfirmName = lawfirmName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Boolean getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(Boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}	
	
}
