package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeCrudService {
public Employee createEmployee(Employee employee);
public List<Employee> getAllEmployeeDetails();

}
