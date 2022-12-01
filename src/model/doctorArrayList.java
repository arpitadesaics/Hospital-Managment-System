/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author DELL
 * 
 */

public class doctorArrayList {
    
    
    private ArrayList<Doctor>d;
    
    public doctorArrayList(){
        
        this.d = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getD() {
        return d;
    }

    public void setD(ArrayList<Doctor>d) {
        this.d = d ;
    }
    
   
    public Doctor addNewD(){
        Doctor newD = new Doctor();
        d.add(newD);
        return newD;
    }
    public void deleteD(Doctor ep){
        d.remove(ep);

}
    public String[] doctorNameArray(){
        String[] doctorName = new String[d.size()+1];
        int count=1;
        doctorName[0] = "select";
        for(Doctor cc: d){
            doctorName[count] = cc.getName();
            count++ ;
        }
        return doctorName;
    }
    
    public String[] doctorUsernameArray(){
        String[] doctorUsername = new String[d.size()+1];
        int count=1;
        doctorUsername[0] = "select";
        for(Doctor cc: d){
            doctorUsername[count] = cc.getUsername();
            count++ ;
        }
        return doctorUsername;
    }
}

    

