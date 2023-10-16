package com.example.demo.Controllers;

import com.example.demo.DTOs.AppointmentDTO;
import com.example.demo.Entities.Appointment;
import com.example.demo.Services.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
public class AppointmentController {

    public AppointmentService _apptService;

    public AppointmentController(AppointmentService apptService) {
        _apptService = apptService;
    }

    @GetMapping(value = "/api/appointments")
    public CompletableFuture<List<AppointmentDTO>> getAllAppointments() {
        return _apptService.findAll();
    }

    @GetMapping(value = "/api/appointments/{id}")
    public Appointment getAppointment(@PathVariable("id") int appointmentID) throws ExecutionException, InterruptedException {
        CompletableFuture<Appointment> future = _apptService.findByID(appointmentID);
        return future.get();
    }

    @GetMapping(value="/api/appointments/status/{apptStatus}")
    public CompletableFuture<List<AppointmentDTO>> getAppointmentsByStatus(@PathVariable("apptStatus") String apptStatus){
        return _apptService.findByApptStatus(apptStatus);
    }


    @PostMapping(value = "/api/appointments")
    public CompletableFuture<Appointment> postAppt(@RequestBody Appointment appt){
        return _apptService.createAppt(appt);
    }
}

//TODO - POST and PUT
//http://localhost:8080/appointments