package com.example.meditrack.util;

import java.time.LocalDateTime;

import com.example.meditrack.entity.Doctor;
import com.example.meditrack.entity.Patient;
import com.example.meditrack.exception.InvalidDataException;

public class Validator {
    public Validator(){
    }

    public static void validateName(String name){
        if(name == null || name.isEmpty()){
            throw new InvalidDataException("Name cannot be empty");
        }
    }
    public static void validateAge(int age){
        if(age < 0){
            throw new InvalidDataException("Age cannot be less than 0");
        }
    }
    public static void validateEmail(String email){
        if(email == null || email.isEmpty()){
            throw new InvalidDataException("Email cannot be empty");
        }
        
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if(!email.matches(emailRegex)){
            throw new InvalidDataException("Invalid email format");
        }
    }
    public static void validateFee(double fee){
        if(fee < 0){
            throw new InvalidDataException("Fee cannot be less then 0");
        }
    }
    public static void validatePhoneNumber(String phoneNumber){
        if(phoneNumber == null || phoneNumber.isEmpty()){
            throw new InvalidDataException("Phone number cannot be empty");
        }
        
        String phoneRegex = "^[\\d\\-\\+\\s()]{10,}$";
        if(!phoneNumber.matches(phoneRegex)){
            throw new InvalidDataException("Invalid phone number format");
        }
    }
    public static void validatePatient(Patient patient) {
        if(patient == null) {
         throw new InvalidDataException("Patient cannot be null.");
        }
        Validator.validateName(patient.getName());
        Validator.validateAge(patient.getAge());
        Validator.validatePhoneNumber(patient.getPhoneNumber());
        Validator.validateEmail(patient.getEmail());
    }
    
    public static void validateDoctor(Doctor doctor) {
        if(doctor == null) {
            throw new InvalidDataException("Doctor cannot be null.");
        }
        Validator.validateName(doctor.getName());
        Validator.validateAge(doctor.getAge());
        Validator.validatePhoneNumber(doctor.getPhoneNumber());
        Validator.validateEmail(doctor.getEmail());
        validateFee(doctor.getFee());
    }

    public static void validateAppointmentTime(LocalDateTime appointmentTime) {
        if(appointmentTime == null) {
            throw new InvalidDataException("Appointment time cannot be null.");
        }
        if(appointmentTime.isBefore(LocalDateTime.now())) {
            throw new InvalidDataException("Appointment time cannot be in the past.");
        }
    }
    
}
