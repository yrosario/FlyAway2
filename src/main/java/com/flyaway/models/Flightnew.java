package com.flyaway.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Flightnew {
	
	@Id
	@GeneratedValue
	@Column(name="flightId")
	private int flightId;
	private String from;
	private String to;
	private String departingDate;
	private String departingTime;
	private String arrivalDate;
	private String arrivalTime;
	private String airline;
	private int capacity;
	private int seatsLeft;
	
	public Flightnew() {
		super();
	}

	public Flightnew(String from, String to, String departingDate, String departingTime, String arrivalDate,
			String arrivalTime, String airline) {
		super();
		this.from = from;
		this.to = to;
		this.departingDate = departingDate;
		this.departingTime = departingTime;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.airline = airline;

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

	public String getDepartingDate() {
		return departingDate;
	}

	public void setDepartingDate(String departingDate) {
		this.departingDate = departingDate;
	}

	public String getDepartingTime() {
		return departingTime;
	}

	public void setDepartingTime(String departingTime) {
		this.departingTime = departingTime;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
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
