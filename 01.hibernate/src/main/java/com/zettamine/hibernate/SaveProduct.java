package com.zettamine.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zettamine.hibernate.entities.Product;

public class SaveProduct {

	public static void main(String[] args) {
		SessionFactory sessionFactory = ConfigurationUtility.getSessionFactory();
		
		Session session  = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(new Product("t.v", 40000));
		
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();

	}

}
