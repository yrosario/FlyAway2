package com.flyaway.helpers;

import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.flyaway.models.Flight;
import com.flyaway.util.HibernateUtils;

public class FlightManager {
	
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;
	
	public FlightManager() {
		
		factory = HibernateUtils.getSessionFactory();
	}
	
	private void beginSession() {
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean addFlight(String from, String to, String departingDate,
			String departingTime, String arrivalDate, String arrivalTime,
			String airline, int capacity, int seatsLeft, float price) {
		
		//Initialize session
		beginSession();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
	
		try {
			Flight flight = new Flight(from, to, format.parse(departingDate), departingTime, format.parse(arrivalDate),
					arrivalTime, airline, capacity, seatsLeft, price);
			
			session.save(flight);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			session.close();
		}
	}
	
	//Get flights entity for all flights matching critiria
	public List<Flight> searchFlight(String from, String to, String departingDate, int numberOfPassengers) {
		
		//Initialize session
		beginSession();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm a");
		System.out.println("DATE VALUE: " + from);
		try {
			Query<Flight> query = session.createQuery("FROM Flight WHERE date(departingDate)='" +departingDate + "' and leavingFrom='"+from+
					"' and arrivingAt='"+to+"' and seatsLeft>='"+numberOfPassengers+"'", Flight.class);
			
			List<Flight> flights = query.getResultList();
			
			/*for(Flight fl : flights)
				System.out.println("Flight List : " + dateFormat.parse(fl.getDepartingTime()));*/
			return flights;
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

}
