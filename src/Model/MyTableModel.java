/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Class.Human;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author cuho1
 */
public class MyTableModel extends AbstractTableModel
{
    Vector<Human> humanList;

    public MyTableModel(Vector<Human> humanList) {
        this.humanList = humanList;
    }
    
    @Override
    public int getRowCount() {
        return humanList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0)
            return humanList.get(rowIndex).getID();
        if(columnIndex == 1)
            return humanList.get(rowIndex).getName();
        if(columnIndex == 2)
            return humanList.get(rowIndex).isMale()?"Male":"Female";
        Date born = humanList.get(rowIndex).getBorn();
        return ""+born.getDate()+"/"+(born.getMonth()+1)+"/"+(born.getYear()+1900);
                
    }
    
    @Override
    public String getColumnName(int index){
        if(index ==0)
            return " ID";
        if(index == 1)
            return "Name";
        if(index == 2)
            return "Gender";
        return "Born";
    }
}
