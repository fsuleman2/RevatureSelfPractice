package com.employee.DAO;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeDAO {
	public Employee createEmployee(Employee employee);
	public List<Employee> getAllEmployeeDetails();
}
