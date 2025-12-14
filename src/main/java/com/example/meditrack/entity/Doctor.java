package com.example.meditrack.entity;

public class Doctor extends Person{
    private String specialization;
    private double fee;
    
    
    public Doctor(String name, int age, String phoneNumber, String email, String specialization,double fee) {
        super(name, age, phoneNumber, email);
        this.specialization = specialization;
        this.fee = fee;
    }
      public Doctor(String id,String name, int age, String phoneNumber, String email, String specialization,double fee) {
        super(id,name, age, phoneNumber, email);
        this.specialization = specialization;
        this.fee = fee;
    }
    public Doctor(String specialization, double fee) {
         this(null, 0, null, null, specialization, fee);
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
