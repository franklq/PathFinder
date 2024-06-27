package com.aed.pathfinder.util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Juan Romero Collazos
 */
public class CustomHeaderRenderer extends DefaultTableCellRenderer {

    public CustomHeaderRenderer() {
        setOpaque(true);
        setHorizontalAlignment(SwingConstants.CENTER);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        setBackground(Color.decode("#0077E8")); // Establecer el color de fondo a azul
        setForeground(Color.WHITE); // Establecer el color del texto a blanco
        setFont(getFont().deriveFont(Font.BOLD)); // Opcional: hacer el texto en negrita
        return this;
    }

}
