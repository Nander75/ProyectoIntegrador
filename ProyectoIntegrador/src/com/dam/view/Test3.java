package com.dam.view;

import javax.swing.JFrame;

import com.dam.control.VListener;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Test3 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public static final String ACT_CMN_BTN_FINALIZAR = "Finalizar";
	private static final int ANCHO = 1000;
    private static final int ALTO = 700;
    private JCheckBox opc1;
    private JCheckBox opc1_1;
    private JCheckBox opc1_2;
    private JCheckBox opc2;
    private JCheckBox opc2_1;
    private JCheckBox opc2_2;
    private JCheckBox opc3;
    private JCheckBox opc3_1;
    private JCheckBox opc3_2;
    private JCheckBox opc4;
    private JCheckBox opc4_1;
    private JCheckBox opc4_2;
    private JCheckBox opc5;
    private JCheckBox opc5_1;
    private JCheckBox opc5_2;
    private JCheckBox opc6;
    private JCheckBox opc6_1;
    private JCheckBox opc7;
    private JCheckBox opc7_1;
    private JCheckBox opc8;
    private JCheckBox opc8_1;
    private JCheckBox opc9;
    private JCheckBox opc9_1;
    private JCheckBox opc10;
    private JCheckBox opc10_1;
    private JButton btnFinalizar;
    
    public Test3() {
    	getContentPane().setBackground(new Color(84, 90, 246));
        setSize(ANCHO, ALTO);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Centrar la ventana
        setResizable(false);
        colocarComponentes();
    }

    public void hacerVisible() {
        setVisible(true);
    }

    public void setListener (VListener listener) {
		btnFinalizar.addActionListener(listener);
	}
    
    public void porDefecto() {
        opc1.setSelected(false);
        opc1_1.setSelected(false);
        opc1_2.setSelected(false);
        opc2.setSelected(false);
        opc2_1.setSelected(false);
        opc2_2.setSelected(false);
        opc3.setSelected(false);
        opc3_1.setSelected(false);
        opc3_2.setSelected(false);
        opc4.setSelected(false);
        opc4_1.setSelected(false);
        opc4_2.setSelected(false);
        opc5.setSelected(false);
        opc5_1.setSelected(false);
        opc5_2.setSelected(false);
        opc6.setSelected(false);
        opc6_1.setSelected(false);
        opc7.setSelected(false);
        opc7_1.setSelected(false);
        opc8.setSelected(false);
        opc8_1.setSelected(false);
        opc9.setSelected(false);
        opc9_1.setSelected(false);
        opc10.setSelected(false);
        opc10_1.setSelected(false);
    }

    public int puntuacionTest() {
        int puntuacion = 0;

        // Respuestas correctas para el Test 3
        if (opc1.isSelected()) {
            puntuacion++;
        }

        if (opc2_1.isSelected()) {
            puntuacion++;
        }

        if (opc3_2.isSelected()) {
            puntuacion++;
        }

        if (opc4.isSelected()) { 
            puntuacion++;
        }

        if (opc5.isSelected()) {
            puntuacion++;
        }

        if (opc6.isSelected()) {
            puntuacion++;
        }

        if (opc7.isSelected()) { 
            puntuacion++; 
        }

        if (opc8_1.isSelected()) { 
            puntuacion++;
        }

        if (opc9.isSelected()) {
            puntuacion++;
        }

        if (opc10.isSelected()) {
            puntuacion++;
        }

        return puntuacion;
    }


    private void colocarComponentes() {
        setBackground(new Color(84, 90, 246));
        getContentPane().setLayout(null);

        JLabel lblTest3 = new JLabel("TEST 3");
        lblTest3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTest3.setBounds(27, 30, 128, 32);
        getContentPane().add(lblTest3);

        // Pregunta 1
        JLabel lblPregunta1 = new JLabel("1. ¿Qué es la encapsulación en Java?");
        lblPregunta1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta1.setBounds(27, 85, 411, 14);
        getContentPane().add(lblPregunta1);

        opc1 = new JCheckBox("Una técnica para ocultar los datos y métodos de una clase.");
        opc1.setBackground(new Color(84, 90, 246));
        opc1.setBounds(44, 106, 500, 23);
        getContentPane().add(opc1);

        opc1_1 = new JCheckBox("Un tipo de bucle utilizado para iterar sobre una colección de elementos.");
        opc1_1.setBackground(new Color(84, 90, 246));
        opc1_1.setBounds(44, 136, 453, 23);
        getContentPane().add(opc1_1);

        opc1_2 = new JCheckBox("Una instrucción para lanzar una excepción.");
        opc1_2.setBackground(new Color(84, 90, 246));
        opc1_2.setBounds(37, 175, 460, 23);
        getContentPane().add(opc1_2);

        // Pregunta 2
        JLabel lblPregunta2 = new JLabel("2. ¿Cuál es el resultado de '10 / 3' en Java?");
        lblPregunta2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta2.setBounds(27, 215, 400, 14);
        getContentPane().add(lblPregunta2);

        opc2 = new JCheckBox("3.333");
        opc2.setBackground(new Color(84, 90, 246));
        opc2.setBounds(44, 236, 65, 23);
        getContentPane().add(opc2);

        opc2_1 = new JCheckBox("3");
        opc2_1.setBackground(new Color(84, 90, 246));
        opc2_1.setBounds(124, 236, 45, 23);
        getContentPane().add(opc2_1);

        opc2_2 = new JCheckBox("4");
        opc2_2.setBackground(new Color(84, 90, 246));
        opc2_2.setBounds(204, 236, 45, 23);
        getContentPane().add(opc2_2);

        // Pregunta 3
        JLabel lblPregunta3 = new JLabel("3. ¿Qué es un 'interface' en Java?");
        lblPregunta3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta3.setBounds(27, 275, 400, 14);
        getContentPane().add(lblPregunta3);

        opc3 = new JCheckBox("Una clase que no se puede instanciar.");
        opc3.setBackground(new Color(84, 90, 246));
        opc3.setBounds(44, 296, 437, 23);
        getContentPane().add(opc3);

        opc3_1 = new JCheckBox("Un tipo de método estético.");
        opc3_1.setBackground(new Color(84, 90, 246));
        opc3_1.setBounds(44, 326, 500, 23);
        getContentPane().add(opc3_1);

        opc3_2 = new JCheckBox("Un contrato que define un conjunto de métodos que una clase debe implementar.");
        opc3_2.setBackground(new Color(84, 90, 246));
        opc3_2.setBounds(44, 356, 500, 23);
        getContentPane().add(opc3_2);

        // Pregunta 4
        JLabel lblPregunta4 = new JLabel("4. ¿Qué es la herencia en Java?");
        lblPregunta4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta4.setBounds(27, 405, 400, 14);
        getContentPane().add(lblPregunta4);

        opc4 = new JCheckBox("Una forma de crear nuevas clases a partir de clases existentes.");
        opc4.setBackground(new Color(84, 90, 246));
        opc4.setBounds(44, 426, 500, 23);
        getContentPane().add(opc4);

        opc4_1 = new JCheckBox("Un mecanismo para cambiar el comportamiento de los métodos.");
        opc4_1.setBackground(new Color(84, 90, 246));
        opc4_1.setBounds(44, 456, 500, 23);
        getContentPane().add(opc4_1);

        opc4_2 = new JCheckBox("Una manera de manejar mñultiples hilos de ejecuci�n.");
        opc4_2.setBackground(new Color(84, 90, 246));
        opc4_2.setBounds(44, 486, 460, 23);
        getContentPane().add(opc4_2);

        // Pregunta 5
        JLabel lblPregunta5 = new JLabel("5. ¿Cuál es el resultado de '15 % 4' en Java?");
        lblPregunta5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta5.setBounds(532, 85, 400, 14);
        getContentPane().add(lblPregunta5);

        opc5 = new JCheckBox("3");
        opc5.setBackground(new Color(84, 90, 246));
        opc5.setBounds(549, 106, 45, 23);
        getContentPane().add(opc5);

        opc5_1 = new JCheckBox("1");
        opc5_1.setBackground(new Color(84, 90, 246));
        opc5_1.setBounds(655, 106, 35, 23);
        getContentPane().add(opc5_1);

        opc5_2 = new JCheckBox("4");
        opc5_2.setBackground(new Color(84, 90, 246));
        opc5_2.setBounds(755, 106, 35, 23);
        getContentPane().add(opc5_2);

        // Pregunta 6
        JLabel lblPregunta6 = new JLabel("6. ¿Qué palabra clave se utiliza para crear una instancia de una clase en Java?");
        lblPregunta6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta6.setBounds(532, 154, 468, 14);
        getContentPane().add(lblPregunta6);

        opc6 = new JCheckBox("new");
        opc6.setBackground(new Color(84, 90, 246));
        opc6.setBounds(549, 175, 65, 23);
        getContentPane().add(opc6);

        opc6_1 = new JCheckBox("instance");
        opc6_1.setBackground(new Color(84, 90, 246));
        opc6_1.setBounds(655, 175, 70, 23);
        getContentPane().add(opc6_1);

        // Pregunta 7
        JLabel lblPregunta7 = new JLabel("7. ¿Qué hace el operador '!=' en Java?");
        lblPregunta7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta7.setBounds(532, 215, 400, 14);
        getContentPane().add(lblPregunta7);

        opc7 = new JCheckBox("Compara dos valores para ver si son diferentes.");
        opc7.setBackground(new Color(84, 90, 246));
        opc7.setBounds(549, 236, 250, 23);
        getContentPane().add(opc7);

        opc7_1 = new JCheckBox("Compara dos valores para ver si son iguales.");
        opc7_1.setBackground(new Color(84, 90, 246));
        opc7_1.setBounds(549, 266, 250, 23);
        getContentPane().add(opc7_1);

        // Pregunta 8
        JLabel lblPregunta8 = new JLabel("8. ¿Cuál es el valor por defecto de un atributo booleano en una clase en Java?");
        lblPregunta8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta8.setBounds(532, 305, 468, 14);
        getContentPane().add(lblPregunta8);

        opc8 = new JCheckBox("true");
        opc8.setBackground(new Color(84, 90, 246));
        opc8.setBounds(549, 326, 150, 23);
        getContentPane().add(opc8);

        opc8_1 = new JCheckBox("false");
        opc8_1.setBackground(new Color(84, 90, 246));
        opc8_1.setBounds(549, 356, 150, 23);
        getContentPane().add(opc8_1);

        // Pregunta 9
        JLabel lblPregunta9 = new JLabel("9. ¿Cuál de las siguientes declaraciones es correcta para una variable en Java?");
        lblPregunta9.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta9.setBounds(532, 405, 468, 14);
        getContentPane().add(lblPregunta9);

        opc9 = new JCheckBox("int numero;");
        opc9.setBackground(new Color(84, 90, 246));
        opc9.setBounds(549, 426, 200, 23);
        getContentPane().add(opc9);

        opc9_1 = new JCheckBox("Scanner numero = new Scanner(System.in);");
        opc9_1.setBackground(new Color(84, 90, 246));
        opc9_1.setBounds(549, 456, 300, 23);
        getContentPane().add(opc9_1);

        // Pregunta 10
        JLabel lblPregunta10 = new JLabel("10. ¿Qué es un 'ArrayList' en Java?");
        lblPregunta10.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta10.setBounds(532, 495, 400, 14);
        getContentPane().add(lblPregunta10);

        opc10 = new JCheckBox("Una colecci�n que puede cambiar de tama�o din�micamente.");
        opc10.setBackground(new Color(84, 90, 246));
        opc10.setBounds(549, 516, 400, 23);
        getContentPane().add(opc10);

        opc10_1 = new JCheckBox("Una estructura de datos fija que almacena elementos del mismo tipo.");
        opc10_1.setBackground(new Color(84, 90, 246));
        opc10_1.setBounds(549, 546, 400, 23);
        getContentPane().add(opc10_1);

        // Bot�n Finalizar
        btnFinalizar = new JButton(ACT_CMN_BTN_FINALIZAR);
        btnFinalizar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnFinalizar.setBounds(431, 591, 90, 30);
        getContentPane().add(btnFinalizar);
    }

    
}
