package com.flyaway.helpers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flyaway.models.Passenger;
import com.flyaway.models.Ticket;
import com.flyaway.util.HibernateUtils;

public class BuyTicket {
	
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;
	
	public BuyTicket() {
		
		factory = HibernateUtils.getSessionFactory();
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean buy(int ticketNum, int flightId, int passengerId) {
		
		try {
			Passenger passenger = session.get(Passenger.class, passengerId);
			//Ticket ticket = session.get(Ticket.class, ticketNum);
			
			//Ticket ticket = new Ticket(34.34f);
			
			//Associate passenger to a ticket and vice versa 
			//passenger.add(ticket);
			//flight.add(ticket);
			//.save(ticket);
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
