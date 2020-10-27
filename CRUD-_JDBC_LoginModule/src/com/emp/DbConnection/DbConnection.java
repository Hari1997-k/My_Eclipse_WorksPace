package com.emp.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DbConnection {
	Connection con = null;

	public Connection getConnection() {

		ResourceBundle bundle = ResourceBundle.getBundle("Mysql"); 
		String user = bundle.getString("db.username");
		String password = bundle.getString("db.password");
		String url = bundle.getString("db.url");

		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return con;

	}
}