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
public class vitalsignsArrayList {
    private ArrayList<VitalSigns> vs;
    
    public vitalsignsArrayList()
    {
        this.vs = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVs() {
        return vs;
    }

    public void setVs(ArrayList<VitalSigns> vs) {
        this.vs = vs;
    }
    
    public VitalSigns addNewVS(){
        VitalSigns newVS = new VitalSigns();
        vs.add(newVS);
        return newVS;
    }
    public void deleteVS(VitalSigns ep){
        vs.remove(ep);

}
    
    
    
}
