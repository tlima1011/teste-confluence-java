package com.confluence.model.domain;

import java.util.ArrayList;

public class Selecao {
	
	private Integer idSelecao; 
	private String nome; 
	private String continente; 
	private Integer ranking; 
	
	private ArrayList<Convocacao> convocacoes = new ArrayList<>(); 
	
	public Selecao() { 
		
	}

	public Selecao(Integer idSelecao, String nome, String continente, Integer ranking) {
		this.idSelecao = idSelecao;
		this.nome = nome;
		this.continente = continente;
		this.ranking = ranking;
	}

	public Integer getIdSelecao() {
		return idSelecao;
	}

	public void setIdSelecao(Integer idSelecao) {
		this.idSelecao = idSelecao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	
	public void addConvocacao(Convocacao convocacao) {
		convocacoes.add(convocacao); 
	}
	
	public void removeConvocacao(Convocacao convocacao) {
		convocacoes.remove(convocacao); 
	}

	@Override
	public String toString() {
		return "Selecao [idSelecao=" + idSelecao + ", nome=" + nome + ", continente=" + continente + ", ranking="
				+ ranking + ", convocacoes=" + convocacoes + "]";
	}
	
	
}
