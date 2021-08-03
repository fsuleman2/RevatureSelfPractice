package com.demo.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Ams {
	public static void main(String[] args) {
		Associate a1=new Associate();
	//	a1.setAssociateId(105);
		a1.setEmail("karthik@gmail.com");
		a1.setName("kart");
		
		Employee e1=new Employee();
	//	e1.seteId(501);
		e1.setEname("karthik");
				
		// hibernate.cfg.xml   
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("");
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory();
//		EntityManager em=emf.createEntityManager();
		Session session=sf.openSession();
		session.getTransaction().begin();
		session.persist(a1);
		session.persist(e1);
		session.getTransaction().commit();
		session.close();
		sf.close();
		
	}
}
