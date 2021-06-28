package com.confluence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.confluence.model.domain.Jogador;

public class JogadorDao {

	private Connection connection;

	public JogadorDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Jogador jogador) {
		String sql = "insert into jogador (nome, idclube,idade) values (?,?,?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, jogador.getNome());
			stmt.setInt(2, jogador.getClube());
			stmt.setInt(3, jogador.getIdade());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try }//fim adiciona
	}

	public List<Jogador> getLista() {
		String sql = "select * from jogador";
		List<Jogador> jogadores = new ArrayList();
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Jogador jogador = new Jogador();
				jogador.setIdJogador(rs.getInt("idJogador"));
				jogador.setNome(rs.getString("nome"));
				jogador.setClube(rs.getInt("idclube"));
				jogador.setIdade(rs.getInt("idade"));
				jogadores.add(jogador);
			} // fim while
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return jogadores;
	}// fim lista

	public Jogador busca(Integer idjogador) {
		String sql = "select * from jogador where idjogador = ?";
		Jogador jogador = null;
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setLong(1, idjogador);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				jogador = new Jogador();
				jogador.setIdJogador(rs.getInt("idjogador"));
				jogador.setNome(rs.getString("nome"));
				jogador.setClube(rs.getInt("idclube"));
				jogador.setIdade(rs.getInt("idade"));
			} // fim if
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return jogador;
	}// fim busca

	public void altera(Jogador jogador) {
		String sql = "update jogador set nome = ?, clube = ?," + " idade = ? where idjogador = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, jogador.getNome());
			stmt.setInt(2, jogador.getClube());
			stmt.setInt(3, jogador.getIdade());
			stmt.setInt(4, jogador.getIdJogador());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try }//fim altera
	}

	public void remove(Jogador jogador) { 
		String sql = "delete from jogador where idjogador = ?"; 
		try (PreparedStatement stmt = connection.prepareStatement(sql)) { 
			stmt.setLong(1, jogador.getIdJogador()); 
			stmt.executeUpdate(); 
		} catch (SQLException ex) { 
			throw new RuntimeException(ex); 
		}//fim try 
	} //fim remove
}
	


