package com.dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import com.dam.db.TablasPersistencia;

public class TopRanking extends JPanel {
    private JTable table;

    public TopRanking() {
        crearComponentes();
        cargarDatosEnTabla();
    }

    private void crearComponentes() {
        setBackground(new Color(84, 90, 246));
        setLayout(null);

        JLabel lblRanking = new JLabel("RANKING JUGADORES");
        lblRanking.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblRanking.setBounds(109, 30, 219, 25);
        add(lblRanking);

        table = new JTable();
        table.setBounds(79, 78, 400, 155); // Aumenta el ancho de la tabla para acomodar mejor las columnas
        add(table);
    }

    private void cargarDatosEnTabla() {
        String[] columnasNombre = {"Nombre", "Puntos"};
        DefaultTableModel tablita = new DefaultTableModel(columnasNombre, 0);
        table.setModel(tablita);

        TablasPersistencia tp = new TablasPersistencia();
        List<Object[]> top10Players = tp.getTop10();

        for (Object[] player : top10Players) {
            tablita.addRow(player);
        }
    }
}
