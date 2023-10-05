package com.flyaway.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flyaway.models.Flight;;

public class FlightRepository implements GenericRepository<Integer, Flight>{
	
	private SessionFactory factory;

	
	public FlightRepository(SessionFactory factory) {
		super();
		this.factory = factory;
	}
	


	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Flight save(Flight flight) {
		SessionFactory sessionFactory = this.factory.getSessionFactory();
		Session session;
		Transaction transaction;
		try{
			session = sessionFactory.openSession();
			transaction = session.getTransaction();
			session.save(flight);
			transaction.commit();
			session.close();
			return flight;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Flight update(Flight m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
