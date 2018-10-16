package BL;


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
    private String[] colNames = {"Sender", "Frequenz", "Band"};
    private boolean isHidden;
    
    public void add(Sender s){
        if(sender.isEmpty()){
            sender.add(s);
        }
        else if(sender.size() == 1){
            sender.add(binarySearch(sender.size()-1, sender.size()-1, s.getFrequency()),s);
        }
        else{
            sender.add(binarySearch(0, sender.size()-1, s.getFrequency()),s);
        }
        
        fireTableRowsInserted(0, sender.size()-1);
    }

    public void hideBand(){
        isHidden = true;
        fireTableStructureChanged();
    }
    
    public void showBand(){
        isHidden = false;
        fireTableStructureChanged();
    }
    
    public int binarySearch(int li, int re, double frequency){
        if(li>re){
            return li;
        }
        
        int mi = (li+re)/2;
        if(sender.get(mi).getFrequency() < frequency){
            return binarySearch(mi+1, re, frequency);
        }
        if(sender.get(mi).getFrequency() > frequency){
            return binarySearch(li, mi-1, frequency);
        }
        return li;
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
        if(isHidden){
            return colNames.length-1;
        }
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return sender.get(rowIndex);
    }
    
}
