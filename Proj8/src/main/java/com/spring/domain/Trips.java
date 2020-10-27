package com.spring.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Trips {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column
	private Date date;
	@Column
	private String journeyType;
	public String getJourneyType() {
		return journeyType;
	}
	public void setJourneyType(String journeyType) {
		this.journeyType = journeyType;
	}
	@ManyToOne
	@JoinColumn(name="vehicle_id")
	private Vehicle vehicle;
	@ManyToOne
	@JoinColumn(name="fare_id")
	private Fare fare;
	@ManyToOne
	@JoinColumn(name="tollBooth_id")
	private TollBooth tollBooth;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Fare getFare() {
		return fare;
	}
	public void setFare(Fare fare) {
		this.fare = fare;
	}
	public TollBooth getTollBooth() {
		return tollBooth;
	}
	public void setTollBooth(TollBooth tollBooth) {
		this.tollBooth = tollBooth;
	}
	
}
