package com.ems.dao;

import java.util.List;

import com.ems.model.Employee;

public interface EmployeeDAO {
	public int addEmployee(Employee e);
	public Employee findEmployeeById(int searchId);
	public void updateEmployee(Employee e);
	public void deleteEmployee(Employee e);
	public List<Employee> getAllEmployee();
}
