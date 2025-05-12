package com.pluralsight;

public class Moped extends Vehicle {

    @Override
    public String toString() {
        return String.format(color + " " + fuelCapacity);
    }
}
