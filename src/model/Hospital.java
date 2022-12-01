/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class Hospital {

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
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

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public String getHospitalCommunity() {
        return hospitalCommunity;
    }

    public void setHospitalCommunity(String hospitalCommunity) {
        this.hospitalCommunity = hospitalCommunity;
    }
    public long getHospitalCellPhone() {
        return hospitalCellPhone;
    }

    public void setHospitalCellPhone(long hospitalCellPhone) {
        this.hospitalCellPhone = hospitalCellPhone;
    }
    
    public long getHospitalZipcode() {
        return hospitalZipcode;
    }

    public void setHospitalZipcode(long hospitalZipcode) {
        this.hospitalZipcode = hospitalZipcode;
    }
   
    private int hospitalId;
    private String hospitalName;
    private String hospitalResidence;
    private String hospitalCity;
    private String hospitalCommunity;    

    public String getHospitalState() {
        return hospitalState;
    }

    public void setHospitalState(String hospitalState) {
        this.hospitalState = hospitalState;
    }

    public String getHospitalCountry() {
        return hospitalCountry;
    }

    public void setHospitalCountry(String hospitalCountry) {
        this.hospitalCountry = hospitalCountry;
    }
    private String hospitalState; 
    private String hospitalCountry; 
    private long hospitalCellPhone;
    private long hospitalZipcode;
     

    
    public String toString()
    {
        return hospitalName;
    }
    
    
    
}
