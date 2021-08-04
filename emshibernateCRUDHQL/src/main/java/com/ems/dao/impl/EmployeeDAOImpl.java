package com.ems.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.ems.dao.EmployeeDAO;
import com.ems.dbutil.PostgresHibernateConnection;
import com.ems.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public int addEmployee(Employee e) {
		// hibernate code to save or persist
		Session session=PostgresHibernateConnection.getSession();
		session.beginTransaction();
		int result=(int) session.save(e);// HQL - insert  
		session.getTransaction().commit();
		session.close();
		return result;
	}

	@Override
	public Employee findEmployeeById(int searchId) {
		// hibernate code get the data from the db
		Session session=PostgresHibernateConnection.getSession();
		session.beginTransaction();
	//	Employee emp=session.get(Employee.class, searchId);
		Query<Employee> q = session.createQuery("from Employee where employeeId=:empId",Employee.class);
		q.setParameter("empId",searchId);
		List<Employee> list=q.getResultList();// executeQuery --> resultset --> model class --> add to arraylist
		
		session.getTransaction().commit();
		session.close();
		
		return list.get(0);
	}

	@Override
	public void updateEmployee(Employee e) {
		
		Session session=PostgresHibernateConnection.getSession();
		session.beginTransaction();
		//session.merge(e);
		//session.update(e);
		Query q = session.createQuery("update Employee set employeeName=:ename,salary=:sal,department=:dept where employeeId=:eId");
		q.setParameter("ename", e.getEmployeeName());
		q.setParameter("sal", e.getSalary());
		q.setParameter("dept", e.getDepartment());
		q.setParameter("eId", e.getEmployeeId());
		int t = q.executeUpdate();
		if(t!=0) {
			System.out.println("Employee details got updated success");
		}else {
			System.out.println("Employee details not updated");
		}
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void deleteEmployee(Employee e) {
		Session session=PostgresHibernateConnection.getSession();
		session.beginTransaction();
		//session.delete(e);
		String query ="delete from Employee where employeeId=:eId";
		Query q=session.createQuery(query);
		q.setParameter("eId", e.getEmployeeId());
		int t = q.executeUpdate();
		if(t!=0) {
			System.out.println("Employee details got deleted success");
		}else {
			System.out.println("Employee details not deleted");
		}
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		Session session=PostgresHibernateConnection.getSession();
		session.beginTransaction();
		Query<Employee> q = session.createQuery("from Employee",Employee.class);
		List<Employee> list=q.getResultList();// executeQuery --> resultset --> model class --> add to arraylist
		
		session.getTransaction().commit();
		session.close();
		
		return list;
		
	}

}
