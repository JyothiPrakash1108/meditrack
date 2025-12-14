package com.example.meditrack.service;

import com.example.meditrack.entity.Patient;
import com.example.meditrack.interfaces.IdStrategy;
import com.example.meditrack.util.DataStore;
import com.example.meditrack.util.Validator;

public class PatientService {
    private DataStore<Patient> patientStore;
    private IdStrategy idStrategy ;
    public Patient createPatient(String name,int age,String phoneNumber,String email,String medicalPrescription){
        String id = idStrategy.generate();
        Validator.vali
        Patient createdPatient = new Patient(id, name, age, phoneNumber, email,medicalPrescription);
        patientStore.add(id, createdPatient);
        return createdPatient;
    }
}
