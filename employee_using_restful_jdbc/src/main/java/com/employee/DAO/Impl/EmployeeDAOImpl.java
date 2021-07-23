package com.employee.DAO.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.employee.DAO.EmployeeDAO;
import com.employee.dbutil.PostgresConnection;
import com.employee.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	public Employee createEmployee(Employee employee) {
		try(Connection connection = PostgresConnection.getConnection()){
			System.out.println("Im inside try DAO");
			String sql = "insert into empdetails(empname,empage,empcity) values(?,?,?)";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			System.out.println("Im in DAO");
			preparedStatement.setString(1, employee.getEmpname());
			preparedStatement.setInt(2, employee.getEmpage());
			preparedStatement.setString(3, employee.getEmpcity());
			int rowAffected = preparedStatement.executeUpdate();
			System.out.println("rowaffected"+rowAffected);
			if(rowAffected!=1) {
				System.out.println("Rows not affected");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return employee;
	}

	public List<Employee> getAllEmployeeDetails() {
		List<Employee> empList = new ArrayList<>();
		try(Connection connection = PostgresConnection.getConnection()){
			String sql = "select empname,empage,empcity from empdetails";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Employee employee=new Employee();
				employee.setEmpname(resultSet.getString("empname"));
				employee.setEmpage(resultSet.getInt("empage"));
				employee.setEmpcity(resultSet.getString("empcity"));
				empList.add(employee);
			}
		if(empList.size()==0) {
			System.out.println("Cannot Fetch details");
		}
	} catch (ClassNotFoundException | SQLException e) {
		System.out.println(e.getMessage());
	}
		return empList;
	}
		

}
