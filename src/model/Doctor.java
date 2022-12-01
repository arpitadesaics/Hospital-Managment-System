/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Doctor extends Person {
    
    private int doctorId;
    private String hospitalName;
    private String hospitalResidence;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalResidence() {
        return hospitalResidence;
    }

    public void setHospitalResidence(String hospitalResidence) {
        this.hospitalResidence = hospitalResidence;
    }
    
     public String toString()
    {
        return name;
    }
    

              
    

   
    
}
