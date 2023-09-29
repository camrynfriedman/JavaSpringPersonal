package com.example.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "DOCTOR")
public class Doctor extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "doctorID", unique = true, nullable = false)
    private Integer doctorID;

    @Column(name = "licenseID", unique = true, nullable = false)
    private Integer licenseID;

    @Column(name = "specialty", unique = false, nullable = false)
    private String specialty;

}