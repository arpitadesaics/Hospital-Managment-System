/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class encounterArrayList {
    
     private ArrayList<encounter>e ;
     
     public encounterArrayList()
     {
         e = new ArrayList<encounter>();
     }

    public ArrayList<encounter> getE() {
        return e;
    }

    public void setE(ArrayList<encounter> e) {
        this.e = e;
    }
    
    public encounter addNewE(){
        encounter newE = new encounter();
        e.add(newE);
        return newE;
    }
    public void deleteE(encounter ep){
        e.remove(ep);

    }
   
    
}
