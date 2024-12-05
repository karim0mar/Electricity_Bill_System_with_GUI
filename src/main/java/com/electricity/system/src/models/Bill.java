package com.electricity.system.src.models;

import java.time.Instant;

public class Bill {
    private int billId;
    private int customerId;
    private double bill_amount;
    private long  issueDate;

    // Constructors
    public Bill() {}

    public Bill(int billId, int customerId, long issueDate) {
        this.billId = billId;
        this.customerId = customerId;
        this.issueDate = issueDate;
        setAmount();
    }

    // Getters and Setters
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return bill_amount;
    }

    public void setAmount() {
        long currentTime = Instant.now().getEpochSecond();
        this.bill_amount = currentTime - issueDate;
    }

    public long getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(long issueDate) {
        this.issueDate = issueDate;
    }
}

