package com.dam.view;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import com.dam.control.VListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class PnlLogros extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final String ACT_CMN_BTN_VOLVER = " ";
    private static final int ANCHO = 630;
    private static final int ALTO = 450;
    private JTextField txtJPerfectos;
    private JTextField txtJEpicos;
    private JTextField txtJMagicos;
    private JButton btnVolver;

    public PnlLogros() {
        setTitle("Logros");
        setSize(ANCHO, ALTO);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Centrar la ventana
        setResizable(false);  // Deshabilitar el cambio de tamaño de la ventana

        getContentPane().setBackground(new Color(84, 90, 246));
        getContentPane().setLayout(null);
        
        crearComponentes();
    }

    private void crearComponentes() {
        JLabel lblLogros = new JLabel("Logros");
        lblLogros.setFont(new Font("Sitka Small", Font.BOLD, 24));
        lblLogros.setBounds(267, 91, 95, 49);
        getContentPane().add(lblLogros);

        JLabel lblJPerfectos = new JLabel("Juegos perfectos");
        lblJPerfectos.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblJPerfectos.setBounds(81, 290, 136, 35);
        getContentPane().add(lblJPerfectos);

        txtJPerfectos = new JTextField();
        txtJPerfectos.setEditable(false);
        txtJPerfectos.setBounds(100, 217, 96, 19);
        txtJPerfectos.setColumns(10);
        getContentPane().add(txtJPerfectos);

        JLabel lblJEpicos = new JLabel("Juegos épicos");
        lblJEpicos.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblJEpicos.setBounds(251, 290, 136, 35);
        getContentPane().add(lblJEpicos);

        txtJEpicos = new JTextField();
        txtJEpicos.setEditable(false);
        txtJEpicos.setBounds(266, 217, 96, 19);
        txtJEpicos.setColumns(10);
        getContentPane().add(txtJEpicos);

        JLabel lblJMagicos = new JLabel("Juegos mágicos");
        lblJMagicos.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblJMagicos.setBounds(429, 290, 136, 35);
        getContentPane().add(lblJMagicos);

        txtJMagicos = new JTextField();
        txtJMagicos.setEditable(false);
        txtJMagicos.setBounds(445, 217, 96, 19);
        txtJMagicos.setColumns(10);
        getContentPane().add(txtJMagicos);

        btnVolver = new JButton(ACT_CMN_BTN_VOLVER);
        btnVolver.setIcon(new ImageIcon(PnlLogros.class.getResource("/img/imgVolver.jpg")));
        btnVolver.setBounds(538, 11, 87, 83);
        getContentPane().add(btnVolver);
    }

    public void hacerVisible() {
        setVisible(true);
    }

    public void setListener(VListener listener) {
        btnVolver.addActionListener(listener);
    }
}
