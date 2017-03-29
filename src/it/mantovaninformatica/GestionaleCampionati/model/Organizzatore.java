package it.mantovaninformatica.GestionaleCampionati.model;

public class Organizzatore {
	
	String nome;
	String cognome;
	
	public Organizzatore(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Organizzatore :" + " " + nome +" " + cognome;
	}
	
	
	

}
