package com.example.demo.Repositories;

import com.example.demo.Entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
We can use JpaRepository’s methods in addition to custom ones
save(), findOne(), findById(), findAll(), count(), delete(), deleteById()… without implementing them
*/
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    //TODO - figure out if I need to create my own methods in addition to the ones I'll implicitly use from JPA repo (reference https://www.bezkoder.com/spring-boot-jpa-crud-rest-api/ at "Create Repository Interface"
//ADD CUSTOM QUERY
}
