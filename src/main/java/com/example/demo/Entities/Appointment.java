package com.example.demo.Entities;

import jakarta.persistence.*;

import java.sql.Timestamp;


@Entity
@Table(name = "APPOINTMENT")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "appointmentID", unique = true, nullable = false)
    private Integer appointmentID;

    @Column(name = "apptStatus", unique=false,nullable = false)
    private String apptStatus;

    @Column(name = "apptStartDateTime", unique = false, nullable = false)
    private java.sql.Timestamp apptStartDateTime;

    @Column(name = "apptEndDateTime", unique = false, nullable = false)
    private java.sql.Timestamp apptEndDateTime;

    @Column(name = "roomNum", unique = false, nullable = false)
    private Integer roomNum;

    @Column(name = "visitReason", unique = false, nullable = false)
    private String visitReason;

    /* Add Relationships:
        Appointment:Patient = N:1
            -> add FK referencing PATIENT.patientID
        Appointment:Doctor = N:1
            -> add FK referencing DOCTOR.doctorID

    Unidirectional relationship: when we delete an appointment, it doesn't delete a patient
    Likewise, when we delete an appointment, it doesn't delete a doctor
     */

    /*BEGIN Constructors*/
    public Appointment(){}
    public Appointment(Integer appointmentID, String apptStatus, Timestamp apptStartDateTime, Timestamp apptEndDateTime, Integer roomNum, String visitReason) {
        this.appointmentID = appointmentID;
        this.apptStatus = apptStatus;
        this.apptStartDateTime = apptStartDateTime;
        this.apptEndDateTime = apptEndDateTime;
        this.roomNum = roomNum;
        this.visitReason = visitReason;
    }

    /*END Constructors*/

    /*BEGIN Getters and Setters*/
    //TODO - Figure out if a setter is needed for apptID
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

    public Timestamp getApptStartDateTime() {
        return apptStartDateTime;
    }

    public void setApptStartDateTime(Timestamp apptStartDateTime) {
        this.apptStartDateTime = apptStartDateTime;
    }

    public Timestamp getApptEndDateTime() {
        return apptEndDateTime;
    }

    public void setApptEndDateTime(Timestamp apptEndDateTime) {
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
    /*END Getters and Setters*/

}

