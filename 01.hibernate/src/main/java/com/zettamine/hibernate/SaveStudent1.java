package com.zettamine.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zettamine.hibernate.entities.Student;

public class SaveStudent1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String req = "";

		SessionFactory sfactory = ConfigurationUtility.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();

		do {
			System.out.print("Enter student name and Email : \n");

			String name = sc.next();
			String email = sc.next();
			
			Student student = new Student(name, email);
			
			System.out.println(session.save(student));

			System.out.print("Do you want to add more students: [Y/N]  ");
			req = sc.next();

		} while (req.equalsIgnoreCase("n") == false);
		
		tx.commit();

	}

}
