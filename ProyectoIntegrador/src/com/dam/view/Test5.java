package com.dam.view;

import javax.swing.JFrame;

import com.dam.control.VListener;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Test5 extends JFrame {

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
    
    public Test5() {
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

        // Respuestas correctas para el Test 5
        if (opc1_1.isSelected()) {
            puntuacion++;
        }

        if (opc2.isSelected()) {
            puntuacion++;
        }

        if (opc3_1.isSelected()) {
            puntuacion++;
        }

        if (opc4_1.isSelected()) { 
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

        if (opc8.isSelected()) { 
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

        JLabel lblTest5 = new JLabel("TEST 5");
        lblTest5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTest5.setBounds(428, 32, 128, 32);
        getContentPane().add(lblTest5);

        // Pregunta 1
        JLabel lblPregunta1 = new JLabel("1. ¿Qué es la JVM en Java?");
        lblPregunta1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta1.setBounds(27, 98, 411, 14);
        getContentPane().add(lblPregunta1);

        opc1 = new JCheckBox("Una máquina física que ejecuta c�digo Java.");
        opc1.setBackground(new Color(84, 90, 246));
        opc1.setBounds(37, 120, 380, 23);
        getContentPane().add(opc1);

        opc1_1 = new JCheckBox("Una máquina virtual que ejecuta bytecode Java.");
        opc1_1.setBackground(new Color(84, 90, 246));
        opc1_1.setBounds(37, 150, 380, 23);
        getContentPane().add(opc1_1);

        opc1_2 = new JCheckBox("Un compilador de código Java.");
        opc1_2.setBackground(new Color(84, 90, 246));
        opc1_2.setBounds(37, 180, 380, 23);
        getContentPane().add(opc1_2);

        // Pregunta 2
        JLabel lblPregunta2 = new JLabel("2. ¿Qué es el recolector de basura en Java?");
        lblPregunta2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta2.setBounds(27, 210, 400, 14);
        getContentPane().add(lblPregunta2);

        opc2 = new JCheckBox("Un mecanismo para liberar memoria de objetos no utilizados.");
        opc2.setBackground(new Color(84, 90, 246));
        opc2.setBounds(37, 232, 387, 23);
        getContentPane().add(opc2);

        opc2_1 = new JCheckBox("Un algoritmo para ordenar colecciones.");
        opc2_1.setBackground(new Color(84, 90, 246));
        opc2_1.setBounds(37, 262, 387, 23);
        getContentPane().add(opc2_1);

        opc2_2 = new JCheckBox("Una técnica para gestionar hilos de ejecución.");
        opc2_2.setBackground(new Color(84, 90, 246));
        opc2_2.setBounds(37, 292, 387, 23);
        getContentPane().add(opc2_2);

        // Pregunta 3
        JLabel lblPregunta3 = new JLabel("3. ¿Qué es una excepción checked en Java?");
        lblPregunta3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta3.setBounds(27, 322, 400, 14);
        getContentPane().add(lblPregunta3);

        opc3 = new JCheckBox("Una excepción que ocurre por errores de programación.");
        opc3.setBackground(new Color(84, 90, 246));
        opc3.setBounds(37, 343, 412, 23);
        getContentPane().add(opc3);

        opc3_1 = new JCheckBox("Una excepción que debe ser declarada o manejada en tiempo de compilación.");
        opc3_1.setBackground(new Color(84, 90, 246));
        opc3_1.setBounds(37, 373, 412, 23);
        getContentPane().add(opc3_1);

        opc3_2 = new JCheckBox("Una excepción que ocurre debido a recursos no disponibles.");
        opc3_2.setBackground(new Color(84, 90, 246));
        opc3_2.setBounds(37, 403, 412, 23);
        getContentPane().add(opc3_2);

        // Pregunta 4
        JLabel lblPregunta4 = new JLabel("4. ¿Qué es una lambda en Java?");
        lblPregunta4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta4.setBounds(27, 434, 400, 14);
        getContentPane().add(lblPregunta4);

        opc4 = new JCheckBox("Una clase que no puede ser instanciada.");
        opc4.setBackground(new Color(84, 90, 246));
        opc4.setBounds(27, 455, 468, 23);
        getContentPane().add(opc4);

        opc4_1 = new JCheckBox("Una expresión que proporciona una manera clara y concisa de representar un método.");
        opc4_1.setBackground(new Color(84, 90, 246));
        opc4_1.setBounds(27, 485, 457, 23);
        getContentPane().add(opc4_1);

        opc4_2 = new JCheckBox("Un tipo de bucle para iterar colecciones.");
        opc4_2.setBackground(new Color(84, 90, 246));
        opc4_2.setBounds(37, 511, 343, 23);
        getContentPane().add(opc4_2);

        // Pregunta 5
        JLabel lblPregunta5 = new JLabel("5. ¿Cuál es el valor por defecto de un atributo de tipo double en una clase en Java?");
        lblPregunta5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta5.setBounds(27, 546, 500, 14);
        getContentPane().add(lblPregunta5);

        opc5 = new JCheckBox("0.0");
        opc5.setBackground(new Color(84, 90, 246));
        opc5.setBounds(44, 573, 65, 23);
        getContentPane().add(opc5);

        opc5_1 = new JCheckBox("null");
        opc5_1.setBackground(new Color(84, 90, 246));
        opc5_1.setBounds(44, 603, 65, 23);
        getContentPane().add(opc5_1);

        opc5_2 = new JCheckBox("NaN");
        opc5_2.setBackground(new Color(84, 90, 246));
        opc5_2.setBounds(44, 633, 65, 23);
        getContentPane().add(opc5_2);

        // Pregunta 6
        JLabel lblPregunta6 = new JLabel("6. ¿Qué palabra clave se utiliza para heredar de una clase en Java?");
        lblPregunta6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta6.setBounds(494, 98, 468, 14);
        getContentPane().add(lblPregunta6);

        opc6 = new JCheckBox("extends");
        opc6.setBackground(new Color(84, 90, 246));
        opc6.setBounds(511, 119, 100, 23);
        getContentPane().add(opc6);

        opc6_1 = new JCheckBox("implements");
        opc6_1.setBackground(new Color(84, 90, 246));
        opc6_1.setBounds(617, 119, 100, 23);
        getContentPane().add(opc6_1);

        // Pregunta 7
        JLabel lblPregunta7 = new JLabel("7. ¿Qué es un constructor en Java?");
        lblPregunta7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta7.setBounds(494, 163, 400, 14);
        getContentPane().add(lblPregunta7);

        opc7 = new JCheckBox("Un método especial que se llama cuando se crea un objeto.");
        opc7.setBackground(new Color(84, 90, 246));
        opc7.setBounds(511, 184, 300, 23);
        getContentPane().add(opc7);

        opc7_1 = new JCheckBox("Un método que se utiliza para destruir un objeto.");
        opc7_1.setBackground(new Color(84, 90, 246));
        opc7_1.setBounds(511, 214, 300, 23);
        getContentPane().add(opc7_1);

        // Pregunta 8
        JLabel lblPregunta8 = new JLabel("8. ¿Qué es un método estático en Java?");
        lblPregunta8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta8.setBounds(494, 253, 468, 14);
        getContentPane().add(lblPregunta8);

        opc8 = new JCheckBox("Un método que pertenece a la clase y no a instancias individuales.");
        opc8.setBackground(new Color(84, 90, 246));
        opc8.setBounds(511, 274, 300, 23);
        getContentPane().add(opc8);

        opc8_1 = new JCheckBox("Un método que puede acceder a variables de instancia.");
        opc8_1.setBackground(new Color(84, 90, 246));
        opc8_1.setBounds(511, 304, 300, 23);
        getContentPane().add(opc8_1);

        // Pregunta 9
        JLabel lblPregunta9 = new JLabel("9. ¿Qué es un hilo (thread) en Java?");
        lblPregunta9.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta9.setBounds(494, 343, 468, 14);
        getContentPane().add(lblPregunta9);

        opc9 = new JCheckBox("Una secuencia de ejecución en un programa.");
        opc9.setBackground(new Color(84, 90, 246));
        opc9.setBounds(511, 364, 300, 23);
        getContentPane().add(opc9);

        opc9_1 = new JCheckBox("Un tipo de colección en Java.");
        opc9_1.setBackground(new Color(84, 90, 246));
        opc9_1.setBounds(511, 394, 200, 23);
        getContentPane().add(opc9_1);

        // Pregunta 10
        JLabel lblPregunta10 = new JLabel("10. ¿Qué es una interfaz funcional en Java?");
        lblPregunta10.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta10.setBounds(501, 434, 356, 14);
        getContentPane().add(lblPregunta10);

        opc10 = new JCheckBox("Una interfaz que tiene exactamente un método abstracto.");
        opc10.setBackground(new Color(84, 90, 246));
        opc10.setBounds(518, 453, 339, 23);
        getContentPane().add(opc10);

        opc10_1 = new JCheckBox("Una interfaz que solo tiene métodos estáticos.");
        opc10_1.setBackground(new Color(84, 90, 246));
        opc10_1.setBounds(518, 483, 339, 23);
        getContentPane().add(opc10_1);

        // Bot�n Finalizar
        btnFinalizar = new JButton(ACT_CMN_BTN_FINALIZAR);
        btnFinalizar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnFinalizar.setBounds(617, 577, 90, 30);
        getContentPane().add(btnFinalizar);
    }



    
}
