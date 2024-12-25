package com.zettamine.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zettamine.hibernate.entities.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sessionFactory = ConfigurationUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
//		Student st = new Student();
//		
//		st = session.get(Student.class, 101);
//		System.out.println(st);
//		
//		st.setStudentName("vijay govind"); // dirty object means in database level session level data inconsistency
		
		
//		Student st = session.get(Student.class, 101);
//		if(st != null) {
//			System.out.println(st);
//			
//		}else {
//			
//		}
		
		Student st = new Student(101, "Deva", "deva@gmail.com");
		session.update(st); // update only works if the data available in database  other wise it will throw stale state exception
		
		session.getTransaction().commit();
		
		System.out.println(st);
	}

}
