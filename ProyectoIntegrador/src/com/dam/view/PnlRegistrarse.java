package com.dam.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

import com.dam.control.VListener;
import com.dam.model.DatosUsuarioPI;

import javax.swing.JTextField;

public class PnlRegistrarse extends JPanel {

	public static final String ACT_CMN_BTN_INICIARSESION = "Iniciar Sesion";
	public static final String ACT_CMN_BTN_ACEPTAR = "Aceptar";
	
	private static final int ANCHO = 630;
	private static final int ALTO = 650;
	
	private JTextField txtRegistrarse;
	private JTextField txtNombre;
	private JTextField txtContrasenia;
	private JButton btnAceptar;
	private JButton btnIniciarSesion;
	private JTextField txtUsuario;
	private JTextField txtComprContrasenia;
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
		
		txtContrasenia = new JTextField();
		txtContrasenia.setText("Introduce tu contraseña");
		txtContrasenia.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtContrasenia.setBounds(115, 340, 400, 40);
		add(txtContrasenia);
		txtContrasenia.setColumns(10);
		
		btnAceptar = new JButton(ACT_CMN_BTN_ACEPTAR);
		btnAceptar.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnAceptar.setBackground(new Color(255, 255, 255));
		btnAceptar.setBounds(215, 475, 199, 36);
		add(btnAceptar);
		
		btnIniciarSesion = new JButton(ACT_CMN_BTN_INICIARSESION);
		btnIniciarSesion.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnIniciarSesion.setBackground(new Color(255, 255, 255));
		btnIniciarSesion.setBounds(242, 539, 147, 36);
		add(btnIniciarSesion);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("Introduce tu nombre de usuario");
		txtUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(115, 220, 400, 40);
		add(txtUsuario);
		
		txtComprContrasenia = new JTextField();
		txtComprContrasenia.setText("Vuelve a introducir la contraseña");
		txtComprContrasenia.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtComprContrasenia.setColumns(10);
		txtComprContrasenia.setBounds(115, 400, 400, 40);
		add(txtComprContrasenia);
		
		txtCorreo = new JTextField();
		txtCorreo.setText("Introduce tu correo electrónico");
		txtCorreo.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(115, 280, 400, 40);
		add(txtCorreo);
		
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void setListener (VListener listener) {
		btnIniciarSesion.addActionListener(listener);
		btnAceptar.addActionListener(listener);
	}
	
	public DatosUsuarioPI getDatosUsuario() {
		DatosUsuarioPI du =null;
		
		String nom = txtNombre.getText().trim();
		String correo = txtCorreo.getText().trim();
		String user = txtUsuario.getText().trim();
		String pwd = txtContrasenia.getText().trim();
		String pwdConfirm = txtComprContrasenia.getText().trim();
		
		if (nom.isEmpty()) {
			JOptionPane.showMessageDialog(this, "El nombre es un dato obligatorio", 
					"Error de datos", JOptionPane.ERROR_MESSAGE);
		}else if (correo.isEmpty()) {
			JOptionPane.showMessageDialog(this, "El email es un dato obligatorio", 
					"Error de datos", JOptionPane.ERROR_MESSAGE);
		}else if (user.isEmpty()) {
			JOptionPane.showMessageDialog(this, "El nombre de usuario es un dato obligatorio", 
					"Error de datos", JOptionPane.ERROR_MESSAGE);
		} else if (pwd.isEmpty() || pwdConfirm.isEmpty()) {
			JOptionPane.showMessageDialog(this, "La contraseña es un dato obligatorio", 
					"Error de datos", JOptionPane.ERROR_MESSAGE);
		} else if (pwd.length() < 8) {
			JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 8 caracteres", 
					"Error de datos", JOptionPane.ERROR_MESSAGE);
		} else if(!pwd.equals(pwdConfirm)){
			JOptionPane.showMessageDialog(this, "La contraseña y la confirmación no coinciden", 
					"Error de datos", JOptionPane.ERROR_MESSAGE);
		}else {
			du = new DatosUsuarioPI(user, pwd);
		}
		
		return du;
		
	}
}
