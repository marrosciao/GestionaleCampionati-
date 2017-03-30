package it.mantovaninformatica.GestionaleCampionati.view;

import javax.swing.JButton;
import javax.swing.JPanel;

public class panelloInizialeIOT extends JPanel {
	
	public panelloInizialeIOT(){
		
		super();
		JButton registrazioneBtn= new JButton("Nuova registrazione");
		JButton infoPilota= new JButton("Resoconto pilota");
		
		add(registrazioneBtn);
		add(infoPilota);
	}
	
	

}
