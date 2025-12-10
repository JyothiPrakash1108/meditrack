package com.example.meditrack.entity;

public class Doctor {
    private String specialization;
    private double fee;
    
    public Doctor() {
    }
    public Doctor(String specialization, double fee) {
        this.specialization = specialization;
        this.fee = fee;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    
}
