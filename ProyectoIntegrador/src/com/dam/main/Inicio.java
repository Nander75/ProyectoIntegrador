package com.dam.main;

import java.awt.EventQueue;

import com.dam.control.VListener;
import com.dam.view.PnlAjustes;
import com.dam.view.PnlCalendario;
import com.dam.view.PnlIniciarSesion;
import com.dam.view.PnlLenguaje1;
import com.dam.view.PnlLogros;
import com.dam.view.PnlPrincipal;
import com.dam.view.PnlRegistrarse;
import com.dam.view.VPMenu;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			/*
			 * private PnlPrincipal pp;
	private PnlRegistrarse pnlr;
	private PnlIniciarSesion pnlis;
	private PnlAjustes pajustes;
	private PnlCalendario pcalendario;
	private PnlLogros plogros;
	private PnlLenguaje1 plenguaje1;*/
			@Override
			public void run() {
				VPMenu vpm = new VPMenu();
				PnlRegistrarse pnlr = new PnlRegistrarse();
				PnlIniciarSesion pnlis = new PnlIniciarSesion();
				PnlPrincipal pp = new PnlPrincipal();
				PnlAjustes pajustes = new PnlAjustes();
				PnlCalendario pcalendario = new PnlCalendario();
				PnlLogros plogros = new PnlLogros();
				PnlLenguaje1 plenguaje1 = new PnlLenguaje1();
				
				
				VListener listener = new VListener(vpm, pp, pnlr, pnlis, pajustes, pcalendario, plogros, plenguaje1);
				
				pnlr.setListener(listener);
				pnlis.setListener(listener);
				vpm.setListener(listener);
				
				vpm.hacerVisible();
				
			}
		});
	}
}
 



























