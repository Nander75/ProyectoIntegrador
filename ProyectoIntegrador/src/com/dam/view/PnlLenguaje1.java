package com.dam.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import com.dam.control.VListener;

import java.awt.Font;

public class PnlLenguaje1 extends JPanel{
	private static final String ACT_CMN_BTN_JAVACLASICO = "Clásico";
	private static final String ACT_CMN_BTN_RANKING = "Ranking";
	private static final int ANCHO = 630;
	private static final int ALTO = 450;
	private JTextField txtJava;
	private JButton btnVolver;
	private JButton btnPreguntasJava;
	private JButton btnRanking;
	
	public PnlLenguaje1() {
		
		setSize(ANCHO, ALTO);
		
		crearComponentes();
	}

	private void crearComponentes() {
		setLayout(null);
		setBackground(new Color(84, 90, 246));
		
		btnVolver = new JButton("");
		btnVolver.setIcon(new ImageIcon(PnlLenguaje1.class.getResource("/img/imgVolver.jpg")));
		btnVolver.setBounds(552, 31, 78, 90);
		add(btnVolver);
		
		txtJava = new JTextField();
		txtJava.setForeground(new Color(255, 255, 255));
		txtJava.setBackground(new Color(128, 0, 128));
		txtJava.setEditable(false);
		txtJava.setText("         Java");
		txtJava.setFont(new Font("Tahoma", Font.BOLD, 26));
		txtJava.setBounds(179, 130, 223, 60);
		add(txtJava);
		txtJava.setColumns(10);
		
		btnPreguntasJava = new JButton(ACT_CMN_BTN_JAVACLASICO);
		btnPreguntasJava.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPreguntasJava.setBounds(229, 256, 110, 29);
		add(btnPreguntasJava);
		
		btnRanking = new JButton(ACT_CMN_BTN_RANKING);
		btnRanking.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRanking.setBounds(229, 322, 110, 29);
		add(btnRanking);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void setListener (VListener listener) {
		btnVolver.addActionListener(listener);
		btnPreguntasJava.addActionListener(listener);
		btnRanking.addActionListener(listener);
	}
}
