package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Employee;
@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
	
}
