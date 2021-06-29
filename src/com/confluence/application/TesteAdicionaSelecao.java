package com.confluence.application;

import com.confluence.dao.SelecaoDao;
import com.confluence.model.domain.Selecao;

public class TesteAdicionaSelecao {

	public static void main(String[] args) {
		
		Selecao selecao = new Selecao(); 
		selecao.setNome("Alemanha");
		selecao.setContinente("Europa");
		selecao.setRanking(2);
		new SelecaoDao().adiciona(selecao);
		System.out.println("Selecao Salvo no BD.");
	}

}
