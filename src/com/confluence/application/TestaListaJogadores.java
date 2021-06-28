package com.confluence.application;

import java.util.List;
import com.confluence.dao.JogadorDao;
import com.confluence.model.domain.Jogador;

public class TestaListaJogadores {

	public static void main(String[] args) {
		
		List<Jogador> jogadores = new JogadorDao().getLista(); 
		System.out.println("Lista de jogadores:\n"); 
		jogadores.forEach(i -> System.out.println(i.getIdJogador() + " - " + i.getNome() + " " + i.getClube()));
	}
}
