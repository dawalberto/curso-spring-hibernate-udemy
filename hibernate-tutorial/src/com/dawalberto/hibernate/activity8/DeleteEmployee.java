package com.dawalberto.hibernate.activity8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dawalberto.hibernate.demo.entity.Employee;

public class DeleteEmployee {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			int idEmployee = 3;
			
			session.beginTransaction();
			
			System.out.println("Getting employee with id: " + idEmployee + " to be deleted");
			Employee employee = session.get(Employee.class, idEmployee);
			
			System.out.println("Deletting employee " + employee);
			session.delete(employee);
			
			session.getTransaction().commit();
			System.out.println("Employee deleted");
			
		}
		finally {
			factory.close();
		}
		
	}

}
