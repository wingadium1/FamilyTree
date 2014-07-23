/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;


import Class.HumanClosed;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author cuho1
 */
public class MyTableModelClosed extends AbstractTableModel
{
    Vector<HumanClosed> humanList = new Vector<HumanClosed>();

    public MyTableModelClosed() {
    }
    
    
    public MyTableModelClosed(Vector<HumanClosed> humanList) {
        this.humanList = humanList;
    }
    
    @Override
    public int getRowCount() {
        return humanList.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0) 
            return humanList.get(rowIndex).getTenQuanHe();
        if(columnIndex == 1)
            return humanList.get(rowIndex).getID();
        if(columnIndex == 2)
            return humanList.get(rowIndex).getName();
        if(columnIndex == 3)
            return humanList.get(rowIndex).isMale()?"Male":"Female";
        return humanList.get(rowIndex).getBorn();
                
    }
    
    @Override
    public String getColumnName(int index){
        if(index == 0)
            return "Quan hệ";
        if(index ==1)
            return " ID";
        if(index == 2)
            return "Name";
        if(index == 3)
            return "Gender";
        return "Born";
    }
}

