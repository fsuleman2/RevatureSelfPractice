package com.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJdbc {
public static void main(String[] args) {
	Connection connection = null;
	try {
		//Step1: Load or Register Driver
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver got Loaded Successfully");
		//Step2: Open connection
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "12345";
		connection = DriverManager.getConnection(url, user, password);
		System.out.println("Connection Established");
		//Step 3 : Creating Statement
		Statement statement = connection.createStatement();
		String sql = "select productid,name,rating,cost,available from product_schema.product order by rating";
		
		//Step 4 : execute Query
		ResultSet resultSet = statement.executeQuery(sql);
		System.out.println("Query Executed Successfully");
		
		//Step 5 : Process Result
		//result is pointing to result---it will be like an array we use .next() read and increment
		//if there is record need to be read it will say true and move ptr to that particular record
		//result set will be pointing to before first and checks is there any record need to be read "Yes" then next()
		// will also see is there any record need to be read "Yes" then print it out
		while(resultSet.next()) {
			System.out.print("Product Id "+ resultSet.getInt("productid")+" ");
			System.out.print("Product Name "+resultSet.getString("name")+" ");
			System.out.print("Product Rating "+ resultSet.getFloat("rating")+" ");
			System.out.print("Product Cost "+ resultSet.getFloat("cost")+" ");
			System.out.println("Product Available "+ resultSet.getBoolean("Available"));
		}
		
		
	
	} catch (ClassNotFoundException e) {
		
		System.out.println(e);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}finally {
		try {
			//Step6 : Connection Closed
			connection.close();
			System.out.println("Connection Closed!!!");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
}
