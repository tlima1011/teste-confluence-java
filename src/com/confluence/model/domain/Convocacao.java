package com.confluence.model.domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Convocacao {
	
	private Integer idConvocacao; 
	private Date data; 
	private Integer jogador; 
	private Integer selecao; 
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Convocacao() {
		
	}

	public Convocacao(Date data, Integer jogador, Integer selecao) {
		this.data = data;
		this.jogador = jogador;
		this.selecao = selecao; 
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

	public Integer getJogador() {
		return jogador;
	}

	public void setJogador(Integer jogador) {
		this.jogador = jogador;
	}

	public Integer getSelecao() {
		return selecao;
	}

	public void setIdSelecao(Integer idselecao) {
		this.selecao = idselecao;
		
	}

	@Override
	public String toString() {
		return "Convocacao [idConvocacao=" + idConvocacao + ", data=" + sdf.format(data) + ", jogador=" + jogador + "]";
	}

	
	
}
