package com.example.demo.Controllers;

import com.example.demo.Entities.Appointment;
import com.example.demo.Repositories.AppointmentRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
//TODO - figure out if I need a requestMapping annotation here
public class AppointmentController {

    private final AppointmentRepository apptRepo;

    public AppointmentController(AppointmentRepository apptRepo) {
        this.apptRepo = apptRepo;
    }

    @GetMapping(value="/appointments")
    public List<Appointment> getAllAppointments(){
        return apptRepo.findAll();
    }

    @GetMapping(value="/appointments/{id}")
    public Optional<Appointment> getAppointment(@PathVariable("id") int appointmentID){
        return apptRepo.findById(appointmentID);
    }
}
