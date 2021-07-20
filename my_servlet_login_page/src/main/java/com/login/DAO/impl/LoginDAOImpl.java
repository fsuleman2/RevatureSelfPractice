package com.login.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.login.DAO.LoginDAO;
import com.login.dbutil.PostgresConnection;
import com.login.exception.BusinessException;
import com.login.model.User;

public class LoginDAOImpl implements LoginDAO{

	@Override
	public boolean isValidLoginCredentials(User user) throws BusinessException {
		boolean b=false;
		try(Connection connection=PostgresConnection.getConnection()){
			String sql="select username from product_schema.login_master where username=? and password=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				b=true;
			}else {
				throw new BusinessException("Invaid Login Credentials");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured.. Contact SYSADMIN!!!!!!!!!!!!!!!!!");
		}
		return b;
	}

}
