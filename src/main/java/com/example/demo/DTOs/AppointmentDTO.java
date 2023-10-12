package com.example.demo.DTOs;


import com.example.demo.Entities.Doctor;
import com.example.demo.Entities.Patient;

import java.util.Date;


public class AppointmentDTO {

    private Integer appointmentID;
    private String apptStatus;
    private java.util.Date apptStartDateTime;
    private java.util.Date apptEndDateTime;
    private Integer roomNum;
    private String visitReason;
    private Doctor doctor;
    private Patient patient;


    /* Add Relationships:
        Appointment:Patient = N:1
            -> add FK referencing PATIENT.patientID
        Appointment:Doctor = N:1
            -> add FK referencing DOCTOR.doctorID

    Unidirectional relationship: when we delete an appointment, it doesn't delete a patient
    Likewise, when we delete an appointment, it doesn't delete a doctor
     */

    /*BEGIN Constructors*/
    public AppointmentDTO() {
    }

    public AppointmentDTO(Integer appointmentID, String apptStatus, Date apptStartDateTime, Date apptEndDateTime, Integer roomNum, String visitReason, Doctor doctor, Patient patient) {
        this.appointmentID = appointmentID;
        this.apptStatus = apptStatus;
        this.apptStartDateTime = apptStartDateTime;
        this.apptEndDateTime = apptEndDateTime;
        this.roomNum = roomNum;
        this.visitReason = visitReason;
            this.doctor = doctor;
            this.patient=patient;
    }
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
