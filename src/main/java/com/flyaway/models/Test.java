package com.flyaway.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Test {

	@Id
	@GeneratedValue
	private int flightId;
	private String from;
	private String to;


	
	public Test() {
		super();
	}

	public Test(String from, String to) {
		super();
		this.from = from;
		this.to = to;
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



}
