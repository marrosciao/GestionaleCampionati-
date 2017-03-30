package it.mantovaninformatica.GestionaleCampionati.view;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class finestra extends JFrame {
	JFrame finestra2=new JFrame("FC-REGISTRAZIONE");
	JButton registrazioneBtn= new JButton("Nuova registrazione");
	JButton infoPilota= new JButton("Resoconto pilota");
	JPanel contFinestra=new JPanel();
	JPanel contRegistrazione=new JPanel();
	JPanel pFirst=new JPanel();
	pannelloRegistrazione pSecond=new pannelloRegistrazione();
	CardLayout cl =new CardLayout();

	public finestra(){
		super();
		this.setContentPane(contFinestra);
		contFinestra.setLayout(cl);
		pFirst.add(registrazioneBtn);
		pFirst.add(infoPilota);
		contFinestra.add(pFirst, "1");
		contFinestra.add(pSecond, "2");
		cl.show(contFinestra, "1");
		this.show();
		this.pack();

		registrazioneBtn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				cl.show(contFinestra, "2");
			}
			
			
		});

	}
}
