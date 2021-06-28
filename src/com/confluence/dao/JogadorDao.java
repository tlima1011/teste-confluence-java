package com.confluence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.confluence.model.domain.Jogador;
import com.confluence.model.domain.Selecao;

public class JogadorDao {

	private Connection connection;

	public void JogadorDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	
}
	


