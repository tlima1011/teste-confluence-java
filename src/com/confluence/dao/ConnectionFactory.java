package com.confluence.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		String url = "jdbc:mysql://localhost/copa_confluence";
		String usuario = "root";
		String senha = "";
		try {
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}
}
