package com.flyaway.helpers;

import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flyaway.models.Flight3;
import com.flyaway.models.Test;
import com.flyaway.util.HibernateUtils;

public class FlightManager {
	
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;
	
	public FlightManager() {
		
		factory = HibernateUtils.getSessionFactory();
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean addFlight(String from, String to, String departingDate,
			String departingTime, String arrivalDate, String arrivalTime,
			String airline, int capacity, int seatsLeft) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	
		try {
			Test flight = new Test(from, to);
			
			//Flight3 flight = new Flight3("df");
			//Test test = new Test(2);
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

}
