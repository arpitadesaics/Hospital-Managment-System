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
public class hospitalArrayList {
      private ArrayList<Hospital>h;
      
       public hospitalArrayList(){
        
        this.h = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getH() {
        return h;
    }

    public void setH(ArrayList<Hospital> h) {
        this.h = h;
    }
    
      public Hospital addNewH(){
        Hospital newH = new Hospital();
        h.add(newH);
        return newH;
    }
    public void deleteH(Hospital ep){
        h.remove(ep);

}
  
     public String[] hospitalnameArray(){
        String[] hospital = new String[h.size()+1];
        int count=1;
        hospital[0] = "select";
        for(Hospital cc: h){
            hospital[count] = cc.getHospitalName();
            count++ ;
        }
        return hospital;
    }
     
     public String[] hospitaladdArray(){
        String[] hospitaladd = new String[h.size()+1];
        int count=1;
        hospitaladd[0] = "select";
        for(Hospital cc: h){
            hospitaladd[count] = cc.getHospitalResidence();
            count++ ;
        }
        return hospitaladd;
    }
    
   
    
}
