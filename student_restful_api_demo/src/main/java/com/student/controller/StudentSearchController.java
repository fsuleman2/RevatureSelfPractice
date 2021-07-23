package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.student.service.StudentService;
import com.student.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class StudentSearchController
 */
public class StudentSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentSearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private StudentService studentService=new StudentServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;charset=UTF-8");
		Gson gson=new Gson();
		PrintWriter out=response.getWriter();
		String criteria=request.getParameter("criteria");
		if(criteria==null) {
			out.print(gson.toJson(studentService.getAllStudents()));
		}else {
			if(criteria.equals("age")) {
				out.print(gson.toJson(studentService.getStudentsByAge(Integer.parseInt(request.getParameter("value")))));
			}
			if(criteria.equals("gender")) {
				out.print(gson.toJson(studentService.getStudentsByGender(request.getParameter("value"))));
			}
			
			if(criteria.equals("city")) {
				out.print(gson.toJson(studentService.getStudentsByCity(request.getParameter("value"))));
			}
			if(criteria.equals("name")) {
				out.print(gson.toJson(studentService.getStudentsByName(request.getParameter("value"))));
			}
		}
	}

	
}
