package com.example.demo.Entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "PERSON")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "personID")
    private Integer personID;
    @Column(name = "fName")
    private String fName;
    @Column(name = "lName")
    private String lName;
    @Column(name = "SSN")
    private String ssn;
    @Column(name = "DOB")
    private java.sql.Date dob;
    @Column(name = "phoneNum")
    private String phoneNum;
    @Column(name = "emailAddress")
    private String emailAddress;

    public Person() {
    }

    public Person(Integer personID, String fName, String lName, String ssn, Date dob, String phoneNum, String emailAddress) {
        this.personID = personID;
        this.fName = fName;
        this.lName = lName;
        this.ssn = ssn;
        this.dob = dob;
        this.phoneNum = phoneNum;
        this.emailAddress = emailAddress;
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Date getDOB() {
        return dob;
    }

    public void setDOB(Date DOB) {
        this.dob = DOB;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
