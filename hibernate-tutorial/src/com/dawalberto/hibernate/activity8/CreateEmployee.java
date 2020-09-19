package com.dawalberto.hibernate.activity8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dawalberto.hibernate.demo.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			System.out.println("Creating employees...");
			Employee employee1 = new Employee("Patrick", "Jane", "Criminal Brigade");
			Employee employee2 = new Employee("Sherlock", "Holmes", "Autonomous Detective");
			Employee employee3 = new Employee("Bruce", "Wayne", "Philanthropist");

			session.beginTransaction();
			
			session.save(employee1);
			session.save(employee2);
			session.save(employee3);
			
			session.getTransaction().commit();
			System.out.println("Employees saved!");
			
		}
		finally {
			factory.close();
		}
		
	}

}
