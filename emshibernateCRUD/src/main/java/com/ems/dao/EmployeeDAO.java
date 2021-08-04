package com.ems.dao;

import com.ems.model.Employee;

public interface EmployeeDAO {
	public int addEmployee(Employee e);
	public Employee findEmployeeById(int searchId);
	public void updateEmployee(Employee e);
	public void deleteEmployee(Employee e);
}
