package com.example.meditrack.entity;

public class Bill {
    private String id;
    private Patient patient;
    private Doctor doctor;
    private double taxRate; // from Constants
    private double totalAmount;
    
    public Bill(String id, Patient patient, Doctor doctor, double taxRate){
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.taxRate = taxRate;
        this.totalAmount = calculateTotal();
    }

    public Bill(Doctor doctor, String id, Patient patient, double taxRate, double totalAmount) {
        this.doctor = doctor;
        this.id = id;
        this.patient = patient;
        this.taxRate = taxRate;
        this.totalAmount = totalAmount;
    }
    private double calculateTotal(){
        double fee = doctor.getFee();
        return fee + (fee * taxRate);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
}
