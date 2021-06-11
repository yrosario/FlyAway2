package com.flyaway.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue
	private int id;
	private Date purchasedDate;
	private String seatNum;
	private float price;
	
	//Many to one mapping from ticket table to passenger table
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, 
			  CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="passengerId")
	private Passenger passenger;
	
	
	//Many to one mapping from ticket table to flight table
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, 
			    CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="flightId")
	private Flight flight;
	
	
	public Ticket() {
	}

	public Ticket(float price) {
		super();
		this.price = price;
		purchasedDate = new Date();
	}

	public int getId() {
		return id;
	}
	
	public Date getPurchasedDate() {
		return purchasedDate;
	}

	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", purchasedDate=" + purchasedDate + ", seatNum=" + seatNum + ", price=" + price
				+ "]";
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	
	
	
	
}
