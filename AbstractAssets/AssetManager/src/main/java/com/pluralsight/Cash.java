package com.pluralsight;

public class Cash extends Asset{
    private double amount;

    public Cash(String description, String dateAcquired, double originalCost, double amount) {
        super(description, dateAcquired, originalCost);
        this.amount = amount;
    }

    @Override
    public double getValue() {
        return this.amount;
    }
}
