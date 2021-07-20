package com.login.service;

import com.login.exception.BusinessException;
import com.login.model.User;

public interface LoginService {
	public boolean isValidLoginCredentials(User user) throws BusinessException;
}
