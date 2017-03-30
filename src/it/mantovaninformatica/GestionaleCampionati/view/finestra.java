package it.mantovaninformatica.GestionaleCampionati.view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class finestra extends JFrame {
	
	/*JButton registrazioneBtn= new JButton("Nuova registrazione");
	JButton infoPilota= new JButton("Resoconto pilota");*/
	//Ascoltatore ascolta= new Ascoltatore(this);

	public finestra(){
		Container contenitoreElementi= this.getContentPane(); // è la lastra dove i componenti visuali vengono appoggiati
		panelloInizialeIOT piot=new panelloInizialeIOT();
		contenitoreElementi.add(piot);
		/*contenitoreElementi.add(registrazioneBtn);
		contenitoreElementi.add(infoPilota);*/
		contenitoreElementi.setLayout(new GridLayout());
		this.pack();
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		this.show();
		
		//registrazioneBtn.addActionListener(ascolta);

	}
}
