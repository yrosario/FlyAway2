package com.flyaway.helpers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flyaway.models.Flight;
import com.flyaway.models.Passenger;
import com.flyaway.models.Ticket;
import com.flyaway.util.HibernateUtils;

public class TicketManager {
	
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;
	
	public TicketManager() {
		
		factory = HibernateUtils.getSessionFactory();
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Create relationship between ticket and flight and passenger and ticket
	public boolean addTicket(int firstFlight, int secondFlight, int numPassengers, int userId) {
		
		try {
			
			Flight flight1 = session.get(Flight.class, firstFlight);
			Flight flight2 = session.get(Flight.class, secondFlight);
			Passenger passenger = session.get(Passenger.class, userId);
			
			//Add ticket base how many tickets requested
			for(int i = 0; i < numPassengers; i++) {
				Ticket tck1 = new Ticket();
				Ticket tck2 = new Ticket();
				
				flight1.add(tck1);
				flight2.add(tck2);
				
				//decrease flight available seating
				flight1.setSeatsLeft(flight1.getSeatsLeft() - 1);
				flight1.setSeatsLeft(flight2.getSeatsLeft() - 1);
				
				passenger.add(tck1);
				passenger.add(tck2);
			}
			
			session.save(passenger);
			session.save(passenger);
			
			session.save(flight1);
			session.save(flight2);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			session.close();
		}
	}

}
