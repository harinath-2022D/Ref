package com.zettamine.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zettamine.hibernate.entities.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		
		SessionFactory sfactory = ConfigurationUtility.getSessionFactory();
		
		Session session = sfactory.openSession();
		
		session.beginTransaction();
		
//		session.delete(new Student(103, "", "")); // thorw an exception because 103 is not present
		
//		Student st = session.get(Student.class, "Deva"); // type mismatch exception
		
		Student st = session.get(Student.class, 101);
		if(st != null) {
//			session.detach(st);
			
			session.delete(st);
		}
		System.out.println(st);
		
		session.getTransaction().commit();
		

	}

}
