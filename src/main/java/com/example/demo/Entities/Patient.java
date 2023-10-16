package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PATIENT")
public class Patient {
    @Id
    @Column(name = "patientID")
    private Integer patientID;
    @Column(name = "weight")
    private float weight;
    @Column(name = "height")
    private float height;
    @Column(name = "bloodType")
    private String bloodType;
    @Column(name = "insuranceCompany")
    private String insuranceCompany;

//    @OneToMany(mappedBy = "patient")
//    private List<Appointment> appointments;
/*    //Relationships

    //Patient:Appointment = 1:M
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "appointmentID")
    private Set<Appointment> appointments;*/

    /*BEGIN Constructors*/
    public Patient() {

    }

    public Patient(Integer patientID, float weight, float height, String bloodType, String insuranceCompany) {
        this.patientID = patientID;
        this.weight = weight;
        this.height = height;
        this.bloodType = bloodType;
        this.insuranceCompany = insuranceCompany;
//        this.appointments = appointments;
    }
    /*END Constructors*/


    /*BEGIN Getters and setters*/
    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }
    /*END Getters and Setters*/
}