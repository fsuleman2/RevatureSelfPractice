package com.login.service.impl;

import com.login.DAO.LoginDAO;
import com.login.DAO.impl.LoginDAOImpl;
import com.login.exception.BusinessException;
import com.login.model.User;
import com.login.service.LoginService;

public class LoginServiceImpl implements LoginService{
	private LoginDAO loginDAO=new LoginDAOImpl();
	@Override
	public boolean isValidLoginCredentials(User user) throws BusinessException {
		boolean b=false;
		if(user!=null && user.getUsername()!=null && user.getPassword()!=null && user.getUsername().matches("[a-zA-Z]{5,20}") && user.getPassword().matches("[a-z]{3,7}@[0-9]{3}")) {
			
			//code here for DAO
			b=loginDAO.isValidLoginCredentials(user);
		}else {
			throw new BusinessException("Invalid Username or Password");
		}
		
		return b;
	}

}
