package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "DOCTOR")
public class Doctor {
    @Id
    @Column(name = "doctorID")
    private Integer doctorID;

    @Column(name = "licenseID")
    private Integer licenseID;

    @Column(name = "specialty")
    private String specialty;

//    @OneToMany(mappedBy = "doctor")
//    private List<Appointment> appointments;

    /* BEGIN Constructors */
    public Doctor() {
    }

    public Doctor(Integer doctorID, Integer licenseID, String specialty) {
        this.doctorID = doctorID;
        this.licenseID = licenseID;
        this.specialty = specialty;
        //this.appointments = appointments;
    }
    /* END Constructors */

    public Integer getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(Integer doctorID) {
        this.doctorID = doctorID;
    }

    public Integer getLicenseID() {
        return licenseID;
    }

    public void setLicenseID(Integer licenseID) {
        this.licenseID = licenseID;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

//    public List<Appointment> getAppointments() {return appointments;}
//    public void setAppointments(List<Appointment> appointments) {this.appointments = appointments;}
}