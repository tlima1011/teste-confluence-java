package com.confluence.model.domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Convocacao {
	
	private Integer idConvocacao; 
	private Date data; 
	private Jogador jogador; 
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Convocacao() {
		
	}

	public Convocacao(Integer idConvocacao, Date data, Jogador jogador) {
		this.idConvocacao = idConvocacao;
		this.data = data;
		this.jogador = jogador;
	}

	public Integer getIdConvocacao() {
		return idConvocacao;
	}

	public void setIdConvocacao(Integer idConvocacao) {
		this.idConvocacao = idConvocacao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	
	@Override
	public String toString() {
		return "Convocacao [idConvocacao=" + idConvocacao + ", data=" + sdf.format(data) + ", jogador=" + jogador + "]";
	}
	
	
		
}
