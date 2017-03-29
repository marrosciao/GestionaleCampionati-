package it.mantovaninformatica.GestionaleCampionati.model;

public class Circuito {
	
	String nome;
	String indirizzo;
	String Citta;
	
	public Circuito(String nome, String indirizzo, String citta) {
		
		this.nome = nome;
		this.indirizzo = indirizzo;
		Citta = citta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCitta() {
		return Citta;
	}

	public void setCitta(String citta) {
		Citta = citta;
	}
	

	
}
