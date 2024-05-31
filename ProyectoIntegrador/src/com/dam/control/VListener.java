package com.dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import com.dam.view.PnlAjustes;
import com.dam.view.PnlCalendario;
import com.dam.view.PnlIniciarSesion;
import com.dam.view.PnlLogros;
import com.dam.view.PnlPrincipal;
import com.dam.view.PnlRegistrarse;
import com.dam.view.Test1;
import com.dam.view.Test2;
import com.dam.view.Test3;
import com.dam.view.Test4;
import com.dam.view.Test5;
import com.dam.view.TopRanking;
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
	private TopRanking trank;
	private Test1 ptest1;
	private Test2 ptest2;
	private Test3 ptest3;
	private Test4 ptest4;
	private Test5 ptest5;
	
	public VListener(VPMenu vpm, PnlPrincipal pp, PnlRegistrarse pnlr, PnlIniciarSesion pnlis, PnlAjustes pajustes,
			PnlCalendario pcalendario, PnlLogros plogros, TopRanking trank, Test1 ptest1, Test2 ptest2, Test3 ptest3,
			Test4 ptest4, Test5 ptest5) {
		super();
		this.vpm = vpm;
		this.pp = pp;
		this.pnlr = pnlr;
		this.pnlis = pnlis;
		this.pajustes = pajustes;
		this.pcalendario = pcalendario;
		this.plogros = plogros;
		this.trank = trank;
		this.ptest1 = ptest1;
		this.ptest2 = ptest2;
		this.ptest3 = ptest3;
		this.ptest4 = ptest4;
		this.ptest5 = ptest5;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
	        
			if (e.getActionCommand().equals(VPMenu.ACT_CMN_BTN_INICIARSESION)) {
				pnlis.setVisible(true);
				vpm.setVisible(false);
				pnlr.setVisible(false);	
			}else if (e.getActionCommand().equals(VPMenu.ACT_CMN_BTN_REGISTRAR)) {
				pnlr.setVisible(true);
				vpm.setVisible(false);
				pnlis.setVisible(false);
			}else if (e.getActionCommand().equals(PnlIniciarSesion.ACT_CMN_BTN_SIGUIENTE)) {
				pp.setVisible(true);
				pnlis.setVisible(false);
			}else if (e.getActionCommand().equals(PnlRegistrarse.ACT_CMN_BTN_SIGUIENTE)) {
				pp.setVisible(true);
				pnlr.setVisible(false);
			}else if (e.getActionCommand().equals(PnlPrincipal.ACT_CMN_BTN_LOGROS)) {
				plogros.setVisible(true);
				pp.setVisible(false);
			}else if (e.getActionCommand().equals(PnlPrincipal.ACT_CMN_BTN_CALENDARIO)) {
				pcalendario.setVisible(true);
				pp.setVisible(false);
			}else if (e.getActionCommand().equals(PnlPrincipal.ACT_CMN_BTN_AJUSTES)) {
				pajustes.setVisible(true);
				pp.setVisible(false);
			}else if (e.getActionCommand().equals(PnlPrincipal.ACT_CMN_BTN_RANKING)) {
				trank.setVisible(true);
				pp.setVisible(false);
			}else if (e.getActionCommand().equals(PnlPrincipal.ACT_CMN_BTN_TEST1)) {
				ptest1.setVisible(true);
				pp.setVisible(false);
			}else if (e.getActionCommand().equals(PnlPrincipal.ACT_CMN_BTN_TEST2)) {
				ptest2.setVisible(true);
				pp.setVisible(false);
			}else if (e.getActionCommand().equals(PnlPrincipal.ACT_CMN_BTN_TEST3)) {
				ptest3.setVisible(true);
				pp.setVisible(false);
			}else if (e.getActionCommand().equals(PnlPrincipal.ACT_CMN_BTN_TEST4)) {
				ptest4.setVisible(true);
				pp.setVisible(false);
			}else if (e.getActionCommand().equals(PnlPrincipal.ACT_CMN_BTN_TEST5)) {
				ptest5.setVisible(true);
				pp.setVisible(false);
			}else if (e.getActionCommand().equals(PnlLogros.ACT_CMN_BTN_VOLVER)) {
				plogros.setVisible(false);
				pp.setVisible(true);
			}else if (e.getActionCommand().equals(PnlCalendario.ACT_CMN_BTN_VOLVER)) {
				plogros.setVisible(false);
				pp.setVisible(true);
			}else if (e.getActionCommand().equals(TopRanking.ACT_CMN_BTN_VOLVER)) {
				trank.setVisible(false);
				pp.setVisible(true);
			}else if (e.getActionCommand().equals(PnlAjustes.ACT_CMN_BTN_VOLVER)) {
				pajustes.setVisible(false);
				pp.setVisible(true);
			}else if (e.getActionCommand().equals(Test1.ACT_CMN_BTN_FINALIZAR)) {
				ptest1.setVisible(false);
				pp.setVisible(true);
				
				int resultado = ptest1.puntuacionTest();
				JOptionPane.showMessageDialog(ptest1, "Tu puntuación es de: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

			}else if (e.getActionCommand().equals(Test2.ACT_CMN_BTN_FINALIZAR)) {
				ptest2.setVisible(false);
				pp.setVisible(true);
				
				int resultado = ptest2.puntuacionTest();
				JOptionPane.showMessageDialog(ptest2, "Tu puntuación es de: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			
			}else if (e.getActionCommand().equals(Test3.ACT_CMN_BTN_FINALIZAR)) {
				ptest3.setVisible(false);
				pp.setVisible(true);
				
				int resultado = ptest3.puntuacionTest();
				JOptionPane.showMessageDialog(ptest3, "Tu puntuación es de: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			}else if (e.getActionCommand().equals(Test4.ACT_CMN_BTN_FINALIZAR)) {
				ptest4.setVisible(false);
				ptest4.dispose();
				pp.setVisible(true);
				
				int resultado = ptest4.puntuacionTest();
				JOptionPane.showMessageDialog(ptest4, "Tu puntuación es de: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			}else if (e.getActionCommand().equals(Test5.ACT_CMN_BTN_FINALIZAR)) {
				ptest5.setVisible(false);
				pp.setVisible(true);
				
				int resultado = ptest5.puntuacionTest();
				JOptionPane.showMessageDialog(ptest5, "Tu puntuación es de: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		

	}
		
}
