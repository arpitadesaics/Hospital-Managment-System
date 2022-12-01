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

public class cityArrayList {
    
    private ArrayList<City> c;
    
    public cityArrayList(){
        c = new ArrayList<City>();
    }

    public ArrayList<City> getC() {
        return c;
    }

    public void setC(ArrayList<City> c) {
        this.c = c;
    }
    
    
    
    public City addNewC(){
        City newC = new City();
        c.add(newC);
        return newC;
    }
    
    public void deleteC(City cp){
        c.remove(cp);
        
}
    
    public String[] cityArray(){
        String[] city = new String[c.size()+1];
        int count=1;
        city[0] = "select";
        for(City cc: c){
            city[count] = cc.getCityName();
            count++ ;
        }
        return city;
    }
    public String[] countryArray(){
        String[] country = new String[c.size()+1];
        int count=1;
        country[0] = "select";
        for(City cc: c){
            country[count] = cc.getCountry();
            count++ ;
        }
        return country;
    }
    public String[] stateArray(){
        String[] state = new String[c.size()+1];
        int count=1;
        state[0] = "select";
        for(City cc: c){
            state[count] = cc.getState();
            count++ ;
        }
        return state;
    }
    
}
