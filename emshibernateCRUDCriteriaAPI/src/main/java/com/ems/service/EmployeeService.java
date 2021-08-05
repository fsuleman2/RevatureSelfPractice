package com.ems.service;

import java.util.List;

import com.ems.model.Employee;

public interface EmployeeService {
	public int addEmployee(Employee e);
	public Employee findEmployeeById(int searchId);
	public void updateEmployee(Employee e);
	public void deleteEmployee(Employee e);
	public List<Employee> getAllEmployee();
	
}
