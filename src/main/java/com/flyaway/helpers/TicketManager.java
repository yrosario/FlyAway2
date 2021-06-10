package com.flyaway.helpers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
	
	//adds a ticket to the ticket table
	public boolean addTicket(int flightNum, float price) {
		
		try {
			Ticket newTicket = new Ticket(price);
			session.save(newTicket);
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
