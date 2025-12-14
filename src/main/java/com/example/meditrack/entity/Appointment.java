package com.example.meditrack.entity;

import java.time.LocalDateTime;

import com.example.meditrack.constants.AppointmentStatus;

public class Appointment {
    private String appointmentId;
    private String patientId;
    private String doctorId;
    private LocalDateTime appointmentTime;
    private AppointmentStatus status;

    public Appointment(String appointmentId, LocalDateTime appointmentTime, String doctorId, String patientId, AppointmentStatus status) {
        this.appointmentId = appointmentId;
        this.appointmentTime = appointmentTime;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.status = status;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }
    
    
}
