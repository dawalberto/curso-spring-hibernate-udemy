package com.dawalberto.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dawalberto.hibernate.demo.entity.Course;
import com.dawalberto.hibernate.demo.entity.Instructor;
import com.dawalberto.hibernate.demo.entity.InstructorDetail;

public class GetInstructorCoursesDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {

			// start a transaction
			session.beginTransaction();
			
			// get the instructor from db
			int id = 1;
			Instructor tempInstructor = session.get(Instructor.class, id);

			System.out.println("Instructor: " + tempInstructor);
			
			// get course for the instructor
			System.out.println("Courses: " + tempInstructor.getCourses());
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			session.close();
			factory.close();
		}
		
	}

}
