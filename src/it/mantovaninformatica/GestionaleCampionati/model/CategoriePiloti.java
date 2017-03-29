package it.mantovaninformatica.GestionaleCampionati.model;

import java.util.ArrayList;

public class CategoriePiloti {
	
	String nome;
	String descrzione;
	
	public CategoriePiloti(String nome, String descrzione) {
		this.nome = nome;
		this.descrzione = descrzione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrzione() {
		return descrzione;
	}

	public void setDescrzione(String descrzione) {
		this.descrzione = descrzione;
	}
	
	public void creoCategorieAutomatiche(){
		
		ArrayList c= new ArrayList<>();
		
		CategoriePiloti c1= new CategoriePiloti("SuperLight","Piloti Esperti e sotto i 72kg");
		CategoriePiloti c2= new CategoriePiloti("SuperHeavy","Piloti Esperti e sopra i 72 kg");
		CategoriePiloti c3= new CategoriePiloti("AmateurLight","Piloti amatoriali e sotto i 72kg");
		CategoriePiloti c4= new CategoriePiloti("AmateurHeavy","Piloti amatoriali e sopra i 72kg");
		CategoriePiloti c5= new CategoriePiloti("RookieLight","Piloti rookie e sotto i 72kg");
		CategoriePiloti c6= new CategoriePiloti("RookieHeavy","Piloti rookie e sopra i 72kg");
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		c.add(c6);
	}
	
	

}
