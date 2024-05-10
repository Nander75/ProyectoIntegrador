package com.dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.dam.model.DatosUsuarioPI;
import com.dam.view.PnlAjustes;
import com.dam.view.PnlCalendario;
import com.dam.view.PnlIniciarSesion;
import com.dam.view.PnlLenguaje1;
import com.dam.view.PnlLogros;
import com.dam.view.PnlPrincipal;
import com.dam.view.PnlRegistrarse;
//import com.dam.view.VLogin;
//import com.dam.view.VRegistro;
import com.dam.view.VPMenu;

public class VListener implements ActionListener {
		
	private VPMenu vpm;
	private PnlPrincipal pp;
	private PnlRegistrarse pnlr;
	private PnlIniciarSesion pnlis;
	private PnlAjustes pajustes;
	private PnlCalendario pcalendario;
	private PnlLogros plogros;
	private PnlLenguaje1 plenguaje1;	
		
	public VListener(VPMenu vpm, PnlPrincipal pp, PnlRegistrarse pnlr, PnlIniciarSesion pnlis, PnlAjustes pajustes,
			PnlCalendario pcalendario, PnlLogros plogros, PnlLenguaje1 plenguaje1) {
		super();
		this.vpm = vpm;
		this.pp = pp;
		this.pnlr = pnlr;
		this.pnlis = pnlis;
		this.pajustes = pajustes;
		this.pcalendario = pcalendario;
		this.plogros = plogros;
		this.plenguaje1 = plenguaje1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(VPMenu.ACT_CMN_BTN_INICIARSESION)) {
				pnlis.hacerVisible();
				vpm.dispose();
			}else if (e.getActionCommand().equals(VPMenu.ACT_CMN_BTN_REGISTRAR)) {
				vpm.dispose();
				pnlr.hacerVisible();
			}else if (e.getActionCommand().equals(VPMenu.ACT_CMN_BTN_TERMINOS)) {
				//panel 
			}else if (e.getActionCommand().equals(VPMenu.ACT_CMN_BTN_PRIVACIDAD)) {
				//panel
			}
		}
		
		if (e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(PnlIniciarSesion.ACT_CMN_BTN_SIGUIENTE)) {
				//login();
				
			} else if (e.getActionCommand().equals(PnlIniciarSesion.ACT_CMN_BTN_REGISTRAR)) {
				pnlr.hacerVisible();
			}else if (e.getActionCommand().equals(PnlRegistrarse.ACT_CMN_BTN_INICIARSESION)) {
				pnlis.hacerVisible();
				
			}else if (e.getActionCommand().equals(PnlRegistrarse.ACT_CMN_BTN_ACEPTAR)) {
				//aceptar();
			}
			
		}

	}
		/*
		private void aceptar() {
			DatosUsuarioPI du = vr.getDatosUsuario();
			
			if(du != null) {
				int res = up.registrarUsuario(du);
				
				if (res == 0) {
					JOptionPane.showMessageDialog(vr, "El usuario ya existe ", 
							"Error de Registro", JOptionPane.ERROR_MESSAGE);
				}else if(res == -1) {
					JOptionPane.showMessageDialog(vr, "La contraseña ya existe ", 
							"Error de Registro", JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(vr, "El usuario se ha registrado correctamente ", 
							"Información de Registro", JOptionPane.INFORMATION_MESSAGE);
					vr.dispose();
					vl.hacerVisible();
					vl.setUsuario(du.getUsuario());
					contIntentos = 0;
				}
			}
		}

		private void login() {
			DatosUsuario du = vl.getDatosUsuario();
			
			if (du != null) {
				int res = up.consultarPassword(du);
				
				if (res == 1) {
					vl.dispose();
					vp.hacerVisible();

				} else {
					contIntentos++;
					
					if (res == -1){
						JOptionPane.showMessageDialog(vl, "la contraseña es incorrecta, te quedan " 
															+ (NUM_INTENTOS - contIntentos) + " intentos. Si llegas a " 
															+ NUM_INTENTOS + " intentos se cerrará la aplicación", 
						"Error de Acceso", JOptionPane.ERROR_MESSAGE);
					
					} else {
						JOptionPane.showMessageDialog(vl, "El usuario no está registrado, te quedan " 
															+ (NUM_INTENTOS - contIntentos) + " intentos. Si llegas a " 
															+ NUM_INTENTOS + " intentos se cerrará la aplicación", 
							"Error de Acceso", JOptionPane.ERROR_MESSAGE);
					}
					
					if (contIntentos == 3) {
						JOptionPane.showMessageDialog(vl, "Se han realizado 3 intentos de acceso, se va a cerrar la aplicación", 
								"Información de Acceso", JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}
				}
			}
		}

	}
*/
}
