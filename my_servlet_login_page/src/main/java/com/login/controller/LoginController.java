package com.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.exception.BusinessException;
import com.login.model.User;
import com.login.service.LoginService;
import com.login.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		User user=new User();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		
		LoginService loginService=new LoginServiceImpl();
		
		RequestDispatcher requestDispatcher=null;
		try {
			if(loginService.isValidLoginCredentials(user)) {
				//success
				requestDispatcher=request.getRequestDispatcher("success");
				requestDispatcher.forward(request, response);
			}
		} catch (BusinessException e) {
			//failure
			PrintWriter out=response.getWriter();
			requestDispatcher=request.getRequestDispatcher("login.html");
			requestDispatcher.include(request, response);
			out.print("<center><span style='color:red;'>"+e.getMessage()+"</span></center>");
			
		}
	}
	}


