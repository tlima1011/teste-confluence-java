package com.confluence.model.domain;

import java.util.ArrayList;

public class Clube {
	
	private Integer idClube; 
	private String nome; 
	private String estadio; 
	
	private ArrayList <Jogador> jogadores =  new ArrayList<>(); 
	
	public Clube() { 
	
	}
	
	public Clube(String nome, String estadio) {
		this.nome = nome;
		this.estadio = estadio;
	}

	public Integer getIdClube() {
		return idClube;
	}

	public void setIdClube(Integer idClube) {
		this.idClube = idClube;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
	
	public void addJogador(Jogador jogador) {
		jogadores.add(jogador); 
	}
	
	public void removeJogador(Jogador jogador) {
		jogadores.remove(jogador); 
	}
	
	@Override
	public String toString() {
		return "Clube [idClube: " + idClube + ", Nome do Clube: " + nome + ", Estadio-Sede: " + estadio + ", jogadores = " + jogadores
				+ "]";
	}
	
	
	
}
