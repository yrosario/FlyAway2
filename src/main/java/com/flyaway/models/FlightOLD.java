package com.flyaway.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


public class FlightOLD {

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
	
	//One to many mapping between the flights and tickets
	//A flight can have many ticket, but a ticket can belong to
	//only one flight
	/*@OneToMany(fetch=FetchType.LAZY,
			mappedBy="flight",
		       cascade = {CascadeType.PERSIST, CascadeType.MERGE, 
			              CascadeType.PERSIST, CascadeType.REFRESH})
	private List<Ticket> tickets;*/

	public FlightOLD() {
		super();
	}


	public FlightOLD(String from, String to, Date departingDate, String departingTime, Date arrivalDate,
			String arrivalTime, String airline, int capacity, int seatsLeft) {
		super();
		this.from = from;
		this.to = to;
		this.departingDate = departingDate;
		this.departingTime = departingTime;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.airline = airline;
		this.capacity = capacity;
		this.seatsLeft = seatsLeft;
	}


	public int getFlightId() {
		return flightId;
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

	public void setReturningDate(Date returningDate) {
		this.arrivalDate = returningDate;
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

	public void setAirlineId(String airline) {
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

	@Override
	public String toString() {
		return "Flight [id=" + flightId + ", from=" + from + ", to=" + to + ", departingDate=" + departingDate
				+ ", departingTime=" + departingTime + ", arrivalDate=" + arrivalDate + ", arrivalTime=" + arrivalTime
				+ ", airlineId=" + airline + ", capacity=" + capacity + ", seatsLeft=" + seatsLeft + "]";
	}

	/*public List<Ticket> getTickets() {
		return tickets;
	}*/

/*	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	//method for bi-directional relationship
	public void add(Ticket newTicket) {
		
		if(tickets == null) {
			tickets = new ArrayList<>();
		}
		
		tickets.add(newTicket);
		
		//add passenger to ticket table
		//newTicket.setFlight(this);
	}
	*/

	
}
