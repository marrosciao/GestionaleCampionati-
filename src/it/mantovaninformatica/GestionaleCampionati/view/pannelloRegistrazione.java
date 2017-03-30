package it.mantovaninformatica.GestionaleCampionati.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pannelloRegistrazione extends JPanel  {
	finestra f;
	JPanel contFinestraR= new JPanel();
	JLabel titolo = new JLabel("Registrazione Pilota");
	JTextField nome= new JTextField("scrivi o detta il tuo nome");
	JTextField cognome= new JTextField("scrivi o detta il tuo cognome");
	JTextField eta= new JTextField("scrivi la tua eta");
	JTextField dataNascita= new JTextField("scrivi la tua data di nascita");
	JPanel pFirst=new JPanel();
	JButton Registrati= new JButton("Registra");

	BorderLayout bl=new BorderLayout(2,2); 
	
	
	public pannelloRegistrazione(){
		
		this.setLayout(new GridLayout(5,1));
		add(titolo);
		add(nome);
		add(cognome);
		add(eta);
		add(Registrati);
	
		

	
	}

}
