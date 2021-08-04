package com.ems.dao.impl;

import org.hibernate.Session;

import com.ems.dao.EmployeeDAO;
import com.ems.dbutil.PostgresHibernateConnection;
import com.ems.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public int addEmployee(Employee e) {
		// hibernate code to save or persist
		Session session=PostgresHibernateConnection.getSession();
		session.beginTransaction();
		int result=(int) session.save(e);
		session.getTransaction().commit();
		session.close();
		return result;
	}

	@Override
	public Employee findEmployeeById(int searchId) {
		// hibernate code get the data from the db
		Session session=PostgresHibernateConnection.getSession();
		session.beginTransaction();
		Employee emp=session.get(Employee.class, searchId);
		session.getTransaction().commit();
		session.close();
		
		return emp;
	}

	@Override
	public void updateEmployee(Employee e) {
		
		Session session=PostgresHibernateConnection.getSession();
		session.beginTransaction();
		//session.merge(e);
		session.update(e);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void deleteEmployee(Employee e) {
		Session session=PostgresHibernateConnection.getSession();
		session.beginTransaction();
		session.delete(e);
		session.getTransaction().commit();
		session.close();
		
	}

}
