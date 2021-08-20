package com.revature.service;

import java.util.List;
import java.util.Optional;

import com.revature.model.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee e);
	public Optional<Employee> findEmployeeById(int searchId);
	public List<Employee> findAllEmployee();
	public Employee updateEmployee(Employee e);
	public void deleteEmployee(Employee e);
	public void deleteByIdEmployee(int id);
	
}
