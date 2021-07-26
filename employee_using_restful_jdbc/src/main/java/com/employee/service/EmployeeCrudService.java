package com.employee.service;

import java.util.List;

import com.employee.model.Customer;
import com.employee.model.Employee;

public interface EmployeeCrudService {
public Employee createEmployee(Employee employee);
public Customer createCustomer(Customer customer);
public List<Employee> getAllEmployeeDetails();

}
