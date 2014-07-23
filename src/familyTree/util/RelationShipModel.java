/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyTree.util;


import familyTree.Human;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author mk
 */
public class RelationShipModel extends AbstractTableModel
{
    Vector<Human> humanList;
    Human current;
    public RelationShipModel(Vector<Human> humanList, Human human) {
        this.humanList = humanList;
        this.current = human;
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
        if (humanList.isEmpty()) return null;
        if(columnIndex == 0)
            return humanList.get(rowIndex).getID();
        if(columnIndex == 1)
            return humanList.get(rowIndex).getName();
        if(columnIndex == 2)
            return humanList.get(rowIndex).isMale()?"Male":"Female";
        else {
            if (current!=null) return humanList.get(rowIndex).relawith(current);
            else return "";
        }
                
    }
    
    @Override
    public String getColumnName(int index){
        if(index ==0)
            return " ID";
        if(index == 1)
            return "Name";
        if(index == 2)
            return "Gender";
        return "Relationship";
    }
    
}
