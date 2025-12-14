package com.example.meditrack.entity;

public class Patient extends Person{

    private String medicalHistory;
    
    public Patient(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
    public Patient(String name, int age, String phoneNumber, String email, String medicalHistory) {
        super(name, age, phoneNumber, email);
        this.medicalHistory = medicalHistory;
    }
    public Patient(String id,String name, int age, String phoneNumber, String email, String medicalHistory) {
        super(id,name, age, phoneNumber, email);
        
        this.medicalHistory = medicalHistory;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Patient{");
        sb.append("medicalHistory=").append(medicalHistory);
        sb.append('}');
        return sb.toString();
    }

}
