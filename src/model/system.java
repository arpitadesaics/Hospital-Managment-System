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


public class system {
patientArrayList patientarraylist;
hospitalArrayList hospitalarraylist;
doctorArrayList doctorarraylist;

    public system(){
        this.hospitalarraylist = new hospitalArrayList();
        this.patientarraylist = new patientArrayList();
        this.doctorarraylist = new doctorArrayList();


    }

    public patientArrayList getPatientarraylist() {
        return patientarraylist;
    }

    public void setPatientarraylist(patientArrayList patientarraylist) {
        this.patientarraylist = patientarraylist;
    }

    public hospitalArrayList getHospitalarraylist() {
        return hospitalarraylist;
    }

    public void setHospitalarraylist(hospitalArrayList hospitalarraylist) {
        this.hospitalarraylist = hospitalarraylist;
    }

    public doctorArrayList getDoctorarraylist() {
        return doctorarraylist;
    }

    public void setDoctorarraylist(doctorArrayList doctorarraylist) {
        this.doctorarraylist = doctorarraylist;
    }
} 
