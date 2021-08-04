package com.ems.service.impl;

import com.ems.dao.EmployeeDAO;
import com.ems.dao.impl.EmployeeDAOImpl;
import com.ems.model.Employee;
import com.ems.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public int addEmployee(Employee e) {
		EmployeeDAO edao=new EmployeeDAOImpl();
		return edao.addEmployee(e);
	}

	@Override
	public Employee findEmployeeById(int searchId) {
		EmployeeDAO edao=new EmployeeDAOImpl();
		return edao.findEmployeeById(searchId);
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		EmployeeDAO edao=new EmployeeDAOImpl();
		edao.updateEmployee(e);
	}

	@Override
	public void deleteEmployee(Employee e) {
		// TODO Auto-generated method stub
		EmployeeDAO edao=new EmployeeDAOImpl();
		edao.deleteEmployee(e);
		
	}

}
