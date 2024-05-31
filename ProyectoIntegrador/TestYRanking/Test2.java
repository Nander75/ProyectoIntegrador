package com.dam.view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Test2 extends JPanel {
    
    private static final int ANCHO = 1000;
    private static final int ALTO = 500;
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
    
    public Test2() {
        setSize(ANCHO, ALTO);
        colocarComponentes();
    }

    public void hacerVisible() {
        setVisible(true);
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
        
        JLabel lblTest2 = new JLabel("TEST 2");
        lblTest2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTest2.setBounds(27, 30, 128, 32);
        add(lblTest2);
        
        // Pregunta 1
        JLabel lblPregunta1 = new JLabel("1. ¿Qué es un bucle 'for' en Java?");
        lblPregunta1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta1.setBounds(27, 85, 411, 14);
        add(lblPregunta1);
        
        opc1 = new JCheckBox("Una estructura de control que repite un bloque de código un número fijo de veces.");
        opc1.setBackground(new Color(84, 90, 246));
        opc1.setBounds(44, 106, 500, 23);
        add(opc1);
        
        opc1_1 = new JCheckBox("Una instrucción que solo se ejecuta si se cumple una condición.");
        opc1_1.setBackground(new Color(84, 90, 246));
        opc1_1.setBounds(44, 136, 500, 23);
        add(opc1_1);
        
        opc1_2 = new JCheckBox("Un tipo de dato utilizado para almacenar valores enteros.");
        opc1_2.setBackground(new Color(84, 90, 246));
        opc1_2.setBounds(44, 166, 500, 23);
        add(opc1_2);
        
        // Pregunta 2
        JLabel lblPregunta2 = new JLabel("2. ¿Cuál es el resultado de '5 + 7 * 2' en Java?");
        lblPregunta2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta2.setBounds(27, 215, 400, 14);
        add(lblPregunta2);
        
        opc2 = new JCheckBox("19");
        opc2.setBackground(new Color(84, 90, 246));
        opc2.setBounds(44, 236, 45, 23);
        add(opc2);
        
        opc2_1 = new JCheckBox("24");
        opc2_1.setBackground(new Color(84, 90, 246));
        opc2_1.setBounds(124, 236, 65, 23);
        add(opc2_1);
        
        opc2_2 = new JCheckBox("26");
        opc2_2.setBackground(new Color(84, 90, 246));
        opc2_2.setBounds(204, 236, 65, 23);
        add(opc2_2);
        
        // Pregunta 3
        JLabel lblPregunta3 = new JLabel("3. ¿Cuál es la salida de 'System.out.println(\"Hello, world!\");'?");
        lblPregunta3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta3.setBounds(27, 275, 400, 14);
        add(lblPregunta3);
        
        opc3 = new JCheckBox("Hello, world!");
        opc3.setBackground(new Color(84, 90, 246));
        opc3.setBounds(44, 296, 500, 23);
        add(opc3);
        
        opc3_1 = new JCheckBox("Se produce un error.");
        opc3_1.setBackground(new Color(84, 90, 246));
        opc3_1.setBounds(44, 326, 500, 23);
        add(opc3_1);
        
        opc3_2 = new JCheckBox("No hay salida.");
        opc3_2.setBackground(new Color(84, 90, 246));
        opc3_1.setBackground(new Color(84, 90, 246));
        opc3_2.setBounds(44, 356, 500, 23);
        add(opc3_2);
        
     // Pregunta 4
        JLabel lblPregunta4 = new JLabel("4. ¿Qué es un constructor en Java?");
        lblPregunta4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta4.setBounds(27, 405, 400, 14);
        add(lblPregunta4);
        
        opc4 = new JCheckBox("Un método que se llama automáticamente cuando se crea un objeto.");
        opc4.setBackground(new Color(84, 90, 246));
        opc4.setBounds(44, 426, 500, 23);
        add(opc4);
        
        opc4_1 = new JCheckBox("Un tipo de bucle utilizado para iterar sobre una colección de elementos.");
        opc4_1.setBackground(new Color(84, 90, 246));
        opc4_1.setBounds(44, 456, 500, 23);
        add(opc4_1);
        
        opc4_2 = new JCheckBox("Una instrucción que cambia el flujo de control del programa.");
        opc4_2.setBackground(new Color(84, 90, 246));
        opc4_2.setBounds(44, 486, 500, 23);
        add(opc4_2);
        
        // Pregunta 5
        JLabel lblPregunta5 = new JLabel("5. ¿Cuál es el resultado de '10 % 3' en Java?");
        lblPregunta5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta5.setBounds(532, 85, 400, 14);
        add(lblPregunta5);
        
        opc5 = new JCheckBox("3");
        opc5.setBackground(new Color(84, 90, 246));
        opc5.setBounds(549, 106, 45, 23);
        add(opc5);
        
        opc5_1 = new JCheckBox("1");
        opc5_1.setBackground(new Color(84, 90, 246));
        opc5_1.setBounds(655, 106, 35, 23);
        add(opc5_1);
        
        opc5_2 = new JCheckBox("0");
        opc5_2.setBackground(new Color(84, 90, 246));
        opc5_2.setBounds(755, 106, 35, 23);
        add(opc5_2);

        // Pregunta 6
        JLabel lblPregunta6 = new JLabel("6. ¿Qué tipo de datos se utiliza para almacenar caracteres en Java?");
        lblPregunta6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta6.setBounds(532, 154, 468, 14);
        add(lblPregunta6);
        
        opc6 = new JCheckBox("char");
        opc6.setBackground(new Color(84, 90, 246));
        opc6.setBounds(549, 175, 65, 23);
        add(opc6);
        
        opc6_1 = new JCheckBox("String");
        opc6_1.setBackground(new Color(84, 90, 246));
        opc6_1.setBounds(655, 175, 70, 23);
        add(opc6_1);

        // Pregunta 7
        JLabel lblPregunta7 = new JLabel("7. ¿Qué hace el operador '==' en Java?");
        lblPregunta7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta7.setBounds(532, 215, 400, 14);
        add(lblPregunta7);
        
        opc7 = new JCheckBox("Asigna un valor a una variable.");
        opc7.setBackground(new Color(84, 90, 246));
        opc7.setBounds(549, 236, 180, 23);
        add(opc7);
        
        opc7_1 = new JCheckBox("Compara dos valores para ver si son iguales.");
        opc7_1.setBackground(new Color(84, 90, 246));
        opc7_1.setBounds(549, 266, 250, 23);
        add(opc7_1);

        // Pregunta 8
        JLabel lblPregunta8 = new JLabel("8. ¿Qué método se utiliza para leer una cadena de texto en Java?");
        lblPregunta8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta8.setBounds(532, 305, 468, 14);
        add(lblPregunta8);
        
        opc8 = new JCheckBox("System.out.println()");
        opc8.setBackground(new Color(84, 90, 246));
        opc8.setBounds(549, 326, 150, 23);
        add(opc8);
        
        opc8_1 = new JCheckBox("Scanner.nextLine()");
        opc8_1.setBackground(new Color(84, 90, 246));
        opc8_1.setBounds(549, 356, 150, 23);
        add(opc8_1);

        // Pregunta 9
        JLabel lblPregunta9 = new JLabel("9. ¿Cuál de las siguientes declaraciones es correcta para un arreglo en Java?");
        lblPregunta9.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta9.setBounds(532, 405, 468, 14);
        add(lblPregunta9);
        
        opc9 = new JCheckBox("int[] numbers = {1, 2, 3};");
        opc9.setBackground(new Color(84, 90, 246));
        opc9.setBounds(549, 426, 200, 23);
        add(opc9);
        
        opc9_1 = new JCheckBox("ArrayList numbers = new ArrayList();");
        opc9_1.setBackground(new Color(84, 90, 246));
        opc9_1.setBounds(549, 456, 250, 23);
        add(opc9_1);
        
        // Pregunta 10
        JLabel lblPregunta10 = new JLabel("10. ¿Cuál es el resultado de 'true && false' en Java?");
        lblPregunta10.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta10.setBounds(532, 505, 458, 14);
        add(lblPregunta10);
        
        opc10 = new JCheckBox("true");
        opc10.setBackground(new Color(84, 90, 246));
        opc10.setBounds(549, 526, 65, 23);
        add(opc10);
        
        opc10_1 = new JCheckBox("false");
        opc10_1.setBackground(new Color(84, 90, 246));
        opc10_1.setBounds(655, 526, 70, 23);
        add(opc10_1);
        
        btnFinalizar = new JButton("Finalizar");
        btnFinalizar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnFinalizar.setBounds(411, 575, 89, 23);
        add(btnFinalizar);
    }
}