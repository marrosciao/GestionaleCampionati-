package it.mantovaninformatica.GestionaleCampionato.business;

import java.util.ArrayList;

import it.mantovaninformatica.GestionaleCampionati.model.Campionato;
import it.mantovaninformatica.GestionaleCampionati.model.Circuito;
import it.mantovaninformatica.GestionaleCampionati.model.Gara;
import it.mantovaninformatica.GestionaleCampionati.model.Organizzatore;
import it.mantovaninformatica.GestionaleCampionati.model.Pilota;

public class CreaCampionato {

	public static void main(String[] args) {
		
		Organizzatore o1= new Organizzatore("Futura","Corse");
		/*si procedi crea campionato*/
		Campionato c1= new Campionato();
		/*STEP INSERIMENTO NOME CAMPIONATO*/
		c1.setNome("Piedi Veloci");
		/*STEP INERIMENTO MOTTO*/
		c1.setMotto("campionato kart amatoriale");
		/*CONFERMIAMO ORGANIZZATORE*/
		c1.setOrganizzazione(o1);
		/*INSERIMENTO PILOTI SE SI AVANTI CON QUESTO*/
		
		Pilota p1=new Pilota("Dario","Mantovani");
		Pilota p2=new Pilota("Andrea","Dolcetti");
		Pilota p3=new Pilota("Carlo","Montanari");
		
		ArrayList<Pilota> iscrittiCampionato= new ArrayList();
		
		iscrittiCampionato.add(p1);
		iscrittiCampionato.add(p2);
		iscrittiCampionato.add(p3);
		
		c1.setPilota(iscrittiCampionato);
		
		/*INSERIMENTO CIRCUITI*/
		/*Quanti circuiti ci saranno nel campionato ?*/
		
		ArrayList<Circuito> circuitiIscritti= new ArrayList();
		
		int numeroGare=4;
		
		for(int i=0; i<=numeroGare; i++){
			/*Qui faccio le tre domande con lo scanner per riempri i campi dei circuiti*/
			circuitiIscritti.add(new Circuito ("asd","dsad","sad"));
		}
		
		System.out.println(o1);
		System.out.println(c1);

		
		/* Gara g1=new Gara();
		
		ArrayList<Pilota> listaPartecipanti= new ArrayList();
		Pilota p1=new Pilota("Dario","Mantovani");
		Pilota p2=new Pilota("Andrea","Dolcetti");
		Pilota p3=new Pilota("Carlo","Montanari");
		
		listaPartecipanti.add(p1);
		listaPartecipanti.add(p2);
		listaPartecipanti.add(p3);


		g1.setListaPiloti(listaPartecipanti); */
		
		
	}

}
