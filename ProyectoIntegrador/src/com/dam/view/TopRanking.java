package com.dam.view;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.dam.control.VListener;

import java.awt.Color;
import java.awt.Font;

//import com.dam.db.TablasPersistencia;

public class TopRanking extends JPanel {
    
	public static final String ACT_CMN_BTN_VOLVER = " ";
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JButton btnVolver;

    public TopRanking() {
        crearComponentes();
        cargarDatosEnTabla();
    }

    private void crearComponentes() {
        setBackground(new Color(84, 90, 246));
        setLayout(null);

        JLabel lblRanking = new JLabel("RANKING JUGADORES");
        lblRanking.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblRanking.setBounds(124, 97, 219, 25);
        add(lblRanking);

        table = new JTable();
        table.setBounds(57, 179, 336, 303); // Aumenta el ancho de la tabla para acomodar mejor las columnas
        add(table);
        
        btnVolver = new JButton(ACT_CMN_BTN_VOLVER);
        btnVolver.setIcon(new ImageIcon(TopRanking.class.getResource("/img/imgVolver.jpg")));
        btnVolver.setBounds(377, 17, 73, 93);
        add(btnVolver);
        
    }

    private void cargarDatosEnTabla() {
        String[] columnasNombre = {"Nombre", "Puntos"};
        DefaultTableModel tablita = new DefaultTableModel(columnasNombre, 0);
        table.setModel(tablita);

        /*TablasPersistencia tp = new TablasPersistencia();
        //List<Object[]> top10Players = tp.getTop10();

        for (Object[] player : top10Players) {
            tablita.addRow(player);
        }*/
    }

	public void setListener(VListener listener) {
		btnVolver.addActionListener(listener);
	}
}
