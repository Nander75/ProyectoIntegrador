package com.dam.view;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;

import com.dam.control.VListener;

import javax.swing.JButton;

public class Test1 extends JFrame {
	
	private static final int ANCHO = 1000;
	private static final int ALTO = 500;
	private JRadioButton opc1;
	private JRadioButton opc1_1;
	private JRadioButton opc1_2;
	private JRadioButton opc2;
	private JRadioButton opc2_1;
	private JRadioButton opc2_2;
	private JRadioButton opc3;
	private JRadioButton opc3_1;
	private JRadioButton opc3_2;
	private JRadioButton opc4;
	private JRadioButton opc4_1;
	private JRadioButton opc4_2;
	private JRadioButton opc5;
	private JRadioButton opc5_1;
	private JRadioButton opc5_2;
	private JRadioButton opc6;
	private JRadioButton opc6_1;
	private JRadioButton opc7;
	private JRadioButton opc7_1;
	private JRadioButton opc8;
	private JRadioButton opc8_1;
	private JRadioButton opc9;
	private JRadioButton opc9_1;
	private JRadioButton opc10;
	private JRadioButton opc10_1;
	private JButton btnFinalizar;
	
	public Test1() {
		setSize(ANCHO, ALTO);
		
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

	    if (opc5_1.isSelected()) {
	        puntuacion++;
	    }

	    if (opc6.isSelected()) {
	        puntuacion++;
	    }

	    if (opc7.isSelected()) { 
	        puntuacion++; 
	    }

	    if (!opc8.isSelected()) { 
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
		setLayout(null);
		
		JLabel lblTest1 = new JLabel("TEST 1");
		lblTest1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTest1.setBounds(27, 30, 128, 32);
		add(lblTest1);
		
		// Pregunta 1
		JLabel lblPregunta1 = new JLabel("1. \u00BFQu\u00E9 tipo de datos se usa para almacenar un n\u00FAmero entero?");
		lblPregunta1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPregunta1.setBounds(27, 85, 411, 14);
		add(lblPregunta1);
		
		opc1 = new JRadioButton("float");
		opc1.setBackground(new Color(84, 90, 246));
		opc1.setBounds(44, 106, 65, 23);
		add(opc1);
		
		opc1_1 = new JRadioButton("int");
		opc1_1.setBackground(new Color(84, 90, 246));
		opc1_1.setBounds(124, 106, 65, 23);
		add(opc1_1);
		
		opc1_2 = new JRadioButton("String");
		opc1_2.setBackground(new Color(84, 90, 246));
		opc1_2.setBounds(204, 106, 65, 23);
		add(opc1_2);
		
		// Pregunta 2
		JLabel lblPregunta2 = new JLabel("2. �Cu�l es el m�todo principal en una aplicaci�n Java?");
		lblPregunta2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPregunta2.setBounds(27, 154, 400, 14);
		add(lblPregunta2);
		
		opc2 = new JRadioButton("main");
		opc2.setBackground(new Color(84, 90, 246));
		opc2.setBounds(44, 175, 65, 23);
		add(opc2);
		
		opc2_1 = new JRadioButton("start");
		opc2_1.setBackground(new Color(84, 90, 246));
		opc2_1.setBounds(124, 175, 65, 23);
		add(opc2_1);
		
		opc2_2 = new JRadioButton("execute");
		opc2_2.setBackground(new Color(84, 90, 246));
		opc2_2.setBounds(204, 175, 85, 23);
		add(opc2_2);
		
		// Pregunta 3
		JLabel lblPregunta3 = new JLabel("3. �C�mo se declara una variable de texto en Java?");
		lblPregunta3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPregunta3.setBounds(27, 215, 400, 14);
		add(lblPregunta3);
		
		opc3 = new JRadioButton("text palabra = \"Hola\";");
		opc3.setBackground(new Color(84, 90, 246));
		opc3.setBounds(44, 246, 150, 23);
		add(opc3);
		
		opc3_1 = new JRadioButton("String palabra = \"Hola\";");
		opc3_1.setBackground(new Color(84, 90, 246));
		opc3_1.setBounds(200, 246, 160, 23);
		add(opc3_1);
		
		opc3_2 = new JRadioButton("str palabra = \"Hola\";");
		opc3_2.setBackground(new Color(84, 90, 246));
		opc3_2.setBounds(370, 246, 130, 23);
		add(opc3_2);
		
		// Pregunta 4
		JLabel lblPregunta4 = new JLabel("4. �Qu� palabra clave se usa para crear un objeto en Java?");
		lblPregunta4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPregunta4.setBounds(27, 286, 400, 14);
		add(lblPregunta4);
		
		opc4 = new JRadioButton("create");
		opc4.setBackground(new Color(84, 90, 246));
		opc4.setBounds(44, 307, 75, 23);
		add(opc4);
		
		opc4_1 = new JRadioButton("new");
		opc4_1.setBackground(new Color(84, 90, 246));
		opc4_1.setBounds(124, 307, 65, 23);
		add(opc4_1);
		
		opc4_2 = new JRadioButton("object");
		opc4_2.setBackground(new Color(84, 90, 246));
		opc4_2.setBounds(204, 307, 75, 23);
		add(opc4_2);
		
		// Pregunta 5
		JLabel lblPregunta5 = new JLabel("5. �Cu�l es el operador de asignaci�n en Java?");
		lblPregunta5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPregunta5.setBounds(27, 347, 400, 14);
		add(lblPregunta5);
		
		opc5 = new JRadioButton("==");
		opc5.setBackground(new Color(84, 90, 246));
		opc5.setBounds(44, 368, 45, 23);
		add(opc5);
		
		opc5_1 = new JRadioButton("=");
		opc5_1.setBackground(new Color(84, 90, 246));
		opc5_1.setBounds(94, 368, 35, 23);
		add(opc5_1);
		
		opc5_2 = new JRadioButton(":=");
		opc5_2.setBackground(new Color(84, 90, 246));
		opc5_2.setBounds(144, 368, 45, 23);
		add(opc5_2);

		// Pregunta 6
		JLabel lblPregunta6 = new JLabel("6. En Java, las variables locales deben ser inicializadas antes de ser usadas.");
		lblPregunta6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPregunta6.setBounds(532, 85, 468, 14);
		add(lblPregunta6);
		
		opc6 = new JRadioButton("Verdadero");
		opc6.setBackground(new Color(84, 90, 246));
		opc6.setBounds(549, 106, 100, 23);
		add(opc6);
		
		opc6_1 = new JRadioButton("Falso");
		opc6_1.setBackground(new Color(84, 90, 246));
		opc6_1.setBounds(655, 106, 70, 23);
		add(opc6_1);

		// Pregunta 7
		JLabel lblPregunta7 = new JLabel("7. El operador '==' se usa para comparar valores en Java.");
		lblPregunta7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPregunta7.setBounds(532, 154, 400, 14);
		add(lblPregunta7);
		
		opc7 = new JRadioButton("Verdadero");
		opc7.setBackground(new Color(84, 90, 246));
		opc7.setBounds(549, 175, 100, 23);
		add(opc7);
		
		opc7_1 = new JRadioButton("Falso");
		opc7_1.setBackground(new Color(84, 90, 246));
		opc7_1.setBounds(655, 175, 70, 23);
		add(opc7_1);

		// Pregunta 8
		JLabel lblPregunta8 = new JLabel("8. Los nombres de las clases en Java comienzan con una letra min\u00FAscula.");
		lblPregunta8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPregunta8.setBounds(532, 225, 468, 14);
		add(lblPregunta8);
		
		opc8 = new JRadioButton("Verdadero");
		opc8.setBackground(new Color(84, 90, 246));
		opc8.setBounds(549, 246, 85, 23);
		add(opc8);
		
		opc8_1 = new JRadioButton("Falso");
		opc8_1.setBackground(new Color(84, 90, 246));
		opc8_1.setBounds(655, 246, 57, 23);
		add(opc8_1);

		// Pregunta 9
		JLabel lblPregunta9 = new JLabel("9. En Java, System.out.println se usa para imprimir texto en la consola.");
		lblPregunta9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPregunta9.setBounds(532, 286, 468, 14);
		add(lblPregunta9);
		
		opc9 = new JRadioButton("Verdadero");
		opc9.setBackground(new Color(84, 90, 246));
		opc9.setBounds(549, 307, 100, 23);
		add(opc9);
		
		opc9_1 = new JRadioButton("Falso");
		opc9_1.setBackground(new Color(84, 90, 246));
		opc9_1.setBounds(655, 307, 70, 23);
		add(opc9_1);
		
		// Pregunta 10
		JLabel lblPregunta10 = new JLabel("10. El m�todo main debe ser declarado como public static void en Java.");
		lblPregunta10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPregunta10.setBounds(532, 347, 458, 14);
		add(lblPregunta10);
		
		opc10 = new JRadioButton("Verdadero");
		opc10.setBackground(new Color(84, 90, 246));
		opc10.setBounds(549, 368, 100, 23);
		add(opc10);
		
		opc10_1 = new JRadioButton("Falso");
		opc10_1.setBackground(new Color(84, 90, 246));
		opc10_1.setBounds(655, 368, 70, 23);
		add(opc10_1);
		
		btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnFinalizar.setBounds(411, 426, 89, 23);
		add(btnFinalizar);
	}
	
}
