package com.confluence.application;

import java.util.List;

import com.confluence.dao.ClubeDao;
import com.confluence.model.domain.Clube;

public class TestaListaClubes {

	public static void main(String[] args) {
		
		List<Clube> clubes = new ClubeDao().getLista(); 
		System.out.println("Lista de Clubes:\n"); 
		clubes.forEach(i -> System.out.println(i.getIdClube() + " - " + i.getNome() + " - Estádio-Sede: " + i.getEstadio()));
	}
}
