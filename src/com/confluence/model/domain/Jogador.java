package com.confluence.model.domain;

public class Jogador {
	
	private Integer idJogador; 
	private String nome; 
	private Integer idade; 
	private int clube; 
	
	public Jogador() { 
		
	}

	public Jogador(Integer idJogador, String nome, Integer idade, Integer clube) {
		this.idJogador = idJogador;
		this.nome = nome;
		this.idade = idade;
		this.clube = clube; 
	}

	public Integer getIdJogador() {
		return idJogador;
	}

	public void setIdJogador(Integer idJogador) {
		this.idJogador = idJogador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public Integer getClube() {
		return clube;
	}

	public void setClube(int idclube) {
		this.clube = idclube;
	}

	@Override
	public String toString() {
		return "Jogador [idJogador: " + idJogador + ", Nome: " + nome + ", idade: " + idade + "]";
	}	
}
