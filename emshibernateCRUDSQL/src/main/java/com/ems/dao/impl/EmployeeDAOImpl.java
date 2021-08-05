package com.ems.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
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
		int result=(int) session.save(e);
		session.getTransaction().commit();
		session.close();
		return 0;
	}

	@Override
	public Employee findEmployeeById(int searchId) {
		// hibernate code get the data from the db
		Session session=PostgresHibernateConnection.getSession();
		session.beginTransaction();
		
		NativeQuery<Employee> nq = session.createNativeQuery("select * from employee_details where employeeid=?",Employee.class);
		nq.setParameter(1, searchId);
		List<Employee> e =  nq.getResultList();
		System.out.println(e.get(0));
		session.getTransaction().commit();
		session.close();
		
		return e.get(0);
	}

	@Override
	public void updateEmployee(Employee e) {
		
		Session session=PostgresHibernateConnection.getSession();
		session.beginTransaction();
		//session.merge(e);
		//session.update(e);
		NativeQuery<Employee> q = session.createNativeQuery("update employee_details set employeename=?,salary=?,department=? where employeeId=?",Employee.class);
		q.setParameter(1, e.getEmployeeName());
		q.setParameter(2, e.getSalary());
		q.setParameter(3, e.getDepartment());
		q.setParameter(4, e.getEmployeeId());
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
	//	Query q=session.createQuery(query);
//		q.setParameter("eId", e.getEmployeeId());
//		int t = q.executeUpdate();	//session.delete(e);
//		String query ="delete from Employee where employeeId=:eId";
//	if(t!=0) {
		/*
		 * System.out.println("Employee details got deleted success"); }else {
		 * System.out.println("Employee details not deleted"); }
		 */
		
		// kindly replace HQL code into native sql code
		
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
