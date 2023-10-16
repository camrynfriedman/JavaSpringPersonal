package com.example.demo.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "APPOINTMENT")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointmentID")
    private Integer appointmentID;

    @Column(name = "apptStatus")
    private String apptStatus;

    @Column(name = "apptStartDateTime")
    private java.util.Date apptStartDateTime;

    @Column(name = "apptEndDateTime")
    private java.util.Date apptEndDateTime;

    @Column(name = "roomNum")
    private Integer roomNum;

    @Column(name = "visitReason")
    private String visitReason;

    @ManyToOne
    @JoinColumn(name="doctorID")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name="patientID")
    private Patient patient;

    //figure out what to add to join column (you will get an error when post in postman)
    //create JSON object with minimum elements and see what happens
    /*
    Column 'doctorID' is duplicated in mapping for entity 'com.example.demo.Entities.Appointment'
    (use '@Column(insertable=false, updatable=false)' when mapping multiple properties to the same column)
    */
    @Column(name="patientID", insertable = false, updatable = false)
    private Integer patientID;
    @Column(name="doctorID", insertable = false,updatable = false)
    private Integer doctorID;

    /*BEGIN Constructors*/
    public Appointment() {
    }

//    public Appointment(Integer appointmentID, String apptStatus, Date apptStartDateTime, Date apptEndDateTime, Integer roomNum, String visitReason, Doctor doctor, Patient patient) {
//        this.appointmentID = appointmentID;
//        this.apptStatus = apptStatus;
//        this.apptStartDateTime = apptStartDateTime;
//        this.apptEndDateTime = apptEndDateTime;
//        this.roomNum = roomNum;
//        this.visitReason = visitReason;
//        this.doctor=doctor;
//        this.patient=patient;
//
//    }

    /*END Constructors*/

    /*BEGIN Getters and Setters*/
    public Integer getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(Integer appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getApptStatus() {
        return apptStatus;
    }

    public void setApptStatus(String apptStatus) {
        this.apptStatus = apptStatus;
    }

    public Date getApptStartDateTime() {
        return apptStartDateTime;
    }

    public void setApptStartDateTime(Date apptStartDateTime) {
        this.apptStartDateTime = apptStartDateTime;
    }

    public Date getApptEndDateTime() {
        return apptEndDateTime;
    }

    public void setApptEndDateTime(Date apptEndDateTime) {
        this.apptEndDateTime = apptEndDateTime;
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public String getVisitReason() {
        return visitReason;
    }

    public void setVisitReason(String visitReason) {
        this.visitReason = visitReason;
    }

    public Doctor getDoctor() {return doctor;}
    public void setDoctor(Doctor doctor){this.doctor=doctor;}

    public Patient getPatient() {return patient;}
    public void setPatient(Patient patient){this.patient=patient;}
    /*END Getters and Setters*/

}

