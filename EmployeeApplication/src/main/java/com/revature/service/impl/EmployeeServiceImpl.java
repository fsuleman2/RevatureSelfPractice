package com.revature.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.revature.dao.EmployeeDAO;
import com.revature.model.Employee;
import com.revature.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO edao;

	@Override
	public Optional<Employee> findEmployeeById(int searchId) {
		return edao.findById(searchId);
	}
	@Override
	public Employee updateEmployee(Employee e) {
		return edao.save(e);
	}

	@Override
	public void deleteEmployee(Employee e) {
		edao.delete(e);
	}
	@Override
	public void deleteByIdEmployee(int id) {
		edao.deleteById(id);
	}

	@Override
	public Employee addEmployee(Employee e) {
		return edao.save(e);
	}

	@Override
	public List<Employee> findAllEmployee() {
		return edao.findAll();
	}

}
