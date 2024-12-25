package com.zettamine.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zettamine.hibernate.entities.Student;

public class GetStudent {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = ConfigurationUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		
//		Student st = session.load(Student.class, 101);
//		Student st = (Student) session.load("com.zettamine.hibernate.entities.Student", 101);
		
		
//		Student st = session.get(Student.class, 10);
		Student st = (Student) session.get("com.zettamine.hibernate.entities.Student", 10);
		
		System.out.println(st);

	}

}
