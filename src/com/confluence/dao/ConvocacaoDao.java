package com.confluence.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.confluence.model.domain.Convocacao;

public class ConvocacaoDao {

	private Connection connection;

	public ConvocacaoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void adiciona(Convocacao convocacao) {
		String sql = "insert into convocacao (idselecao, idjogador, data) values (?,?,?)";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, convocacao.getSelecao());
			stmt.setInt(2, convocacao.getJogador());
			stmt.setDate(3, new Date(convocacao.getData().getTime()));
						stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try }//fim adiciona
	}

	public List<Convocacao> getLista() {
		String sql = "select * from convocacao";
		List<Convocacao> convocacoes = new ArrayList();
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Convocacao convocacao = new Convocacao();
				convocacao.setIdConvocacao(rs.getInt("idconvocacao"));
				convocacao.setIdSelecao(rs.getInt("idselecao"));
				convocacao.setJogador(rs.getInt("idjogador"));
				Calendar data = Calendar.getInstance(); 
				data.setTime(rs.getDate("data"));
				convocacoes.add(convocacao);
			} // fim while
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return convocacoes;
	}// fim lista

	public Convocacao busca(Integer idconvocacao) {
		String sql = "select * from convocacao where idconvocacao = ?";
		Convocacao convocacao = null;
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, idconvocacao);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				convocacao = new Convocacao();
				convocacao.setIdConvocacao(rs.getInt("idconvocacao"));
				convocacao.setIdSelecao(rs.getInt("idselecao"));
				convocacao.setJogador(rs.getInt("idjogador"));
				Calendar data = Calendar.getInstance(); 
				data.setTime(rs.getDate("data"));
			} // fim if
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try
		return convocacao;
	}// fim busca

	public void altera(Convocacao convocacao) {
		String sql = "update convocacao set idselecao = ?, idjogador = ?, data = ? where idconvocacao = ?";
		try (PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, convocacao.getSelecao());
			stmt.setInt(2, convocacao.getJogador());
			stmt.setDate(3, new Date(convocacao.getData().getTime()));
			stmt.setInt(4, convocacao.getIdConvocacao());
			stmt.executeUpdate();
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} // fim try }//fim altera
	}

	public void remove(Convocacao convocacao) { 
		String sql = "delete from jogador where idconvocacao = ?"; 
		try (PreparedStatement stmt = connection.prepareStatement(sql)) { 
			stmt.setInt(1, convocacao.getIdConvocacao()); 
			stmt.executeUpdate(); 
		} catch (SQLException ex) { 
			throw new RuntimeException(ex); 
		}//fim try 
	} //fim remove	
}
