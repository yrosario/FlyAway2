package com.flyaway.service;

import java.util.Date;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.flyaway.models.Flight;
import com.flyaway.repository.FlightRepository;
import com.flyaway.repository.GenericRepository;
import com.flyaway.util.HibernateUtils;

public class FlightRepositoryTest {
	
	private GenericRepository<Integer, Flight> flightRepository;

	public FlightRepositoryTest() {
		this.flightRepository = new FlightRepository(HibernateUtils.getSessionFactory());
	}
	
	
	@Test
	void saveFlightTest() {
		
		Flight flight = new Flight();
		flight.setAirline("test");
		flight.setArrivalDate(new Date());
		flight.setFlightId(1);
		flight.setLeavingFrom("New York");
		flight.setArrivingAt("Boston");
	    this.flightRepository.save(flight);
	    
	    Assert.assertNotNull(flight);
	    
	}
	

}
