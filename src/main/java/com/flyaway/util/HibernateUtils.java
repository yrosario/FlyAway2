package com.flyaway.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static Configuration config;
	private static StandardServiceRegistryBuilder builder;
	private static SessionFactory factory;
	
	public static SessionFactory getSessionFactory() {
		
		if(factory == null) {
			try {
				config = new Configuration().configure();
				
				config.addAnnotatedClass(com.flyaway.models.Passenger.class);
				config.addAnnotatedClass(com.flyaway.models.Ticket.class);
				config.addAnnotatedClass(com.flyaway.models.Flight3.class);
				config.addAnnotatedClass(com.flyaway.models.Test.class);
	
				builder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
				factory = config.buildSessionFactory(builder.build());
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return factory;
	}

}
