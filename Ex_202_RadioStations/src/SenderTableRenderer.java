
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johannesriedmueller
 */
public class SenderTableRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Sender s = (Sender) value;
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 14));
        switch (column) {
            case 0:
                label.setText(s.getSender());
                break;
            case 1:
                label.setText(Double.toString(s.getFrequency()));
                break;
            case 2:
                label.setText(s.getBand().toUpperCase());
                break;
        }
        if (isSelected) {
            label.setBackground(Color.BLACK);
            label.setForeground(Color.WHITE);
        } else {
            if (s.getBand().toLowerCase().equals("am")) {
                label.setBackground(new Color(60, 60, 170));
                label.setForeground(Color.LIGHT_GRAY);
            } else if (s.getBand().toLowerCase().equals("fm")) {
                label.setBackground(new Color(170, 60, 60));
                label.setForeground(Color.LIGHT_GRAY);
            }
        }

        return label;
    }

}
