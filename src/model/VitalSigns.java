/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class VitalSigns extends encounter {

    public int getPulse() {
        return Pulse;
    }

    public void setPulse(int Pulse) {
        this.Pulse = Pulse;
    }

    public String getBP() {
        return BP;
    }

    public void setBP(String BP) {
        this.BP = BP;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }
    
  
    
    private int Pulse;
    private String BP;
    private float temp;

    
      @Override
    public String toString(){
        return patientName;
    }
    
}
