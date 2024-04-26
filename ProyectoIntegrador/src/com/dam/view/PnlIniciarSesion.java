package com.dam.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlIniciarSesion extends JPanel {

	private static final int ANCHO = 630;
	private static final int ALTO = 650;
	private JTextField txtIniciarSesion;
	private JTextField txtNomUsuario;
	private JTextField txtContrasena;
	private JButton btnSiguiente;
	private JButton btnContrasenaOlvidada;
	private JButton btnRegistrarse;
	
	public PnlIniciarSesion() {
		
		setSize(ANCHO, ALTO);
		crearComponentes();
	}

	private void crearComponentes() {
		setLayout(null);
		setBackground(new Color(84, 90, 246));
		
		txtIniciarSesion = new JTextField();
		txtIniciarSesion.setFont(new Font("Sylfaen", Font.BOLD, 24));
		txtIniciarSesion.setBackground(new Color(138, 138, 255));
		txtIniciarSesion.setText("        Iniciar Sesión");
		txtIniciarSesion.setEditable(false);
		txtIniciarSesion.setBounds(190, 70, 250, 67);
		add(txtIniciarSesion);
		txtIniciarSesion.setColumns(10);
		
		txtNomUsuario = new JTextField();
		txtNomUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNomUsuario.setText("Introduce tu nombre de usuario o correo electrónico");
		txtNomUsuario.setBounds(120, 230, 400, 40);
		add(txtNomUsuario);
		txtNomUsuario.setColumns(10);
		
		txtContrasena = new JTextField();
		txtContrasena.setText("Introduce tu contraseña");
		txtContrasena.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtContrasena.setBounds(141, 310, 350, 40);
		add(txtContrasena);
		txtContrasena.setColumns(10);
		
		btnContrasenaOlvidada = new JButton("Contraseña Olvidada");
		btnContrasenaOlvidada.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnContrasenaOlvidada.setBounds(237, 377, 160, 21);
		add(btnContrasenaOlvidada);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnSiguiente.setBackground(new Color(255, 255, 255));
		btnSiguiente.setBounds(215, 466, 199, 36);
		add(btnSiguiente);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnRegistrarse.setBackground(new Color(255, 255, 255));
		btnRegistrarse.setBounds(254, 538, 129, 36);
		add(btnRegistrarse);
		
	}
}
