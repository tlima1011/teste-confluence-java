package com.confluence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.confluence.model.domain.Selecao;

public class SelecaoDao {
	
	private Connection connection;

	public void SelecaoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Selecao selecao) {
		String sql = "insert into selecao (nome, continente, ranking) values (?,?,?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, selecao.getNome());
			stmt.setString(2, selecao.getContinente());
			stmt.setInt(3, selecao.getRanking());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try }//fim adiciona
	}

	public List<Selecao> getLista() {
		String sql = "select * from selecao";
		List<Selecao> selecoes = new ArrayList();
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Selecao selecao = new Selecao();
				selecao.setIdSelecao(rs.getInt("idselecao"));
				selecao.setNome(rs.getString("nome"));
				selecao.setContinente(rs.getString("continente"));
				selecao.setRanking(rs.getInt("ranking"));
				selecoes.add(selecao);
			} // fim while
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return selecoes;
	}// fim lista

	public Selecao busca(Integer idselecao) {
		String sql = "select * from selecao where idselecao = ?";
		Selecao selecao = null;
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setLong(1, idselecao);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				selecao = new Selecao();
				selecao.setIdSelecao(rs.getInt("idselecao"));
				selecao.setNome(rs.getString("nome"));
				selecao.setContinente(rs.getString("continente"));
				selecao.setRanking(rs.getInt("ranking"));
			} // fim if
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return selecao;
	}// fim busca

	public void altera(Selecao selecao) {
		String sql = "update selecao set nome = ?, continente = ? ranking = ? where idselecao = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, selecao.getNome());
			stmt.setString(2, selecao.getContinente());
			stmt.setInt(3, selecao.getRanking());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try }//fim altera
	}

	public void remove(Selecao selecao) { 
		String sql = "delete from selecao where idselecao = ?"; 
		try (PreparedStatement stmt = connection.prepareStatement(sql)) { 
			stmt.setLong(1, selecao.getIdSelecao()); 
			stmt.executeUpdate(); 
		} catch (SQLException ex) { 
			throw new RuntimeException(ex); 
		}//fim try 
	} //fim remove

}
