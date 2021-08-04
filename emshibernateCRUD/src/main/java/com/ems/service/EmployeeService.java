package com.ems.service;

import com.ems.model.Employee;

public interface EmployeeService {
	public int addEmployee(Employee e);
	public Employee findEmployeeById(int searchId);
	public void updateEmployee(Employee e);
	public void deleteEmployee(Employee e);
	
}
