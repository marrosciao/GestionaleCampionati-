package it.mantovaninformatica.GestionaleCampionati.model;

public class Pilota {

	String nome;
	String cognome;
	String dataNascita;
	String luogoNascita;
	int eta;
	char sesso;
	Indirizzo reacapito;
	String nazionalità;
	CategoriePiloti categoriaAppartenenza;
	
	
	public Pilota(String nome, String cognome) {
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


	public String getDataNascita() {
		return dataNascita;
	}


	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}


	public String getLuogoNascita() {
		return luogoNascita;
	}


	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	public char getSesso() {
		return sesso;
	}


	public void setSesso(char sesso) {
		this.sesso = sesso;
	}


	public Indirizzo getReacapito() {
		return reacapito;
	}


	public void setReacapito(Indirizzo reacapito) {
		this.reacapito = reacapito;
	}


	public String getNazionalità() {
		return nazionalità;
	}


	public void setNazionalità(String nazionalità) {
		this.nazionalità = nazionalità;
	}


	public CategoriePiloti getCategoriaAppartenenza() {
		return categoriaAppartenenza;
	}


	public void setCategoriaAppartenenza(CategoriePiloti categoriaAppartenenza) {
		
		this.categoriaAppartenenza = categoriaAppartenenza;
	}


	@Override
	public String toString() {
		return  nome + " " + cognome;
	}
	
	
	
	
	
}
