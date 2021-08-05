package com.ems.client;

import java.util.List;
import java.util.Scanner;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;
import com.ems.service.impl.EmployeeServiceImpl;

public class EmployeeClient {
	public static void main(String[] args) {
		//registerEmployee();
	//	getEmployeeById();
		employeeUpdate();
		//deleteEmployee();
//		EmployeeService es=new EmployeeServiceImpl();
//		List<Employee> employeeList=es.getAllEmployee();
//		for(Employee e:employeeList) {
//			System.out.println(e);
//		}
	}

	private static void deleteEmployee() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Employee ID that you want to delete");
		int searchId = s.nextInt();
		EmployeeService es=new EmployeeServiceImpl();
		Employee emp = es.findEmployeeById(searchId);
		if(emp!=null) {
			es.deleteEmployee(emp);
		}else {
			System.out.println("Employee ID is not exists in the DB");
		}
	}

	private static void employeeUpdate() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Employee ID that you want to update");
		int searchId = s.nextInt();
		EmployeeService es=new EmployeeServiceImpl();
		Employee emp = es.findEmployeeById(searchId);
		if(emp!=null) {
			System.out.println("Employee Details Found");
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter your new name");
			emp.setEmployeeName(s1.nextLine());
			System.out.println("Enter your new Department");
			emp.setDepartment(s1.nextLine());
			System.out.println("Enter your new salary");
			emp.setSalary(s1.nextInt());
			es.updateEmployee(emp);
		}else {
			System.out.println("Employee ID is not exists in the DB");
		}
	}

	private static void getEmployeeById() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Employee ID that you are looking");
		int searchId = s.nextInt();
		EmployeeService es=new EmployeeServiceImpl();
		Employee emp = es.findEmployeeById(searchId);
		if(emp!=null) {
			System.out.println("Employee Details Found");
			System.out.println(emp);
		}else {
			System.out.println("Employee ID is not exists in the DB");
		}
		s.close();
	}
	private static void registerEmployee() {
		Employee e=new Employee();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name");
		e.setEmployeeName(s.nextLine());
		System.out.println("Enter your Department");
		e.setDepartment(s.nextLine());
		System.out.println("Enter your salary");
		e.setSalary(s.nextInt());
		EmployeeService es=new EmployeeServiceImpl();
		int result = es.addEmployee(e);
		System.out.println("You details are registered please note down the ID: "+result);
	}
}
