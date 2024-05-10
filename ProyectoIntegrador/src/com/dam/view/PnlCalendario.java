package com.dam.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import com.dam.control.VListener;

import java.awt.Font;

public class PnlCalendario extends JPanel {
	
	
	private static final String ACT_CMN_BTN_VOLVER = " ";
	private static final int ANCHO = 630;
	private static final int ALTO = 650;
	
	private JTextField txtActDiaria;
	private JTextField txtDiasS;
	private JTextField txtDiasSeguidos;
	private JButton btnCalendario;
	private JButton btnVolver;
	
	public PnlCalendario() {
		
		setSize(ANCHO, ALTO);
		
		crearComponentes();
	}

	private void crearComponentes() {
		setLayout(null);
		setBackground(new Color(84, 90, 246));
		
		btnVolver = new JButton(ACT_CMN_BTN_VOLVER);
		btnVolver.setIcon(new ImageIcon(PnlCalendario.class.getResource("/img/imgVolver.jpg")));
		btnVolver.setBounds(553, 10, 77, 91);
		add(btnVolver);
		
		txtActDiaria = new JTextField();
		txtActDiaria.setEditable(false);
		txtActDiaria.setBackground(new Color(47, 151, 255));
		txtActDiaria.setText("  Actividad Diaria");
		txtActDiaria.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtActDiaria.setBounds(202, 115, 225, 47);
		add(txtActDiaria);
		txtActDiaria.setColumns(10);
		
		btnCalendario = new JButton("");
		btnCalendario.setIcon(new ImageIcon(PnlCalendario.class.getResource("/img/imgCalendario.jpg")));
		btnCalendario.setBounds(91, 172, 447, 231);
		add(btnCalendario);
		
		//TODO cada vez que pulsen iniciar sesion se suma uno a los dias seguidos
		txtDiasS = new JTextField();
		txtDiasS.setText("    Días Seguidos");
		txtDiasS.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtDiasS.setEditable(false);
		txtDiasS.setColumns(10);
		txtDiasS.setBackground(new Color(47, 151, 255));
		txtDiasS.setBounds(202, 464, 225, 47);
		add(txtDiasS);
		
		txtDiasSeguidos = new JTextField();
		txtDiasSeguidos.setText("0");
		txtDiasSeguidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDiasSeguidos.setEditable(false);
		txtDiasSeguidos.setBounds(263, 538, 96, 19);
		add(txtDiasSeguidos);
		txtDiasSeguidos.setColumns(10);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void setListener (VListener listener) {
		btnVolver.addActionListener(listener);
	}
}
