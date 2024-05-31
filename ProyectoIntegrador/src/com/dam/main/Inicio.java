package com.dam.main;

import java.awt.EventQueue;

import com.dam.control.VListener;
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
import com.dam.view.VPMenu;

public class Inicio {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				VPMenu vpm = new VPMenu();
				PnlRegistrarse pnlr = new PnlRegistrarse();
				PnlIniciarSesion pnlis = new PnlIniciarSesion();
				PnlPrincipal pp = new PnlPrincipal();
				PnlAjustes pajustes = new PnlAjustes();
				PnlCalendario pcalendario = new PnlCalendario();
				PnlLogros plogros = new PnlLogros();
				TopRanking trank = new TopRanking();
				Test1 ptest1 = new Test1();
				Test2 ptest2 = new Test2();
				Test3 ptest3 = new Test3();
				Test4 ptest4 = new Test4();
				Test5 ptest5 = new Test5();
				
				VListener listener = new VListener(vpm, pp, pnlr, pnlis, pajustes, pcalendario, plogros, trank, ptest1, ptest2, ptest3, ptest4, ptest5);
				
				pnlr.setListener(listener);
				pnlis.setListener(listener);
				vpm.setListener(listener);
				pp.setListener(listener);
				pajustes.setListener(listener);
				pcalendario.setListener(listener);
				plogros.setListener(listener);
				trank.setListener(listener);
				ptest1.setListener(listener);
				ptest2.setListener(listener);
				ptest3.setListener(listener);
				ptest4.setListener(listener);
				ptest5.setListener(listener);
				
				vpm.setVisible(true);
				
			}
		});
	}
}
 



























