package com.revature.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Employee;
import com.revature.service.impl.EmployeeServiceImpl;
@RestController
@CrossOrigin
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl es;
	
	@DeleteMapping("/employee/delete/{id}")
	public String deleteEmployee(@PathVariable("id") int searchId) {
		Optional<Employee> emp = es.findEmployeeById(searchId);
		if(emp.isPresent()) {
			es.deleteEmployee(emp.get());
		}
		return "Employee with id: "+searchId+" deleted Suucessfully";
	}
	@PutMapping("/employee/update")
	public Employee employeeUpdate(@RequestBody Employee emp) {
			es.updateEmployee(emp);
			return emp;
	}
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") int searchId) {
		Optional<Employee> emp = es.findEmployeeById(searchId);
		if(emp.isPresent()) {
			return emp.get();
		}
		return null;
		
	}
	@GetMapping("/employee")
	public List<Employee> getEmployees() {
		List<Employee> emp = es.findAllEmployee();
		return emp;
		
	}
	@PostMapping("/employee/add")
	public Employee registerEmployee(@RequestBody Employee e) {
		Employee result = es.addEmployee(e);
		return result;
	}
}
