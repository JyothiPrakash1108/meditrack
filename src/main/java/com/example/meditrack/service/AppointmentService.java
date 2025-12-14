package com.example.meditrack.service;

import java.time.LocalDateTime;

import com.example.meditrack.constants.AppointmentStatus;
import com.example.meditrack.entity.Appointment;
import com.example.meditrack.entity.Doctor;
import com.example.meditrack.entity.Patient;
import com.example.meditrack.interfaces.IdStrategy;
import com.example.meditrack.util.DataStore;
import com.example.meditrack.util.Validator;

public class AppointmentService {
    private DataStore<Appointment> appointmentStore;
    private IdStrategy idStrategy;
    
    public AppointmentService(DataStore<Appointment> appointmentStore, IdStrategy idStrategy){
        this.appointmentStore = appointmentStore;
        this.idStrategy = idStrategy;
    }
    public Appointment createAppointment(Patient patient, Doctor doctor, LocalDateTime appointmentTime){
        Validator.validatePatient(patient);
        Validator.validateDoctor(doctor);
        Validator.validateAppointmentTime(appointmentTime);
        String id = idStrategy.generate();
        Appointment appointment = new Appointment(id, appointmentTime,doctor.getId(),patient.getId(), AppointmentStatus.PENDING);
        appointmentStore.add(id, appointment);
        return appointment;
    }

}
