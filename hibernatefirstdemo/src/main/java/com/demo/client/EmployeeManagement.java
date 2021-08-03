package com.demo.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class EmployeeManagement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your ID");
		Employee e=new Employee();
		e.seteId(s.nextInt());
		s.nextLine();
		System.out.println("Enter your Name");
		e.seteName(s.nextLine());
		SessionFactory sf=new Configuration().configure("hiberanate.cfg.xml")
				.buildSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction(); // transaction object t
		session.persist(e);
		session.getTransaction().commit();
		session.close();
		sf.close();
		}
}
