package com.dam.view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PnlPrincipal extends JPanel {
	private static final int ANCHO = 630;
	private static final int ALTO = 650;
	private JButton btnNewButton;
	private JButton btnAjustes;
	private JButton btnCalendario;
	private JButton btnLogros;
	private JButton btnLenguaje1;
	private JButton btnLenguaje2;
	private JButton btnLenguaje3;
	private JButton btnRanking;
	
	
	public PnlPrincipal() {
		
		setSize(ANCHO, ALTO);
		
	
		crearComponentes();
	}


	private void crearComponentes() {
		setLayout(null);
		setBackground(new Color(84, 90, 246));
		
		btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(PnlPrincipal.class.getResource("/img/Enchiridion2.jpg")));
		btnNewButton.setBounds(231, 84, 168, 234);
		add(btnNewButton);
		
		btnAjustes = new JButton("");
		btnAjustes.setIcon(new ImageIcon(PnlPrincipal.class.getResource("/img/imgAjustes2.jpg")));
		btnAjustes.setBounds(0, 32, 48, 48);
		add(btnAjustes);
		
		btnCalendario = new JButton("Calendario");
		btnCalendario.setBounds(535, 59, 85, 21);
		add(btnCalendario);
		
		btnLogros = new JButton("Logros");
		btnLogros.setBounds(10, 163, 85, 21);
		add(btnLogros);
		
		btnLenguaje2 = new JButton("Lenguaje2");
		btnLenguaje2.setBounds(271, 478, 85, 21);
		add(btnLenguaje2);
		
		btnLenguaje1 = new JButton("Lenguaje 1");
		btnLenguaje1.setBounds(93, 478, 85, 21);
		add(btnLenguaje1);
		
		btnLenguaje3 = new JButton("Lenguaje3");
		btnLenguaje3.setBounds(449, 478, 85, 21);
		add(btnLenguaje3);
		
		btnRanking = new JButton("Ranking");
		btnRanking.setBounds(535, 163, 85, 21);
		add(btnRanking);
	}
}
