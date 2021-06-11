package com.flyaway.helpers;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.flyaway.models.Admin;
import com.flyaway.util.HibernateUtils;

public class AdminManager {
	
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;
	private int userId;
	
	public AdminManager() {
		

	}
	
	private void startSession() {
		factory = HibernateUtils.getSessionFactory();
		try {
			session = factory.openSession();
			transaction = session.beginTransaction();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean addAdmin(String username, String password) {
		startSession();
		
		try {
			Admin admin = new Admin(username, password);
			session.save(admin);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			session.close();
		}
		
	}
	
	public boolean authenticate(String username, String password) {
		startSession();
		
		try {
			//Run query for user 
			Query<Admin> query = session.createQuery("FROM Admin WHERE UPPER(username)='" + username.toUpperCase()
													+ "' and password='" + password + "'", Admin.class);
			
			//if user user found return true else return false
			List<Admin> admins = query.getResultList();
			
			
			if(admins.get(0) != null) {
				userId = admins.get(0).getAdminId();
				return true;
			}
			else
				return false;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			session.close();
		}
	}
	
	public boolean changePassword(String username, String password) {
		startSession();
		
		try {
			//Run query for user 
			Query<Admin> query = session.createQuery("FROM Admin WHERE UPPER(username)='" + username.toUpperCase()
													+"'", Admin.class);
			
			//if user user found return true else return false
			List<Admin> admins = query.getResultList();
			
			
			//change password
			if(admins.get(0) != null) {
				admins.get(0).setPassword(password);
				session.save(admins.get(0));
				transaction.commit();
				return true;
			}
			else
				return false;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			session.close();
		}
		
	}
	
	public int getLastUseId() {
		return userId;
	}

}
