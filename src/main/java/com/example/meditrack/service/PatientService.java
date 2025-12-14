package com.example.meditrack.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.meditrack.entity.Patient;
import com.example.meditrack.exception.InvalidDataException;
import com.example.meditrack.interfaces.IdStrategy;
import com.example.meditrack.util.DataStore;
import com.example.meditrack.util.Validator;

public class PatientService {
    private DataStore<Patient> patientStore;
    private IdStrategy idStrategy ;
    public PatientService(DataStore<Patient> patienStore,IdStrategy idStrategy){
        this.patientStore = patienStore;
        this.idStrategy = idStrategy;
    }
    public Patient addPatient(String name,int age,String phoneNumber,String email,String medicalPrescription){
        String id = idStrategy.generate();
        Validator.validateAge(age);
        Validator.validateEmail(email);
        Validator.validateName(name);
        Validator.validatePhoneNumber(phoneNumber);
        Patient createdPatient = new Patient(id, name, age, phoneNumber, email,medicalPrescription);
        patientStore.add(id, createdPatient);
        return createdPatient;
    }
    public Optional<Patient> searchPatientById(String id){
        return patientStore.getById(id);
    }
    public List<Patient> searchPatient(String name){
        Validator.validateName(name);
        List<Patient> result = new ArrayList<>();
        for(Patient patient : patientStore.getAll()){
            if (patient.getName().equalsIgnoreCase(name)) {
            result.add(patient);
            }
        }
        return result;
    }
    public boolean deletePatientById(String id) {
        Optional<Patient> patientOpt = patientStore.getById(id);
    
        if(patientOpt.isPresent()) {
            patientStore.remove(id);
         return true;
        } else {
            throw new InvalidDataException("Patient with ID " + id + " not found.");
        }
    }
    
}
