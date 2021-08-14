package com.demo.client;

import org.hibernate.Session;

import com.demo.model.Country;
import com.demo.model.Player;
import com.ems.dbutil.PostgresHibernateConnection;

public class Capi {
	public static void main(String[] args) {
		Player p1=new Player();
		p1.setPlayer_Id(101);
		p1.setPlayer_name("Dhoni");
		
		Country c1=new Country();
		c1.setCountry_Id(10002);
		c1.setCountry_name("AUS");
		c1.setPlayer(p1);
		
		p1.setCountry(c1);
		
		
		Session session=PostgresHibernateConnection.getSession();
		session.beginTransaction();
		session.save(p1);
		session.save(c1);
		session.getTransaction().commit();
		session.close();
		
	}
}
