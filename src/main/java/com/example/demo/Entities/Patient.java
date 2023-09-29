package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "PATIENT")
public class Patient extends Person {
    //TODO- figure out how to have patientID as a FK to personID
    @Id
    @Column(name = "patientID", unique = true, nullable = false)
    private Integer patientID;
    @Column(name = "weight", unique = false, nullable = false)
    private float weight;
    @Column(name = "height", unique = false, nullable = false)
    private float height;
    @Column(name = "bloodType", unique = false, nullable = false)
    private String bloodType;
    @Column(name = "insuranceCompany", unique = false, nullable = false)
    private String insuranceCompany;


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