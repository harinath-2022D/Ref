package com.zettamine.hibernate;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.zettamine.hibernate.entities.Student;

public class HqlPractice {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = ConfigurationUtility.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
//		String hql = "from com.zettamine.hibernate.entities.Student";
//		Query<Student> q = session.createQuery(hql, Student.class);
//		List<Student> list = q.list();
//		for(Student s : list) {
//			System.out.println(s);
//		}
		
		
//		String hql = "from com.zettamine.hibernate.entities.Student where studentId = 102";
//		Query<Student> q = session.createQuery(hql, Student.class);
//		q.setParameter("id", 101);
//		Student st = q.getSingleResult();
//		System.out.println(st);

		
//		String hql = "from com.zettamine.hibernate.entities.Student where studentName like '%a%' ";
//		Query<Student> q = session.createQuery(hql, Student.class);
//		List<Student> list = q.getResultList();
//		for(Student s : list) {
//			System.out.println(s);
//		}
		
//		String hql = "from com.zettamine.hibernate.entities.Student where studentId between 100 and 200";
//		Query<Student> q = session.createQuery(hql, Student.class);
//		q.setMaxResults(5); 
//		List<Student> result = q.list();
//		for(Student s : result) {
//			System.out.println(s);
//		}
		
//		String hql = "select stu.studentName , stu.studentEmail from com.zettamine.hibernate.entities.Student stu";
//		Query<Object[]> q = session.createQuery(hql, Object[].class);
//		List<Object[]> list = q.getResultList();
//		for(Object[] obj : list) {
//			System.out.println(Arrays.toString(obj));
//		}
		
//		String hql = "from com.zettamine.hibernate.entities.Student where studentId= :id";
//		Query<Student> q = session.createQuery(hql, Student.class);
//		q.setParameter("id", 102);
//		Student st = q.getSingleResult();
//		System.out.println(st);
		
//		String hql = "from com.zettamine.hibernate.entities.Student where studentName like :p";
//		Query<Student> q = session.createQuery(hql, Student.class);
//		q.setParameter("p", "D%");
//		List<Student> list = q.list();
//		for(Student s : list) {
//			System.out.println(s);
//		}
		
//		String hql = "select count(*) from com.zettamine.hibernate.entities.Student ";
//		Query<Object> q = session.createQuery(hql, Object.class);
//		Long count = (Long) q.getSingleResult();
//		System.out.println("Total students : " + count);
		
//		session.beginTransaction();
//		String hql = "update com.zettamine.hibernate.entities.Student set studentEmail = 'deva@zettamine.in' where studentId = 103";
//		Query q = session.createQuery(hql);
//		int rowsUpdated = q.executeUpdate();
//		System.out.println("Rows Updated : " + rowsUpdated);
//		session.getTransaction().commit();
		
//		String hql = "select stu.studentName from com.zettamine.hibernate.entities.Student stu order by stu.studentEmail";
//		Query<String> q = session.createQuery(hql, String.class);
//		List<String> list = q.list();
//		for(String s : list) {
//			System.out.println(s);
//		}
		
//		String hql = "";
//		Query<Student> q = session.createNamedQuery(hql, Student.class);
//		List<Student> list = q.list();
//		for(Student s : list) {
//			System.out.println(s);
//		}
		
		
		session.close();
		sessionFactory.close();

	}

}
