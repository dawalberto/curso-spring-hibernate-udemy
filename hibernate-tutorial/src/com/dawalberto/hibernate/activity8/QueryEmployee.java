package com.dawalberto.hibernate.activity8;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dawalberto.hibernate.demo.entity.Employee;

public class QueryEmployee {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Employee.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			
			int idEmployee = 3;
			String company = "Criminal Brigade";
			
			session.beginTransaction();
			
			System.out.println("Getting employee with id: " + idEmployee);
			Employee employee = session.get(Employee.class, idEmployee);
			
			System.out.println("Employee: " + employee);
			
			System.out.println("\nGetting employees from company " + company);
			List<Employee> employees = session.createQuery("from Employee "
					+ " where company LIKE '" + company + "'").list();			
			displayEmployees(employees);
			
			session.getTransaction().commit();
			System.out.println("Done!");
			
		}
		finally {
			factory.close();
		}
		
	}

	private static void displayEmployees(List<Employee> employees) {
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}

}
