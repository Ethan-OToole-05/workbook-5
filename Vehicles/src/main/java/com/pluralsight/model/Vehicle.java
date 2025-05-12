package com.pluralsight.model;

public class Vehicle {
    protected int vin;
    protected int speed;
    protected int fuelCapacity;
    protected int numberOfPassengers;
    protected String make;
    protected String color;
    protected int cargoCapacity;

    public Vehicle(int vin, int speed, int fuelCapacity, int numberOfPassengers, String make, String color, int cargoCapacity) {
        this.vin = vin;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.numberOfPassengers = numberOfPassengers;
        this.make = make;
        this.color = color;
        this.cargoCapacity = cargoCapacity;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuel) {
        this.fuelCapacity = fuel;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }


    public static void startEngine() {
        //engine will turn on
    }

    public static void drive() {
        //starts driving.
    }

    @Override
    public String toString() {
        return String.format("Vin: %d | Speed: %d | Fuel Capacity: %d | Number of Passengers: %d | Make: %s | Color: %s | Cargo Capacity: %d ", vin, speed, fuelCapacity, numberOfPassengers, make, color, cargoCapacity);
    }
}
