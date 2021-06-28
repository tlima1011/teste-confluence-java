package com.confluence.application;

import java.sql.Connection;
import java.sql.SQLException;

import com.confluence.dao.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {

		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conectado ao Banco de dados!");
		connection.close();

	}

}
