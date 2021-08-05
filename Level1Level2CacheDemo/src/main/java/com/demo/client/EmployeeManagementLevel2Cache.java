package com.demo.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class EmployeeManagementLevel2Cache {
	public static void main(String[] args) {
		
	//Level-1 cache memory - emp
		SessionFactory sf = new Configuration().configure("hiberanate.cfg.xml").buildSessionFactory();
		// session factory - attaches a second level cache
		
		Session session = sf.openSession(); 
		session.beginTransaction(); 
		Employee emp = session.get(Employee.class, 1);
		System.out.println(emp);
		Employee emp1 = session.get(Employee.class, 1);// it takes object from level -1 cache
		System.out.println(emp1);
		session.getTransaction().commit();
		session.close();
		Session session1 = sf.openSession(); // level 1 cache
		session1.beginTransaction(); 
		Employee emp2 = session1.get(Employee.class, 1);// it takes object from level -1 cache
		System.out.println(emp2);
		session1.getTransaction().commit();
		session1.close();
		sf.close();
	}
}
