package com.dam.view;

import com.dam.control.VListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class PnlAjustes extends JFrame {
	
    
	private static final long serialVersionUID = 1L;
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
        setTitle("Ajustes");
        setSize(ANCHO, ALTO);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Centrar la ventana
        setResizable(false);  // Deshabilitar el cambio de tamaño de la ventana

        crearComponentes();
    }

    private void crearComponentes() {
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(84, 90, 246));
		
        btnVolver = new JButton(ACT_CMN_BTN_VOLVER);
        btnVolver.setBackground(new Color(67, 115, 203));
        btnVolver.setIcon(new ImageIcon(PnlAjustes.class.getResource("/img/imgVolver.jpg")));
        btnVolver.setBounds(545, 20, 85, 74);
        getContentPane().add(btnVolver);
		
        btnAjustes = new JButton("");
        btnAjustes.setIcon(new ImageIcon(PnlAjustes.class.getResource("/img/imgAjuste.jpg")));
        btnAjustes.setBounds(218, 20, 178, 166);
        getContentPane().add(btnAjustes);
		
        btnSonido = new JButton("");
        btnSonido.setIcon(new ImageIcon(PnlAjustes.class.getResource("/img/imgSonido.jpg")));
        btnSonido.setBounds(136, 254, 103, 83);
        getContentPane().add(btnSonido);
		
        btnMusica = new JButton("");
        btnMusica.setIcon(new ImageIcon(PnlAjustes.class.getResource("/img/imgMusica.jpg")));
        btnMusica.setBounds(375, 254, 103, 83);
        getContentPane().add(btnMusica);
		
        btnPrivacidad = new JButton(ACT_CMN_BTN_PRIVACIDAD);
        btnPrivacidad.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        btnPrivacidad.setBackground(Color.YELLOW);
        btnPrivacidad.setBounds(114, 528, 135, 27);
        getContentPane().add(btnPrivacidad);
		
        btnTerminos = new JButton(ACT_CMN_BTN_TERMINOS);
        btnTerminos.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        btnTerminos.setBackground(Color.YELLOW);
        btnTerminos.setBounds(363, 528, 135, 27);
        getContentPane().add(btnTerminos);
		
        cmbIdioma = new JComboBox<String>();
        cmbIdioma.setFont(new Font("Tahoma", Font.PLAIN, 16));
        cmbIdioma.setModel(new DefaultComboBoxModel<String>(new String[] {"Español", "English", "German", "French"}));
        cmbIdioma.setBounds(259, 418, 96, 49);
        getContentPane().add(cmbIdioma);
		
        JLabel lblIdiomas = new JLabel("Idioma");
        lblIdiomas.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblIdiomas.setBounds(271, 370, 72, 27);
        getContentPane().add(lblIdiomas);
    }
	
    public void hacerVisible() {
        setVisible(true);
    }
	
    public void setListener(VListener listener) {
        btnAjustes.addActionListener(listener);
        btnTerminos.addActionListener(listener);
        btnPrivacidad.addActionListener(listener);
        btnVolver.addActionListener(listener);
    }
}
