package com.example.demo.Services;

import com.example.demo.Entities.Appointment;
import com.example.demo.Repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
Uses DTO
 */
@Service
public class AppointmentService {
    @Autowired //TODO - figure out what autowired means (dependency injection) MOVE TO CONSTRUCTOR
    private AppointmentRepository _apptRepo;

        public AppointmentService(AppointmentRepository apptRepo){
            _apptRepo=apptRepo;
        }

        public List<Appointment> findAll(){
            return _apptRepo.findAll();
        }

        public Appointment findByID(int id){
            Optional<Appointment> apptOp = _apptRepo.findById(id);
            if (apptOp.isPresent()) {
                return apptOp.get();
            }
                return null;

        }
}
//USE MAP-REDUCE TO CONVERT ENTITIES TO DTOs
//USE ASYNC