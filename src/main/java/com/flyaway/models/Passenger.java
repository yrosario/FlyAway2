package com.flyaway.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="passenger")
public class Passenger {
	
	@Id
	@GeneratedValue
	private int passengerId;
	private String fname;
	private String lname;
	private int age;
	private String street;
	private String city;
	private String state;
	private String country;
	
	//One to many mapping between the passengers and tickets
	//A passenger can have many ticket, but a ticket can belong to
	//only one passenger
	@OneToMany(fetch=FetchType.LAZY,
			   mappedBy="passenger",
		       cascade = {CascadeType.PERSIST, CascadeType.MERGE, 
			              CascadeType.PERSIST, CascadeType.REFRESH})
	private List<Ticket> tickets;
	
	public Passenger() {
		
	}

	public Passenger(String fname, String lname, int age, String street, String city, String state,
			String country) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public int getId() {
		return passengerId;
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + passengerId + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", Street=" + street
				+ ", city=" + city + ", state=" + state + ", country=" + country + "]";
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
		newTicket.setPassenger(this);
	}
	
	
	
	
}
