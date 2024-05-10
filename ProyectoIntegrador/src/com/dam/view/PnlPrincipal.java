package com.dam.view;

import javax.swing.JPanel;

import com.dam.control.VListener;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PnlPrincipal extends JPanel {
	private static final String ACT_CMN_BTN_AJUSTES = " ";
	public static final String ACT_CMN_BTN_RANKING = "Ranking";
	public static final String ACT_CMN_BTN_LENGUAJE3 = "Lenguaje3";
	public static final String ACT_CMN_BTN_LENGUAJE2 = "Lenguaje2";
	public static final String ACT_CMN_BTN_LENGUAJE_1 = "Lenguaje 1";
	public static final String ACT_CMN_BTN_LOGROS = "Logros";
	public static final String ACT_CMN_BTN_CALENDARIO = "Calendario";
	
	private static final int ANCHO = 630;
	private static final int ALTO = 650;
	
	private JButton btnImagen;
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
		
		btnImagen = new JButton("");
		btnImagen.setIcon(new ImageIcon(PnlPrincipal.class.getResource("/img/Enchiridion2.jpg")));
		btnImagen.setBounds(231, 84, 168, 234);
		add(btnImagen);
		
		btnAjustes = new JButton(ACT_CMN_BTN_AJUSTES);
		btnAjustes.setIcon(new ImageIcon(PnlPrincipal.class.getResource("/img/imgAjustes2.jpg")));
		btnAjustes.setBounds(0, 32, 48, 48);
		add(btnAjustes);
		
		btnCalendario = new JButton(ACT_CMN_BTN_CALENDARIO);
		btnCalendario.setBounds(535, 59, 85, 21);
		add(btnCalendario);
		
		btnLogros = new JButton(ACT_CMN_BTN_LOGROS);
		btnLogros.setBounds(10, 163, 85, 21);
		add(btnLogros);
		
		btnLenguaje1 = new JButton(ACT_CMN_BTN_LENGUAJE_1);
		btnLenguaje1.setBounds(93, 478, 85, 21);
		add(btnLenguaje1);
		
		btnLenguaje2 = new JButton(ACT_CMN_BTN_LENGUAJE2);
		btnLenguaje2.setBounds(271, 478, 85, 21);
		add(btnLenguaje2);
		
		btnLenguaje3 = new JButton(ACT_CMN_BTN_LENGUAJE3);
		btnLenguaje3.setBounds(449, 478, 85, 21);
		add(btnLenguaje3);
		
		btnRanking = new JButton(ACT_CMN_BTN_RANKING);
		btnRanking.setBounds(535, 163, 85, 21);
		add(btnRanking);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void setListener (VListener listener) {
		btnAjustes.addActionListener(listener);
		btnCalendario.addActionListener(listener);
		btnLogros.addActionListener(listener);
		btnRanking.addActionListener(listener);
		btnAjustes.addActionListener(listener);
		btnLenguaje1.addActionListener(listener);
		btnLenguaje2.addActionListener(listener);
		btnLenguaje3.addActionListener(listener);
	}
}
