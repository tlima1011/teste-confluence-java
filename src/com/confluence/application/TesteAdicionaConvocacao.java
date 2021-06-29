package com.confluence.application;

import java.text.SimpleDateFormat;

import com.confluence.dao.ConvocacaoDao;
import com.confluence.model.domain.Convocacao;

public class TesteAdicionaConvocacao {

	public static void main(String[] args) {
		
		Convocacao c1 = new Convocacao(); 
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		c1.setJogador(null);
		c1.setIdSelecao(null);
		c1.setData(null);
		new ConvocacaoDao().adiciona(c1); 
	}

}
