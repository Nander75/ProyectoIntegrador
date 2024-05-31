package com.dam.view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Test4 extends JPanel {
    
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
    
    public Test4() {
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

        // Respuestas correctas para el Test 4
        if (opc1.isSelected()) {
            puntuacion++;
        }

        if (opc2.isSelected()) {
            puntuacion++;
        }

        if (opc3.isSelected()) {
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
        setLayout(null);

        JLabel lblTest4 = new JLabel("TEST 4");
        lblTest4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTest4.setBounds(27, 30, 128, 32);
        add(lblTest4);

        // Pregunta 1
        JLabel lblPregunta1 = new JLabel("1. �Qu� es una clase abstracta en Java?");
        lblPregunta1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta1.setBounds(27, 85, 411, 14);
        add(lblPregunta1);

        opc1 = new JCheckBox("Una clase que no puede ser instanciada y puede contener m�todos abstractos.");
        opc1.setBackground(new Color(84, 90, 246));
        opc1.setBounds(44, 106, 500, 23);
        add(opc1);

        opc1_1 = new JCheckBox("Una clase que solo contiene m�todos est�ticos.");
        opc1_1.setBackground(new Color(84, 90, 246));
        opc1_1.setBounds(44, 136, 500, 23);
        add(opc1_1);

        opc1_2 = new JCheckBox("Una clase que puede ser instanciada.");
        opc1_2.setBackground(new Color(84, 90, 246));
        opc1_2.setBounds(44, 166, 500, 23);
        add(opc1_2);

        // Pregunta 2
        JLabel lblPregunta2 = new JLabel("2. �Cu�l es el resultado de '20 % 6' en Java?");
        lblPregunta2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta2.setBounds(27, 215, 400, 14);
        add(lblPregunta2);

        opc2 = new JCheckBox("2");
        opc2.setBackground(new Color(84, 90, 246));
        opc2.setBounds(44, 236, 65, 23);
        add(opc2);

        opc2_1 = new JCheckBox("4");
        opc2_1.setBackground(new Color(84, 90, 246));
        opc2_1.setBounds(124, 236, 45, 23);
        add(opc2_1);

        opc2_2 = new JCheckBox("6");
        opc2_2.setBackground(new Color(84, 90, 246));
        opc2_2.setBounds(204, 236, 45, 23);
        add(opc2_2);

        // Pregunta 3
        JLabel lblPregunta3 = new JLabel("3. �Qu� es la sobrecarga de m�todos en Java?");
        lblPregunta3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta3.setBounds(27, 275, 400, 14);
        add(lblPregunta3);

        opc3 = new JCheckBox("Definir m�ltiples m�todos con el mismo nombre pero diferentes par�metros.");
        opc3.setBackground(new Color(84, 90, 246));
        opc3.setBounds(44, 296, 500, 23);
        add(opc3);

        opc3_1 = new JCheckBox("Redefinir un m�todo en una subclase.");
        opc3_1.setBackground(new Color(84, 90, 246));
        opc3_1.setBounds(44, 326, 500, 23);
        add(opc3_1);

        opc3_2 = new JCheckBox("Invocar un m�todo est�tico.");
        opc3_2.setBackground(new Color(84, 90, 246));
        opc3_2.setBounds(44, 356, 500, 23);
        add(opc3_2);

        // Pregunta 4
        JLabel lblPregunta4 = new JLabel("4. �Qu� es el polimorfismo en Java?");
        lblPregunta4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta4.setBounds(27, 405, 400, 14);
        add(lblPregunta4);

        opc4 = new JCheckBox("La capacidad de un objeto de adoptar muchas formas.");
        opc4.setBackground(new Color(84, 90, 246));
        opc4.setBounds(44, 426, 500, 23);
        add(opc4);

        opc4_1 = new JCheckBox("La capacidad de una clase de heredar de m�ltiples clases.");
        opc4_1.setBackground(new Color(84, 90, 246));
        opc4_1.setBounds(44, 456, 500, 23);
        add(opc4_1);

        opc4_2 = new JCheckBox("La capacidad de un m�todo de ser llamado de diferentes formas.");
        opc4_2.setBackground(new Color(84, 90, 246));
        opc4_2.setBounds(44, 486, 500, 23);
        add(opc4_2);

        // Pregunta 5
        JLabel lblPregunta5 = new JLabel("5. �Cu�l es el prop�sito de la palabra clave 'super' en Java?");
        lblPregunta5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta5.setBounds(532, 85, 400, 14);
        add(lblPregunta5);

        opc5 = new JCheckBox("Llamar al constructor de la superclase.");
        opc5.setBackground(new Color(84, 90, 246));
        opc5.setBounds(549, 106, 200, 23);
        add(opc5);

        opc5_1 = new JCheckBox("Crear una instancia de la superclase.");
        opc5_1.setBackground(new Color(84, 90, 246));
        opc5_1.setBounds(549, 136, 200, 23);
        add(opc5_1);

        opc5_2 = new JCheckBox("Eliminar una instancia de la superclase.");
        opc5_2.setBackground(new Color(84, 90, 246));
        opc5_2.setBounds(549, 166, 200, 23);
        add(opc5_2);

        // Pregunta 6
        JLabel lblPregunta6 = new JLabel("6. �Qu� palabra clave se utiliza para declarar una constante en Java?");
        lblPregunta6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta6.setBounds(532, 205, 468, 14);
        add(lblPregunta6);

        opc6 = new JCheckBox("final");
        opc6.setBackground(new Color(84, 90, 246));
        opc6.setBounds(549, 226, 65, 23);
        add(opc6);

        opc6_1 = new JCheckBox("const");
        opc6_1.setBackground(new Color(84, 90, 246));
        opc6_1.setBounds(655, 226, 70, 23);
        add(opc6_1);

        // Pregunta 7
        JLabel lblPregunta7 = new JLabel("7. �Qu� significa 'null' en Java?");
        lblPregunta7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta7.setBounds(532, 275, 400, 14);
        add(lblPregunta7);

        opc7 = new JCheckBox("Una referencia que no apunta a ning�n objeto.");
        opc7.setBackground(new Color(84, 90, 246));
        opc7.setBounds(549, 296, 250, 23);
        add(opc7);

        opc7_1 = new JCheckBox("Un valor num�rico cero.");
        opc7_1.setBackground(new Color(84, 90, 246));
        opc7_1.setBounds(549, 326, 250, 23);
        add(opc7_1);

        // Pregunta 8
        JLabel lblPregunta8 = new JLabel("8. �Cu�l es el valor por defecto de un atributo int en una clase en Java?");
        lblPregunta8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta8.setBounds(532, 365, 468, 14);
        add(lblPregunta8);

        opc8 = new JCheckBox("0");
        opc8.setBackground(new Color(84, 90, 246));
        opc8.setBounds(549, 386, 150, 23);
        add(opc8);

        opc8_1 = new JCheckBox("null");
        opc8_1.setBackground(new Color(84, 90, 246));
        opc8_1.setBounds(549, 416, 150, 23);
        add(opc8_1);

        // Pregunta 9
        JLabel lblPregunta9 = new JLabel("9. �Cu�l de las siguientes es una clase del paquete java.util?");
        lblPregunta9.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta9.setBounds(532, 455, 468, 14);
        add(lblPregunta9);

        opc9 = new JCheckBox("ArrayList");
        opc9.setBackground(new Color(84, 90, 246));
        opc9.setBounds(549, 476, 200, 23);
        add(opc9);

        opc9_1 = new JCheckBox("BufferedReader");
        opc9_1.setBackground(new Color(84, 90, 246));
        opc9_1.setBounds(549, 506, 200, 23);
        add(opc9_1);

        // Pregunta 10
        JLabel lblPregunta10 = new JLabel("10. �Qu� es una excepci�n en Java?");
        lblPregunta10.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPregunta10.setBounds(27, 555, 400, 14);
        add(lblPregunta10);

        opc10 = new JCheckBox("Un evento que ocurre durante la ejecuci�n del programa y interrumpe el flujo normal de las instrucciones.");
        opc10.setBackground(new Color(84, 90, 246));
        opc10.setBounds(44, 576, 500, 23);
        add(opc10);

        opc10_1 = new JCheckBox("Una declaraci�n que se utiliza para iterar sobre una colecci�n.");
        opc10_1.setBackground(new Color(84, 90, 246));
        opc10_1.setBounds(44, 606, 500, 23);
        add(opc10_1);

        // Bot�n Finalizar
        btnFinalizar = new JButton("Finalizar");
        btnFinalizar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnFinalizar.setBounds(880, 530, 90, 30);
        add(btnFinalizar);
    }


    
}
