package com.flyaway.helpers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flyaway.models.Passenger;
import com.flyaway.util.HibernateUtils;

public class RegisterPassenger {

	private SessionFactory factory;
	private Session session;
	private Transaction transaction;
	
	public RegisterPassenger() {
		
		factory = HibernateUtils.getSessionFactory();
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean add(String fname, String lname, String age, String street, 
			String city, String state, String country) {
		
		try {
			Passenger passenger = new Passenger(fname, lname, Integer.parseInt(age), street, city, state, country);
			session.save(passenger);
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
