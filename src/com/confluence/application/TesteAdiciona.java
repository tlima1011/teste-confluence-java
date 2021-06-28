package com.confluence.application;

import com.confluence.dao.JogadorDao;
import com.confluence.model.domain.Clube;
import com.confluence.model.domain.Jogador;

public class TesteAdiciona {

	public static void main(String[] args) {

		Clube clube2 = new Clube(2, "Real Madrid","Santiago Bernabeu"); 
		Clube clube3 = new Clube(3,"Barcelona","Camp Nou");
		
		Jogador jogador = new Jogador();
		jogador.setNome("Antoine Griezmann");
		jogador.setClube(clube3.getIdClube());
		jogador.setIdade(30);
		new JogadorDao().adiciona(jogador);
		System.out.println("Salvo no BD.");
	}
}
