package com.dam.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.dam.control.VListener;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class VPMenu extends JFrame {

	public static final String ACT_CMN_BTN_INICIARSESION = "Iniciar Sesion";
	public static final String ACT_CMN_BTN_TERMINOS = "Terminos";
	public static final String ACT_CMN_BTN_PRIVACIDAD = "Privacidad";
	public static final String ACT_CMN_BTN_REGISTRAR = "Registrarse";
	
	private static final int ANCHO = 630;
	private static final int ALTO = 650;
	
	private JButton btnIniciarSesion;
	private JButton btnRegistrarse;
	private JButton btnPrivacidad;
	private JButton btnTerminos;
	private JButton btnImagen;
	
	public VPMenu() {
		super("AMApp");
		
		configurarFrame();
		
		inicializarComponentes();
	}
	
	private void configurarFrame() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		setSize(ANCHO, ALTO);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();                     
		setLocation((pantalla.width - this.getSize().width) / 2,  (pantalla.height - this.getSize().height) / 2); 			
	}
	
	private void inicializarComponentes() {
		getContentPane().setBackground(new Color(84, 90, 246));
		getContentPane().setForeground(new Color(84, 90, 246));
		getContentPane().setLayout(null);
		
		btnIniciarSesion = new JButton(ACT_CMN_BTN_INICIARSESION);
		btnIniciarSesion.setForeground(new Color(0, 0, 0));
		btnIniciarSesion.setBackground(new Color(255, 255, 0));
		btnIniciarSesion.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnIniciarSesion.setBounds(208, 344, 199, 36);
		getContentPane().add(btnIniciarSesion);
		
		btnRegistrarse = new JButton(ACT_CMN_BTN_REGISTRAR);
		btnRegistrarse.setBackground(new Color(255, 255, 0));
		btnRegistrarse.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnRegistrarse.setBounds(208, 417, 199, 36);
		getContentPane().add(btnRegistrarse);
		
		btnPrivacidad = new JButton(ACT_CMN_BTN_PRIVACIDAD);
		btnPrivacidad.setBackground(new Color(255, 255, 0));
		btnPrivacidad.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnPrivacidad.setBounds(115, 502, 135, 27);
		getContentPane().add(btnPrivacidad);
		
		btnTerminos = new JButton(ACT_CMN_BTN_TERMINOS);
		btnTerminos.setBackground(new Color(255, 255, 0));
		btnTerminos.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btnTerminos.setBounds(365, 502, 135, 27);
		getContentPane().add(btnTerminos);
		
		btnImagen = new JButton("");
		btnImagen.setIcon(new ImageIcon(VPMenu.class.getResource("/img/Enchiridion.jpg")));
		btnImagen.setBounds(226, 59, 163, 222);
		getContentPane().add(btnImagen);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void setListener (VListener listener) {
		btnRegistrarse.addActionListener(listener);
		btnIniciarSesion.addActionListener(listener);
		btnTerminos.addActionListener(listener);
	}
	
	//TODO public DatosUsuario getDatosUsuario()
}