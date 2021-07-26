package com.employee.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.employee.DAO.EmployeeDAO;
import com.employee.DAO.Impl.EmployeeDAOImpl;
import com.employee.model.Customer;
import com.employee.model.Employee;
import com.employee.service.EmployeeCrudService;

public class EmployeeCrudServiceImpl implements EmployeeCrudService{
	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	public Employee createEmployee(Employee employee) {
	
		employee = employeeDAO.createEmployee(employee);
		System.out.println("Im in Service");
		return employee;
	}

	public List<Employee> getAllEmployeeDetails() {
		List<Employee> empList = new ArrayList<>();
		empList = employeeDAO.getAllEmployeeDetails();
		return empList;
	}

	@Override
	public Customer createCustomer(Customer customer) {
		customer = employeeDAO.createCustomer(customer);
		System.out.println("im in cust service");
		return customer;
	}

}
