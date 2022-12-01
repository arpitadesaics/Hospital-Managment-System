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
public class houseArrayList {
    private ArrayList<Houses>ho;
    
    public houseArrayList(){
        ho = new ArrayList<Houses>();
    }

    public ArrayList<Houses> getHo() {
        return ho;
    }

    public void setHo(ArrayList<Houses> ho) {
        this.ho = ho;
    }
    
    
    
    public Houses addNewHo(){
        Houses hou = new Houses();
        ho.add(hou);
        return hou;
    }
    
    public void deletehou(Houses hou){
        ho.remove(hou);
        
        
    }
    
     public String[] houseArray(){
        String[] house = new String[ho.size()+1];
        int count=1;
        house[0] = "select";
        for(Houses cc: ho){
            house[count] = cc.getHouseadd();
            count++ ;
        }
        return house;
    }
    
    
}
