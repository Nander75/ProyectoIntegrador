package com.dam.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import com.dam.control.VListener;
import com.dam.model.DatosUsuarioPI;
import javax.swing.JTextField;

public class PnlIniciarSesion extends JFrame {

    
	private static final long serialVersionUID = 1L;
	public static final String ACT_CMN_BTN_CONTRASENAOLVIDADA = "Contraseña Olvidada";
    public static final String ACT_CMN_BTN_SIGUIENTE = "Siguiente";
    public static final String ACT_CMN_BTN_REGISTRAR = "Registrarse";
    
    private static final int ANCHO = 630;
    private static final int ALTO = 650;
    
    private JTextField txtIniciarSesion;
    private JTextField txtNomUsuario;
    private JTextField txtContrasena;
    private JButton btnSiguiente;
    private JButton btnRegistrarse;
    
    public PnlIniciarSesion() {
        setTitle("Iniciar Sesión");
        setSize(ANCHO, ALTO);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Centrar la ventana
        setResizable(false);  // Deshabilitar el cambio de tamaño de la ventana

        crearComponentes();
    }

    private void crearComponentes() {
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(84, 90, 246));
        
        txtIniciarSesion = new JTextField();
        txtIniciarSesion.setFont(new Font("Sylfaen", Font.BOLD, 24));
        txtIniciarSesion.setBackground(new Color(138, 138, 255));
        txtIniciarSesion.setText("        Iniciar Sesión");
        txtIniciarSesion.setEditable(false);
        txtIniciarSesion.setBounds(190, 70, 250, 67);
        getContentPane().add(txtIniciarSesion);
        txtIniciarSesion.setColumns(10);
        
        txtNomUsuario = new JTextField();
        txtNomUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtNomUsuario.setText("Introduce tu nombre de usuario o correo electrónico");
        txtNomUsuario.setBounds(120, 230, 400, 40);
        getContentPane().add(txtNomUsuario);
        txtNomUsuario.setColumns(10);
        
        txtContrasena = new JTextField();
        txtContrasena.setText("Introduce tu contraseña");
        txtContrasena.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtContrasena.setBounds(141, 310, 350, 40);
        getContentPane().add(txtContrasena);
        txtContrasena.setColumns(10);
        
        btnSiguiente = new JButton(ACT_CMN_BTN_SIGUIENTE);
        btnSiguiente.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        btnSiguiente.setBackground(new Color(255, 255, 255));
        btnSiguiente.setBounds(215, 466, 199, 36);
        getContentPane().add(btnSiguiente);
        
        btnRegistrarse = new JButton(ACT_CMN_BTN_REGISTRAR);
        btnRegistrarse.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        btnRegistrarse.setBackground(new Color(255, 255, 255));
        btnRegistrarse.setBounds(254, 538, 129, 36);
        getContentPane().add(btnRegistrarse);
    }
    
    public void hacerVisible() {
        setVisible(true);
    }
    
    public void setListener(VListener listener) {
        btnRegistrarse.addActionListener(listener);
        btnSiguiente.addActionListener(listener);
    }
    
    public DatosUsuarioPI getDatosUsuario() {
        DatosUsuarioPI du = null;
        
        String user = txtNomUsuario.getText().trim();
        String pwd = txtContrasena.getText().trim();
        
        if (user.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre de usuario es un dato obligatorio", 
                    "Error de datos", JOptionPane.ERROR_MESSAGE);
        } else if (pwd.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La contraseña es un dato obligatorio", 
                    "Error de datos", JOptionPane.ERROR_MESSAGE);
        } else if (pwd.length() < 8) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 8 caracteres", 
                    "Error de datos", JOptionPane.ERROR_MESSAGE);
        } else {
            du = new DatosUsuarioPI(user, pwd);
        }
        
        return du;
    }

    public void setUsuario(String usuario) {
        txtNomUsuario.setText(usuario);
        txtContrasena.setText("");
    }
}
