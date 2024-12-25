package com.zettamine.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zettamine.hibernate.entities.Student;

public class SaveStudent {
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction  = session.beginTransaction();
		
		Student student = new Student();
		
		student.setStudentId(101);
		student.setStudentName("Deva");
		student.setStudentEmail("deva@gmail.com");
		
		System.out.println(session.save(student));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		transaction.commit();
		
		session.close();
		sessionFactory.close();
	}

}
