
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johannesriedmueller
 */
public class SenderTableModel extends AbstractTableModel{
    private ArrayList<Sender> sender = new ArrayList<>();
    private String[] colNames = {};
    
    
    public void add(Sender s){
        sender.add(s);
        fireTableRowsInserted(sender.size()-1, sender.size()-1);
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
    
    @Override
    public int getRowCount() {
        return sender.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return sender.get(rowIndex);
    }
    
}
