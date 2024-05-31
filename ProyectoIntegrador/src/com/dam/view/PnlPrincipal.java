package com.dam.view;

import com.dam.control.VListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;

public class PnlPrincipal extends JFrame {
    
	
	private static final long serialVersionUID = 1L;
	public static final String ACT_CMN_BTN_AJUSTES = "ajustes";
    public static final String ACT_CMN_BTN_RANKING = "ranking";
    public static final String ACT_CMN_BTN_TEST1 = "Test 1";
    public static final String ACT_CMN_BTN_TEST2 = "Test 2";
    public static final String ACT_CMN_BTN_TEST3 = "Test 3";
	public static final String ACT_CMN_BTN_TEST4 = "Test 4";
	public static final String ACT_CMN_BTN_TEST5 = "Test 5";
    public static final String ACT_CMN_BTN_LOGROS = "logros";
    public static final String ACT_CMN_BTN_CALENDARIO = "calendario";
    
    private static final int ANCHO = 630;
    private static final int ALTO = 650;

    
    private JButton btnImagen;
    private JButton btnAjustes;
    private JButton btnCalendario;
    private JButton btnLogros;
    private JButton btnTest1;
    private JButton btnTest2;
    private JButton btnTest3;
    private JButton btnRanking;
    private JButton btnTest4;
    private JButton btnTest5;
    
    public PnlPrincipal() {
        setTitle("Principal");
        setSize(ANCHO, ALTO);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Centrar la ventana
        setResizable(false);  // Deshabilitar el cambio de tamaño de la ventana

        getContentPane().setBackground(new Color(84, 90, 246));
        getContentPane().setLayout(null);
        
        crearComponentes();
    }

    private void crearComponentes() {
        btnImagen = new JButton("");
        btnImagen.setIcon(new ImageIcon(PnlPrincipal.class.getResource("/img/Enchiridion2.jpg")));
        btnImagen.setBounds(223, 115, 168, 234);
        getContentPane().add(btnImagen);
        
        btnAjustes = new JButton(ACT_CMN_BTN_AJUSTES);
        btnAjustes.setIcon(new ImageIcon(PnlPrincipal.class.getResource("/img/imgAjustes2.jpg")));
        btnAjustes.setBounds(10, 80, 60, 48);
        getContentPane().add(btnAjustes);
        
        btnCalendario = new JButton(ACT_CMN_BTN_CALENDARIO);
        btnCalendario.setIcon(new ImageIcon(PnlPrincipal.class.getResource("/img/calendario3.jpg")));
        btnCalendario.setBounds(584, 84, 42, 41);
        getContentPane().add(btnCalendario);
        
        btnLogros = new JButton(ACT_CMN_BTN_LOGROS);
        btnLogros.setIcon(new ImageIcon(PnlPrincipal.class.getResource("/img/imgLogros.jpg")));
        btnLogros.setBounds(10, 209, 60, 35);
        getContentPane().add(btnLogros);
        
        btnRanking = new JButton(ACT_CMN_BTN_RANKING);
        btnRanking.setIcon(new ImageIcon(PnlPrincipal.class.getResource("/img/ranking2.jpg")));
        btnRanking.setBounds(541, 164, 85, 48);
        getContentPane().add(btnRanking);
        
        btnTest1 = new JButton(ACT_CMN_BTN_TEST1);
        btnTest1.setBounds(78, 442, 110, 21);
        getContentPane().add(btnTest1);
        
        btnTest2 = new JButton(ACT_CMN_BTN_TEST2);
        btnTest2.setBounds(266, 442, 95, 21);
        getContentPane().add(btnTest2);
        
        btnTest3 = new JButton(ACT_CMN_BTN_TEST3);
        btnTest3.setBounds(439, 442, 95, 21);
        getContentPane().add(btnTest3);
        
        btnTest4 = new JButton(ACT_CMN_BTN_TEST4);
        btnTest4.setBounds(131, 515, 110, 21);
        getContentPane().add(btnTest4);
        
        btnTest5 = new JButton(ACT_CMN_BTN_TEST5);
        btnTest5.setBounds(372, 514, 110, 21);
        getContentPane().add(btnTest5);
        
        JLabel lblNewLabel = new JLabel("AMApp");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
        lblNewLabel.setBounds(252, 36, 110, 56);
        getContentPane().add(lblNewLabel);
    }
    
    public void hacerVisible() {
        setVisible(true);
    }
    
    public void setListener(VListener listener) {
        btnAjustes.addActionListener(listener);
        btnCalendario.addActionListener(listener);
        btnLogros.addActionListener(listener);
        btnRanking.addActionListener(listener);
        btnTest1.addActionListener(listener);
        btnTest2.addActionListener(listener);
        btnTest3.addActionListener(listener);
        btnTest4.addActionListener(listener);
        btnTest5.addActionListener(listener);
    }


	public JButton getBtnImagen() {
		return btnImagen;
	}

	public JButton getBtnAjustes() {
		return btnAjustes;
	}

	public JButton getBtnCalendario() {
		return btnCalendario;
	}

	public JButton getBtnLogros() {
		return btnLogros;
	}

	public JButton getBtnLenguaje1() {
		return btnTest1;
	}

	public JButton getBtnLenguaje2() {
		return btnTest2;
	}

	public JButton getBtnLenguaje3() {
		return btnTest3;
	}

	public JButton getBtnRanking() {
		return btnRanking;
	}
}
