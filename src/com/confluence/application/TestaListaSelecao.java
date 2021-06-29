package com.confluence.application;

import java.util.List;

import com.confluence.dao.SelecaoDao;
import com.confluence.model.domain.Selecao;

public class TestaListaSelecao {

	public static void main(String[] args) {
		
		List<Selecao> selecoes = new SelecaoDao().getLista(); 
		System.out.println("Lista de Selecoes:"); 
		selecoes.forEach(i -> System.out.println("Seleção: "+i.getNome() 
				+ " - Continente: " + i.getContinente() 
				+ " - Ranking Fifa: " +i.getRanking()));
		
	}
}
