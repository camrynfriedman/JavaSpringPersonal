package com.example.demo.Services;

import com.example.demo.DTOs.AppointmentDTO;
import com.example.demo.Entities.Appointment;
import com.example.demo.Repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

/*
Uses DTO
 */
@Service
public class AppointmentService {
    private final AppointmentRepository _apptRepo;

    @Autowired
    public AppointmentService(AppointmentRepository apptRepo) {
        _apptRepo = apptRepo;
    }


    // HELPER METHOD TO MAP ENTITY TO DTO
    private AppointmentDTO convertToDto(Appointment appt) {
        return new AppointmentDTO(
                appt.getAppointmentID(),
                appt.getApptStatus(),
                appt.getApptStartDateTime(),
                appt.getApptEndDateTime(),
                appt.getRoomNum(),
                appt.getVisitReason(),
                    appt.getDoctor(),
                    appt.getPatient());
    }

    @Async
    public CompletableFuture<List<AppointmentDTO>> findAll() {
        List<Appointment> entityList = _apptRepo.findAll();

        //create list to store DTOs
        //convert to DTO
        List<AppointmentDTO> dtoList = entityList.stream().map(this::convertToDto).toList();
        return CompletableFuture.completedFuture(dtoList);
    }

    // TODO - maybe make this use DTO
    @Async
    public CompletableFuture<Appointment> findByID(int id) {
        Optional<Appointment> apptOp = _apptRepo.findById(id);
        if (apptOp.isPresent()) {
            return CompletableFuture.completedFuture(apptOp.get());
        }
        return CompletableFuture.completedFuture(null);
    }
    @Async
    public CompletableFuture<List<AppointmentDTO>> findByApptStatus(String apptStatus) {
        List<Appointment> entityList = _apptRepo.findByApptStatus(apptStatus);
        List<AppointmentDTO> dtoList = entityList.stream().map(this::convertToDto).toList();
        return CompletableFuture.completedFuture(dtoList);
    }

    @Async
    public CompletableFuture<Appointment> createAppt(Appointment appt){
        return CompletableFuture.completedFuture(_apptRepo.save(appt));
    }

    //TODO - put (get record, update it, save it)
    @Async
    public CompletableFuture<Appointment> updateAppt(Integer apptID, Appointment updatesAppt){
            //get record
            Optional<Appointment> apptOp = _apptRepo.findById(apptID);
            if (apptOp.isPresent()){
                //convert Optional<appointment> to just Appointment
                Appointment appt = apptOp.get();
                //update record
                appt.setAppointmentID(updatesAppt.getAppointmentID());
                appt.setApptStatus(updatesAppt.getApptStatus());
                appt.setApptStartDateTime(updatesAppt.getApptStartDateTime());
                appt.setApptEndDateTime(updatesAppt.getApptEndDateTime());
                appt.setRoomNum(updatesAppt.getRoomNum());
                appt.setVisitReason(updatesAppt.getVisitReason());
                appt.setDoctor(updatesAppt.getDoctor());
                appt.setPatient(updatesAppt.getPatient());
                //save record
                _apptRepo.save(appt);
                return CompletableFuture.completedFuture(appt);
            }
            return CompletableFuture.completedFuture(null);

    }
}
//USE MAP-REDUCE TO CONVERT ENTITIES TO DTOs
//USE ASYNC