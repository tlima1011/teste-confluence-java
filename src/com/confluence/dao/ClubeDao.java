package com.confluence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.confluence.model.domain.Clube;

public class ClubeDao {
	
	private Connection connection;

	public ClubeDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Clube clube) {
		String sql = "insert into clube (nome, estadio) values (?,?)";
		try (
			PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, clube.getNome());
			stmt.setString(2, clube.getEstadio());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try }//fim adiciona
	}

	public List<Clube> getLista() {
		String sql = "select * from clube";
		List<Clube> clubes = new ArrayList();
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Clube clube = new Clube();
				clube.setIdClube(rs.getInt("idClube"));
				clube.setNome(rs.getString("nome"));
				clube.setEstadio(rs.getString("estadio"));
				clubes.add(clube);
			} // fim while
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return clubes;
	}// fim lista

	public Clube busca(Integer idclube) {
		String sql = "select * from clube where idclube = ?";
		Clube clube = null;
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setLong(1, idclube);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				clube = new Clube();
				clube.setIdClube(rs.getInt("idclube"));
				clube.setNome(rs.getString("nome"));
				clube.setEstadio(rs.getString("estadio"));
			} // fim if
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return clube;
	}// fim busca

	public void altera(Clube clube) {
		String sql = "update clube set nome = ?, estadio = ? where idclube = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setString(1, clube.getNome());
			stmt.setString(2, clube.getNome());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try }//fim altera
	}

	public void remove(Clube clube) { 
		String sql = "delete from clube where idclube = ?"; 
		try (PreparedStatement stmt = connection.prepareStatement(sql)) { 
			stmt.setInt(1, clube.getIdClube()); 
			stmt.executeUpdate(); 
		} catch (SQLException ex) { 
			throw new RuntimeException(ex); 
		}//fim try 
	} //fim remove
	
}
