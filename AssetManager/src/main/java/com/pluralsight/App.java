package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("test house", "05-13-2025", 1234567, "123 Example Street", 1, 750, 350));
        assets.add(new House("test house", "05-13-2025", 1234, "123 Example Street", 1, 750, 350));

        assets.add(new Vehicle("test car", "05-12-2025", 75000, "Honda Civic", 2025, 5));
        assets.add(new Vehicle("test car", "05-12-2025", 35000, "Honda Civic", 2019, 75000));

        for (Asset asset : assets) {

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println(house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println(vehicle.getYear() + " " + vehicle.getMakeModel());
            }
//            System.out.println(asset);
        }


    }
}
