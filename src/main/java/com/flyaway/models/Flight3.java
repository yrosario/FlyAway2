package com.flyaway.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Flight3 {
	
	@Id
	@GeneratedValue
	private int flightId;
	private String from;
	private String to;
	private Date departingDate;
	private String departingTime;
	private Date arrivalDate;
	private String arrivalTime;
	private String airline;
	private int capacity;
	private int seatsLeft;
	
	public Flight3() {
		super();
	}

	
	public Flight3(int flightId) {
		super();
		this.flightId = flightId;
	}


	public Flight3(String from) {
		super();
		this.from = from;
		
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Date getDepartingDate() {
		return departingDate;
	}

	public void setDepartingDate(Date departingDate) {
		this.departingDate = departingDate;
	}

	public String getDepartingTime() {
		return departingTime;
	}

	public void setDepartingTime(String departingTime) {
		this.departingTime = departingTime;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSeatsLeft() {
		return seatsLeft;
	}

	public void setSeatsLeft(int seatsLeft) {
		this.seatsLeft = seatsLeft;
	}
	
	
	
}
