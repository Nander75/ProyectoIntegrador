package com.dam.view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class PnlLogros extends JPanel {
	private static final int ANCHO = 630;
	private static final int ALTO = 650;
	private JTextField txtJPerfectos;
	private JTextField txtJEpicos;
	private JTextField txtJMagicos;
	
	public PnlLogros() {
		
		setSize(ANCHO, ALTO);
		setLayout(null);
		
		JLabel lblLogros = new JLabel("Logros");
		lblLogros.setFont(new Font("Sitka Small", Font.BOLD, 24));
		lblLogros.setBounds(267, 91, 95, 49);
		add(lblLogros);
		
		JLabel lblJPerfectos = new JLabel("Juegos perfectos");
		lblJPerfectos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblJPerfectos.setBounds(81, 290, 136, 35);
		add(lblJPerfectos);
		
		txtJPerfectos = new JTextField();
		txtJPerfectos.setEditable(false);
		txtJPerfectos.setBounds(100, 217, 96, 19);
		add(txtJPerfectos);
		txtJPerfectos.setColumns(10);
		
		JLabel lblJEpicos = new JLabel("Juegos épicos");
		lblJEpicos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblJEpicos.setBounds(251, 290, 136, 35);
		add(lblJEpicos);
		
		txtJEpicos = new JTextField();
		txtJEpicos.setEditable(false);
		txtJEpicos.setColumns(10);
		txtJEpicos.setBounds(266, 217, 96, 19);
		add(txtJEpicos);
		
		JLabel lblJMagicos = new JLabel("Juegos mágicos");
		lblJMagicos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblJMagicos.setBounds(429, 290, 136, 35);
		add(lblJMagicos);
		
		txtJMagicos = new JTextField();
		txtJMagicos.setEditable(false);
		txtJMagicos.setColumns(10);
		txtJMagicos.setBounds(445, 217, 96, 19);
		add(txtJMagicos);
		
		JLabel lblTrofeos = new JLabel("Trofeos");
		lblTrofeos.setFont(new Font("Sitka Small", Font.BOLD, 24));
		lblTrofeos.setBounds(262, 367, 106, 49);
		add(lblTrofeos);
		
		JLabel lblGuardianLenguaje1 = new JLabel("Guardian Java");
		lblGuardianLenguaje1.setAutoscrolls(true);
		lblGuardianLenguaje1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGuardianLenguaje1.setBounds(81, 522, 136, 35);
		add(lblGuardianLenguaje1);
		
		JLabel lblGuardianLenguaje2 = new JLabel("Guardian C++");
		lblGuardianLenguaje2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGuardianLenguaje2.setBounds(251, 522, 136, 35);
		add(lblGuardianLenguaje2);
		
		JLabel lblGuardianLenguaje3 = new JLabel("Guardian Visual");
		lblGuardianLenguaje3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGuardianLenguaje3.setBounds(429, 522, 136, 35);
		add(lblGuardianLenguaje3);
		
		JButton btnVolver = new JButton("");
		btnVolver.setIcon(new ImageIcon(PnlLogros.class.getResource("/img/imgVolver.jpg")));
		btnVolver.setBounds(552, 10, 78, 90);
		add(btnVolver);
		
		crearComponentes();
	}

	private void crearComponentes() {
		
		setBackground(new Color(84, 90, 246));
		
		
	}
}
