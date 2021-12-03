package com.demo.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.Employee;

public class EmployeeManagement {
	public static void main(String[] args) throws IOException {
		Employee e=new Employee();
		e.seteName("Suleman");
//		setting the address
		Address address = new Address();
		address.setCity("Hyderabad");
		address.setOpen(true);
		address.setStreet("RiyasathN agar");
		address.setX(1234.34);
		address.setAddedDate(new Date());
		
		//reading an image
		FileInputStream fis = new FileInputStream("src/main/java/Untitled.png");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		address.setImage(data);
		Configuration con = new Configuration();
		SessionFactory sf=con.configure("hiberanate.cfg.xml").buildSessionFactory();
		
		Session session = sf.openSession();
		//em.getTransaction().begin();  in JPA
		session.beginTransaction(); // transaction object t
		session.persist(e);
		session.save(address);
		session.getTransaction().commit();
		session.close();
		
		
		sf.close();
		
		
		}
}
