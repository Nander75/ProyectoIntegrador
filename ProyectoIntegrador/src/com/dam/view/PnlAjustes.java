package com.dam.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class PnlAjustes extends JPanel {
	
	private static final int ANCHO = 630;
	private static final int ALTO = 650;
	private JButton btnVolver;
	private JButton btnAjustes;
	private JButton btnSonido;
	private JButton btnMusica;
	private JButton btnIdiomas;
	private JButton btnPrivacidad;
	private JButton btnTerminos;
	
	public PnlAjustes() {
		
		setSize(ANCHO, ALTO);
		
		crearComponentes();
	}

	private void crearComponentes() {
		setLayout(null);
		setBackground(new Color(84, 90, 246));
		
		btnVolver = new JButton("");
		btnVolver.setBackground(new Color(67, 115, 203));
		btnVolver.setIcon(new ImageIcon(PnlAjustes.class.getResource("/img/imgVolver.jpg")));
		btnVolver.setBounds(545, 20, 85, 74);
		add(btnVolver);
		
		btnAjustes = new JButton("");
		btnAjustes.setIcon(new ImageIcon(PnlAjustes.class.getResource("/img/imgAjuste.jpg")));
		btnAjustes.setBounds(226, 20, 178, 166);
		add(btnAjustes);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(134, 219, 339, 389);
		add(panel);
		panel.setLayout(null);
		
		btnSonido = new JButton("");
		btnSonido.setIcon(new ImageIcon(PnlAjustes.class.getResource("/img/imgSonido.jpg")));
		btnSonido.setBounds(44, 28, 103, 83);
		panel.add(btnSonido);
		
		btnMusica = new JButton("");
		btnMusica.setIcon(new ImageIcon(PnlAjustes.class.getResource("/img/imgMusica.jpg")));
		btnMusica.setBounds(191, 28, 103, 83);
		panel.add(btnMusica);
		
		btnIdiomas = new JButton("Idiomas");
		btnIdiomas.setBackground(new Color(58, 51, 204));
		btnIdiomas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIdiomas.setBounds(99, 159, 132, 29);
		panel.add(btnIdiomas);
		
		btnPrivacidad = new JButton("Privacidad");
		btnPrivacidad.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnPrivacidad.setBackground(Color.YELLOW);
		btnPrivacidad.setBounds(27, 302, 135, 27);
		panel.add(btnPrivacidad);
		
		btnTerminos = new JButton("Terminos");
		btnTerminos.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnTerminos.setBackground(Color.YELLOW);
		btnTerminos.setBounds(180, 302, 135, 27);
		panel.add(btnTerminos);
		
	}
}
