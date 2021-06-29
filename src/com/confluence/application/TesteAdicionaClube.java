package com.confluence.application;

import com.confluence.dao.ClubeDao;
import com.confluence.model.domain.Clube;

public class TesteAdicionaClube {

	public static void main(String[] args) {
		
		Clube boca = new Clube(); 
		
		//"Boca Jrs","La Bombonera"
		boca.setNome("River Plate");
		boca.setEstadio("Monumental del Nunes");
		new ClubeDao().adiciona(boca);
		System.out.println("Clube Salvo no BD.");
	}
}
