/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package familyTree.util;

import Class.Human;
import Class.HumanClosed;
import java.util.Vector;

/**
 *
 * @author mk
 */
public class Checker {

    public Checker() {
    }
    
    public boolean isIn(Human a,Vector<HumanClosed> b){
        Vector<Human> b1= new Vector<>();
        b.stream().forEach((c) -> {
            b1.add((Human) c);
        });
        return b1.contains(a);
    } 
}
