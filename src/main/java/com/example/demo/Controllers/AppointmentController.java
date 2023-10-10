package com.example.demo.Controllers;

import com.example.demo.Entities.Appointment;
import com.example.demo.Repositories.AppointmentRepository;
import com.example.demo.Services.AppointmentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
//TODO - figure out if I need a requestMapping annotation here
public class AppointmentController {

    public AppointmentService _apptService;

    public AppointmentController(AppointmentService apptService) {
        _apptService = apptService;
    }

    @GetMapping(value="/appointments")
    public List<Appointment> getAllAppointments(){
       return _apptService.findAll();
    }

    @GetMapping(value="/appointments/{id}")
    public Appointment getAppointment(@PathVariable("id") int appointmentID){
        return _apptService.findByID(appointmentID);
    }
}

//POST and PUT
//http://localhost:8080/appointments