package com.confluence.application;

import com.confluence.dao.JogadorDao;
import com.confluence.model.domain.Clube;
import com.confluence.model.domain.Jogador;

public class TesteAdiciona {

	public static void main(String[] args) {

		//Clube clube2 = new Clube("Bayern Munique","Europa"); 
		Jogador jogador = new Jogador();
		jogador.setClube(10);
		jogador.setNome("Thomas Muller");
		jogador.setIdade(31);
		new JogadorDao().adiciona(jogador);
		System.out.println("Salvo no BD.");
	}
}
