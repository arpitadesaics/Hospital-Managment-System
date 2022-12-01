/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Houses extends Community {

    public String getHouseadd() {
        return houseadd;
    }

    public void setHouseadd(String houseadd) {
        this.houseadd = houseadd;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }
    
    private String houseadd;
    private int houseId;
    
    public String toString(){
        return houseadd;
    }
}
