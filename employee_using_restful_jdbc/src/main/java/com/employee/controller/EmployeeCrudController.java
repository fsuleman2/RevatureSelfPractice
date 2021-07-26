package com.employee.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.model.Customer;
import com.employee.model.Employee;
import com.employee.service.EmployeeCrudService;
import com.employee.service.impl.EmployeeCrudServiceImpl;
import com.google.gson.Gson;

/**
 * Servlet implementation class EmployeeCrudController
 */
public class EmployeeCrudController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeCrudController() {
        super();
    }
    private EmployeeCrudService employeeCrudService=new EmployeeCrudServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=UTF-8");
		Gson gson=new Gson();
		PrintWriter out=response.getWriter();
		out.print(gson.toJson(employeeCrudService.getAllEmployeeDetails()));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	Gson gson = new Gson();
	Employee employee = gson.fromJson(request.getReader(), Employee.class);
	employee = employeeCrudService.createEmployee(employee);
	response.setContentType("application/json;charset=UTF-8");
	PrintWriter out=response.getWriter();
	out.print(gson.toJson(employee)); //POJO TO JSON
	
//	Gson gson1 = new Gson();
//	Customer customer = gson1.fromJson(request.getReader(), Customer.class);
//	customer = employeeCrudService.createCustomer(customer);
//	System.out.println(customer);
//	PrintWriter out1=response.getWriter();
//	out1.print(gson1.toJson(customer));
	}
	

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
