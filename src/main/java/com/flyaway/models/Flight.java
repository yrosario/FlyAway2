package com.flyaway.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightId;
	private String leavingFrom;
	private String arrivingAt;
	private Date departingDate;
	private String departingTime;
	private Date arrivalDate;
	private String arrivalTime;
	private String airline;
	private int capacity;
	private int seatsLeft;
	private float price;
	
	//One to many mapping between the passengers and tickets
	//A passenger can have many ticket, but a ticket can belong to
	//only one passenger
	@OneToMany(mappedBy="flight",
		       cascade = {CascadeType.PERSIST, CascadeType.MERGE, 
			              CascadeType.PERSIST, CascadeType.REFRESH})
	private List<Ticket> tickets;
	
	public Flight() {
		
	}

	public Flight(String leavingFrom, String arrivingAt, Date departingDate, String departingTime, Date arrivalDate,
			String arrivalTime, String airline, int capacity, int seatsLeft, float price) {
		super();
		this.leavingFrom = leavingFrom;
		this.arrivingAt = arrivingAt;
		this.departingDate = departingDate;
		this.departingTime = departingTime;
		this.arrivalDate = arrivalDate;
		this.arrivalTime = arrivalTime;
		this.airline = airline;
		this.capacity = capacity;
		this.seatsLeft = seatsLeft;
		this.price = price;
	}


	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getLeavingFrom() {
		return leavingFrom;
	}

	public void setLeavingFrom(String leavingFrom) {
		this.leavingFrom = leavingFrom;
	}

	public String getArrivingAt() {
		return arrivingAt;
	}

	public void setArrivingAt(String arrivingAt) {
		this.arrivingAt = arrivingAt;
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
	
	

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", leavingFrom=" + leavingFrom + ", arrivingAt=" + arrivingAt
				+ ", departingDate=" + departingDate + ", departingTime=" + departingTime + ", arrivalDate="
				+ arrivalDate + ", arrivalTime=" + arrivalTime + ", Airline=" + airline + ", capacity=" + capacity
				+ ", seatsLeft=" + seatsLeft + ", price=" + price + "]";
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	//method for bi-directional relationship
	public void add(Ticket newTicket) {
		
		if(tickets == null) {
			tickets = new ArrayList<>();
		}
		
		tickets.add(newTicket);
		
		//add passenger to ticket table
		newTicket.setFlight(this);
	}
	
	

	
	
}
