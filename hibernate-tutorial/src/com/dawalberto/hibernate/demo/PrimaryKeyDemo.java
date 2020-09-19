package com.dawalberto.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dawalberto.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String args[]) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// create 2 student objects
			System.out.println("Creating new student objects...");
			Student tempStudent = new Student("John", "Doe", "john@springcourse.com");
			Student tempStudent2 = new Student("Paul", "Wall", "paul@springcourse.com");
			Student tempStudent3 = new Student("Mary", "Public", "mary@springcourse.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the student objects
			System.out.println("Saving the students...");
			session.save(tempStudent);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
		
	}
	
}
