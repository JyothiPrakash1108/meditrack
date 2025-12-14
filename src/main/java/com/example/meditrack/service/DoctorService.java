package com.example.meditrack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.meditrack.entity.Doctor;
import com.example.meditrack.exception.InvalidDataException;
import com.example.meditrack.interfaces.IdStrategy;
import com.example.meditrack.util.DataStore;
import com.example.meditrack.util.Validator;

public class DoctorService {
    private DataStore<Doctor> doctorStore;
    private IdStrategy idStrategy;

    public DoctorService(DataStore<Doctor> doctorStore, IdStrategy idStrategy){
        this.doctorStore = doctorStore;
        this.idStrategy = idStrategy;
    }
    public Doctor addDoctor(String name, int age, String phoneNumber, String email,
                        String specialization, double fee) {
        Validator.validateName(name);
        Validator.validateAge(age);
        Validator.validatePhoneNumber(phoneNumber);
        Validator.validateEmail(email);
        Validator.validateFee(fee);
        String id = idStrategy.generate();
        Doctor doctor = new Doctor(id, name, age, phoneNumber, email, specialization, fee);
        doctorStore.add(id, doctor);
        return doctor;
    }
    public Optional<Doctor> searchDoctorById(String id){
        return doctorStore.getById(id);
    }
    public List<Doctor> searchDoctorByName(String name){
        List<Doctor> result = new ArrayList<>();
        for(Doctor doctor : doctorStore.getAll()){
            if(doctor.getName().toLowerCase().contains(name.toLowerCase())){
                result.add(doctor);
            }
        }
        return result;
    }
    public boolean deleteDoctorById(String id){
        Optional<Doctor> doctorOpt = doctorStore.getById(id);
        if(doctorOpt.isPresent()){
            doctorStore.remove(id);
            return true;
        } 
        else {
            throw new InvalidDataException("Doctor with ID " + id + " not found.");
        }
    }

}
