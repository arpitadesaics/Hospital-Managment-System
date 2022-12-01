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
public class communityArrayList {
    private ArrayList<Community>co;
    
     public communityArrayList(){
        co = new ArrayList<Community>();
    }

    public ArrayList<Community> getCo() {
        return co;
    }

    public void setCo(ArrayList<Community> co) {
        this.co = co;
    }
    

    
    public Community addNewCo(){
        Community comm = new Community();
        co.add(comm);
        return comm;
    }
    
    public void deletedCo(Community comm){
        co.remove(comm);
        
    }
    
    public String[] communityArray(){
        String[] community = new String[co.size()+1];
        int count=1;
        community[0] = "select";
        for(Community cc: co){
            community[count] = cc.getCommunityName();
            count++ ;
        }
        return community;
    
    }
    public String[] zipcodeArray(){
        String[] zipcode = new String[co.size()+1];
        int count=1;
        zipcode[0] = "select";
        for(Community cc: co){            
            zipcode[count] = String.valueOf(cc.getZipcode());
            count++ ;
        }
        return zipcode;
    }
    
}
