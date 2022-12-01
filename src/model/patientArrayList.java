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
public class patientArrayList {
    
    private ArrayList<Patient> p;
    
    public patientArrayList(){
        
        this.p = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getP() {
        return p;
    }

    public void setP(ArrayList<Patient> p) {
        this.p = p;
    }
    
   
    public Patient addNewP(){
        Patient newP = new Patient();
        p.add(newP);
        return newP;
    }
    public void deleteP(Patient ep){
        p.remove(ep);

    }
    
    public String[] patientNameArray(){
        String[] patientname = new String[p.size()+1];
        int count=1;
        patientname[0] = "select";
        for(Patient cc: p){
            patientname[count] = cc.getName();
            count++ ;
        }
        return patientname;
    }
    
     public String[] patientUsernameArray(){
        String[] patientUsername = new String[p.size()+1];
        int count=1;
        patientUsername[0] = "select";
        for(Patient cc: p){
            patientUsername[count] = cc.getUsername();
            count++ ;
        }
        return patientUsername;
    }
}
