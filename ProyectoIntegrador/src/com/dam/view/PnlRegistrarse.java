package com.dam.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import com.dam.control.VListener;
import com.dam.model.DatosUsuarioPI;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PnlRegistrarse extends JFrame {

    public static final String ACT_CMN_BTN_SIGUIENTE = "Siguiente";
	public static final String ACT_CMN_BTN_INICIARSESION = "Iniciar Sesion";

    private static final int ANCHO = 630;
    private static final int ALTO = 650;

    private JTextField txtRegistrarse;
    private JTextField txtNombre;
    private JTextField txtContrasenia;
    private JButton btnSiguiente;
    private JButton btnIniciarSesion;
    private JTextField txtUsuario;
    private JTextField txtComprContrasenia;
    private JTextField txtCorreo;

    public PnlRegistrarse() {
        setTitle("Registrarse");
        setSize(ANCHO, ALTO);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(84, 90, 246));

        crearComponentes();
    }

    private void crearComponentes() {
        txtRegistrarse = new JTextField();
        txtRegistrarse.setFont(new Font("Sylfaen", Font.BOLD, 24));
        txtRegistrarse.setBackground(new Color(138, 138, 255));
        txtRegistrarse.setText("          Registrarse");
        txtRegistrarse.setEditable(false);
        txtRegistrarse.setBounds(190, 34, 250, 51);
        getContentPane().add(txtRegistrarse);
        txtRegistrarse.setColumns(10);

        txtNombre = new JTextField();
        txtNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtNombre.setBounds(260, 122, 330, 40);
        getContentPane().add(txtNombre);
        txtNombre.setColumns(10);

        txtContrasenia = new JTextField();
        txtContrasenia.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtContrasenia.setBounds(260, 332, 330, 40);
        getContentPane().add(txtContrasenia);
        txtContrasenia.setColumns(10);

        btnSiguiente = new JButton(ACT_CMN_BTN_SIGUIENTE);
        btnSiguiente.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        btnSiguiente.setBackground(new Color(255, 255, 255));
        btnSiguiente.setBounds(215, 469, 199, 36);
        getContentPane().add(btnSiguiente);

        btnIniciarSesion = new JButton(ACT_CMN_BTN_INICIARSESION);
        btnIniciarSesion.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        btnIniciarSesion.setBackground(new Color(255, 255, 255));
        btnIniciarSesion.setBounds(242, 539, 147, 36);
        getContentPane().add(btnIniciarSesion);

        txtUsuario = new JTextField();
        txtUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtUsuario.setColumns(10);
        txtUsuario.setBounds(259, 192, 330, 40);
        getContentPane().add(txtUsuario);

        txtComprContrasenia = new JTextField();
        txtComprContrasenia.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtComprContrasenia.setColumns(10);
        txtComprContrasenia.setBounds(260, 402, 330, 40);
        getContentPane().add(txtComprContrasenia);

        txtCorreo = new JTextField();
        txtCorreo.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtCorreo.setColumns(10);
        txtCorreo.setBounds(260, 262, 330, 40);
        getContentPane().add(txtCorreo);
        
        JLabel lblNombre = new JLabel("Introduce tu nombre");
        lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNombre.setBounds(26, 124, 184, 36);
        getContentPane().add(lblNombre);
        
        JLabel lblNUsuario = new JLabel("Introduce tu nombre de usuario");
        lblNUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNUsuario.setBounds(26, 194, 184, 36);
        getContentPane().add(lblNUsuario);
        
        JLabel lblCorreo = new JLabel("Introduce tu correo electronico");
        lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCorreo.setBounds(26, 264, 223, 36);
        getContentPane().add(lblCorreo);
        
        JLabel lblPassw = new JLabel("Introduce tu contraseña");
        lblPassw.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPassw.setBounds(26, 334, 184, 36);
        getContentPane().add(lblPassw);
        
        JLabel lblCPassw = new JLabel("Vuelve a introducir la contraseña");
        lblCPassw.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCPassw.setBounds(26, 404, 184, 36);
        getContentPane().add(lblCPassw);
    }

    public void hacerVisible() {
        setVisible(true);
    }

    public void setListener(VListener listener) {
        btnIniciarSesion.addActionListener(listener);
        btnSiguiente.addActionListener(listener);
    }

    public DatosUsuarioPI getDatosUsuario() {
        DatosUsuarioPI du = null;

        String nom = txtNombre.getText().trim();
        String correo = txtCorreo.getText().trim();
        String user = txtUsuario.getText().trim();
        String pwd = txtContrasenia.getText().trim();
        String pwdConfirm = txtComprContrasenia.getText().trim();

        if (nom.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre es un dato obligatorio", 
                    "Error de datos", JOptionPane.ERROR_MESSAGE);
        } else if (correo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El email es un dato obligatorio", 
                    "Error de datos", JOptionPane.ERROR_MESSAGE);
        } else if (user.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre de usuario es un dato obligatorio", 
                    "Error de datos", JOptionPane.ERROR_MESSAGE);
        } else if (pwd.isEmpty() || pwdConfirm.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La contraseña es un dato obligatorio", 
                    "Error de datos", JOptionPane.ERROR_MESSAGE);
        } else if (pwd.length() < 8) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener al menos 8 caracteres", 
                    "Error de datos", JOptionPane.ERROR_MESSAGE);
        } else if (!pwd.equals(pwdConfirm)) {
            JOptionPane.showMessageDialog(this, "La contraseña y la confirmación no coinciden", 
                    "Error de datos", JOptionPane.ERROR_MESSAGE);
        } else {
            du = new DatosUsuarioPI(user, pwd);
        }

        return du;
    }
    
    public void limpiarDatos() {
    	txtNombre.setText("");
    	txtUsuario.setText("");
    	txtCorreo.setText("");
    	txtContrasenia.setText("");
    	txtComprContrasenia.setText("");
    }
}
