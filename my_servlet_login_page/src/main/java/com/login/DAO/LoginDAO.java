package com.login.DAO;

import com.login.exception.BusinessException;
import com.login.model.User;

public interface LoginDAO {
	public boolean isValidLoginCredentials(User user) throws BusinessException;
}
