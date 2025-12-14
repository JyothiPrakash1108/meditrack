package com.example.meditrack.entity;

import java.time.LocalDateTime;

public class BillSummary {
    private final String billId;
    private final String patientId;
    private final double totalAmount;
    private final LocalDateTime createdOn;

    public BillSummary(String billId, LocalDateTime createdOn, String patientId, double totalAmount) {
        this.billId = billId;
        this.createdOn = createdOn;
        this.patientId = patientId;
        this.totalAmount = totalAmount;
    }

    public String getBillId() {
        return billId;
    }

    public String getPatientId() {
        return patientId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

}
