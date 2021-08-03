package com.demo.client;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.model.Employee;

public class EMS {
	public static void main(String[] args) {
		Employee e=new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your ID");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Please enter your Name");
		String eName = sc.nextLine();
		e.seteId(id);
		e.seteName(eName);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ems");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin(); 
		em.persist(e); // insert
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
