package com.confluence.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.confluence.model.domain.Clube;
import com.confluence.model.domain.Convocacao;
import com.confluence.model.domain.Jogador;
import com.confluence.model.domain.Selecao;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Scanner sc = new Scanner(System.in); 
		
		Clube clube2 = new Clube(2, "Real Madrid","Santiago Bernabeu"); 
		Clube clube3 = new Clube(3,"Barcelona","Camp Nou");
		
		Jogador jogador1 = new Jogador(1, "Marcelo", 30, clube2); 
		Jogador jogador2 = new Jogador(2, "Phelipe Coutinho", 26, clube3);
		Jogador jogador3 = new Jogador(3, "Messi", 31, clube3);
		
		Selecao selecao1 = new Selecao(1,"Brasil","America do Sul", 1); 
		Selecao selecao2 = new Selecao(2,"Argentina","America do Sul", 5); 		
						
		clube2.addJogador(jogador1);
		clube3.addJogador(jogador2);
		clube3.addJogador(jogador3);
		
		System.out.println(clube2);
		System.out.println(clube3);
		
		Convocacao convocacao1 = new Convocacao(1, sdf.parse("29/06/2018"), jogador1);
		Convocacao convocacao2 = new Convocacao(2, sdf.parse("15/04/2018"), jogador2);
		Convocacao convocacao3 = new Convocacao(3, sdf.parse("29/06/2018"), jogador3);
		System.out.println();
		
		selecao1.addConvocacao(convocacao1);
		selecao1.addConvocacao(convocacao2);
		selecao2.addConvocacao(convocacao3);
		
		System.out.println(selecao1);
		System.out.println(selecao2);
		System.out.println();
				
		sc.close();
	}
}
