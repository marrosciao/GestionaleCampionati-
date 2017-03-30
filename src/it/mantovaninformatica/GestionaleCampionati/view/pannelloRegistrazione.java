package it.mantovaninformatica.GestionaleCampionati.view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pannelloRegistrazione extends JPanel {
	
	JLabel titolo = new JLabel("Registrazione Pilota");
	
	
	public pannelloRegistrazione(){
		
		super();
		setLayout(new GridLayout(3,1));

		add(titolo);
		
	}

}
