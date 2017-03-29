package it.mantovaninformatica.GestionaleCampionati.model;

import java.util.ArrayList;

public class Campionato {

	String nome;
	String motto;
	Organizzatore organizzazione;
	ArrayList Pilota;
	ArrayList Gara;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMotto() {
		return motto;
	}
	public void setMotto(String motto) {
		this.motto = motto;
	}
	public Organizzatore getOrganizzazione() {
		return organizzazione;
	}
	public void setOrganizzazione(Organizzatore organizzazione) {
		this.organizzazione = organizzazione;
	}
	public ArrayList getPilota() {
		return Pilota;
	}
	public void setPilota(ArrayList pilota) {
		Pilota = pilota;
	}
	public ArrayList getGara() {
		return Gara;
	}
	public void setGara(ArrayList gara) {
		Gara = gara;
	}
	@Override
	public String toString() {
		return "Campionato :" +" "+ nome + " " + motto + "" +Pilota;
	}
	
	
	
	
}
