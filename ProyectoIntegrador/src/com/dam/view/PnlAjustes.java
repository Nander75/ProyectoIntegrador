package com.dam.view;

import javax.swing.JPanel;

import com.dam.control.VListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class PnlAjustes extends JPanel {
	
	public static final String ACT_CMN_BTN_VOLVER = " ";
	public static final String ACT_CMN_BTN_IDIOMAS = "Idiomas";
	public static final String ACT_CMN_BTN_PRIVACIDAD = "Privacidad";
	public static final String ACT_CMN_BTN_TERMINOS = "Terminos";
	
	private static final int ANCHO = 630;
	private static final int ALTO = 650;
	private JButton btnVolver;
	private JButton btnAjustes;
	private JButton btnSonido;
	private JButton btnMusica;
	private JButton btnPrivacidad;
	private JButton btnTerminos;
	private JComboBox<String> cmbIdioma;
	
	public PnlAjustes() {
		
		setSize(ANCHO, ALTO);
		
		crearComponentes();
	}

	private void crearComponentes() {
		setLayout(null);
		setBackground(new Color(84, 90, 246));
		
		btnVolver = new JButton(ACT_CMN_BTN_VOLVER);
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
		
		btnPrivacidad = new JButton(ACT_CMN_BTN_PRIVACIDAD);
		btnPrivacidad.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnPrivacidad.setBackground(Color.YELLOW);
		btnPrivacidad.setBounds(27, 302, 135, 27);
		panel.add(btnPrivacidad);
		
		btnTerminos = new JButton(ACT_CMN_BTN_TERMINOS);
		btnTerminos.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnTerminos.setBackground(Color.YELLOW);
		btnTerminos.setBounds(180, 302, 135, 27);
		panel.add(btnTerminos);
		
		cmbIdioma = new JComboBox<String>();
		cmbIdioma.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cmbIdioma.setModel(new DefaultComboBoxModel<String>(new String[] {"Español", "English", "German", "French"}));
		cmbIdioma.setBounds(121, 199, 96, 49);
		panel.add(cmbIdioma);
		
		JLabel lblIdiomas = new JLabel("Idioma");
		lblIdiomas.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIdiomas.setBounds(133, 145, 72, 27);
		panel.add(lblIdiomas);
		
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void setListener (VListener listener) {
		btnAjustes.addActionListener(listener);
		btnTerminos.addActionListener(listener);
		btnPrivacidad.addActionListener(listener);
		btnVolver.addActionListener(listener);
	}
}
