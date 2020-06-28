package com.dawalberto.jdbc;

import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSl=false&serverTimezone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection successful!!!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ups");
		}

	}

}
