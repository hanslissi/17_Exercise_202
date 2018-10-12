
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
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
public class SenderTableRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Sender s = (Sender) value;
        JLabel label = new JLabel();
        label.setOpaque(true);
        switch(column){
            case 0: label.setText(s.getSender()); break;
            case 1: label.setText(Double.toString(s.getFrequency())); break;
            case 2: label.setText(s.getBand()); break;
        }
        if(s.getBand().toLowerCase().equals("am")){
            label.setBackground(Color.BLUE);
        }
        else{
            label.setBackground(Color.red);
        }
        return label;    
    }
    
}
