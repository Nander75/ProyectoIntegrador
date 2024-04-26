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

public class PnlRegistrarse extends JPanel {

	private static final int ANCHO = 630;
	private static final int ALTO = 650;
	private JTextField txtRegistrarse;
	private JTextField txtNombre;
	private JTextField txtContrasena;
	private JButton btnSiguiente;
	private JButton btnIniciarSesion;
	private JTextField txtApellidos;
	private JTextField txtNomUsuario;
	private JTextField txtCorreo;
	
	public PnlRegistrarse() {
		
		setSize(ANCHO, ALTO);
		crearComponentes();
	}

	private void crearComponentes() {
		setLayout(null);
		setBackground(new Color(84, 90, 246));
		
		txtRegistrarse = new JTextField();
		txtRegistrarse.setFont(new Font("Sylfaen", Font.BOLD, 24));
		txtRegistrarse.setBackground(new Color(138, 138, 255));
		txtRegistrarse.setText("          Registrarse");
		txtRegistrarse.setEditable(false);
		txtRegistrarse.setBounds(190, 64, 250, 51);
		add(txtRegistrarse);
		txtRegistrarse.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNombre.setText("Introduce tu nombre");
		txtNombre.setBounds(115, 160, 400, 40);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtContrasena = new JTextField();
		txtContrasena.setText("Introduce tu contraseña");
		txtContrasena.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtContrasena.setBounds(115, 400, 400, 40);
		add(txtContrasena);
		txtContrasena.setColumns(10);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnSiguiente.setBackground(new Color(255, 255, 255));
		btnSiguiente.setBounds(215, 475, 199, 36);
		add(btnSiguiente);
		
		btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnIniciarSesion.setBackground(new Color(255, 255, 255));
		btnIniciarSesion.setBounds(242, 539, 147, 36);
		add(btnIniciarSesion);
		
		txtApellidos = new JTextField();
		txtApellidos.setText("Introduce tus apellidos");
		txtApellidos.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(115, 220, 400, 40);
		add(txtApellidos);
		
		txtNomUsuario = new JTextField();
		txtNomUsuario.setText("Introduce tu nombre de usuario ");
		txtNomUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtNomUsuario.setColumns(10);
		txtNomUsuario.setBounds(115, 280, 400, 40);
		add(txtNomUsuario);
		
		txtCorreo = new JTextField();
		txtCorreo.setText("Introduce tu correo electrónico");
		txtCorreo.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(115, 340, 400, 40);
		add(txtCorreo);
		
	}
}
