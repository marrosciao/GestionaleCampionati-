package it.mantovaninformatica.GestionaleCampionati.view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ascoltatore implements ActionListener {
	
	finestra Window;

	public Ascoltatore(finestra fin) {
		
		this.Window = fin;
	}

	//qui è il metodo dell'interfaccia ActionListener che fara l'azione dove aver clikkato il pulsante
	@Override
	public void actionPerformed(ActionEvent registrazioneBTN ) {
		//JPanel p1=new JPanel();
		Container c = new Container();
		Window.setContentPane(c);
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		JLabel Titolo= new JLabel("Modulo registrazione pilota");
		c.add(Titolo);
		
		
		/*p1.setLayout(new GridLayout(2,1) );
		p1.add(titolo);*/
		
	}
	
	
	

}
