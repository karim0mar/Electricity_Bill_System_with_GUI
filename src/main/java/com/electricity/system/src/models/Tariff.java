package com.electricity.system.src.models;

public class Tariff {
    private String region;
    private double ratePerUnit;

    // Constructors
    public Tariff() {
    }

    public Tariff(String region, double ratePerUnit) {
        this.region = region;
        this.ratePerUnit = ratePerUnit;
    }

    // Getters and Setters
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getRatePerUnit() {
        return ratePerUnit;
    }
    public void setRatePerUnit(double ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }
}
