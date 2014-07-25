/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Class;

import java.util.Date;

/**
 *
 * @author cuho1
 */
public class HumanClosed extends Human{
    int quanhe;// 0 bố| 1 mẹ |2  vợ/chồng| 3 con| 4 ko xác định

    public HumanClosed(String ID, String name, Boolean male, Date born, Date death, Human father, Human mother, Human spouse, String biography) {
        super(ID, name, male, born, death, father, mother, spouse, biography);
    }
    
    public HumanClosed(Human h,int qh){
        super(h);
        this.quanhe = qh;
    }
    public int getQuanhe() {
        return quanhe;
    }

    public void setQuanhe(int quanhe) {
        this.quanhe = quanhe;
    }
    
    public String getTenQuanHe(){
        switch (quanhe){
            case 0: return "Bố";
            case 1: return "Mẹ";
            case 2:
                if(isMale())return "CHồng";
                        else return "Vợ";
            case 3:
                return "Con";
        }
        return "Không xác định";
    }
}
