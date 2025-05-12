package com.pluralsight;

import com.pluralsight.model.*;

public class App {
    public static void main(String[] args) {
        Moped slowRide = new Moped(5076, 50, 46, 2, "Honda", "Blue", 123);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        System.out.println(slowRide);
    }
}
