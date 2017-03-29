package it.mantovaninformatica.GestionaleCampionati.model;

import java.util.ArrayList;

public class Gara {

 ArrayList <Pilota> ListaPiloti;
 Circuito circuitoGara;
 
 
 
public ArrayList<Pilota> getListaPiloti() {
	return ListaPiloti;
}
public void setListaPiloti(ArrayList<Pilota> listaPiloti) {
	ListaPiloti= new ArrayList();
	Pilota p1=new Pilota("Dario", "Mantovani");
	
	ListaPiloti = listaPiloti;
}
public Circuito getCircuitoGara() {
	return circuitoGara;
}
public void setCircuitoGara(Circuito circuitoGara) {
	this.circuitoGara = circuitoGara;
}
 
 
}
