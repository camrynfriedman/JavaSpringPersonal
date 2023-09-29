package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "PERSON")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "personID", unique = true, nullable = false)
    private Integer personID;

    @Column(name = "fName", unique = false, nullable = false)
    private String fName;
    @Column(name = "lName", unique = false, nullable = false)
    private String lName;
    @Column(name = "SSN", unique = true, nullable = false)
    private String ssn;
    @Column(name = "DOB", unique = false, nullable = false)
    private java.sql.Date dob;
    @Column(name = "phoneNum", unique = true, nullable = false)
    private String phoneNum;
    @Column(name = "emailAddress", unique = true, nullable = false)
    private String emailAddress;
}