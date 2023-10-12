package com.example.demo.Repositories;

import com.example.demo.Entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
We can use JpaRepository’s methods in addition to custom ones
save(), findOne(), findById(), findAll(), count(), delete(), deleteById()… without implementing them
*/
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    List<Appointment> findByApptStatus(String apptStatus);

}

