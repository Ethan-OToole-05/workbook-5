package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("test house", "05-13-2025", 1234567, "123 Example Street", 1, 750, 350));
        assets.add(new House("test house", "05-13-2025", 1234, "123 Example Street", 2, 750, 350));

        assets.add(new Vehicle("test car", "05-12-2025", 75000, "Honda Civic", 2025, 5));
        assets.add(new Vehicle("test car", "05-12-2025", 35000, "Honda Civic", 2019, 125000));
        assets.add(new Vehicle("test car", "05-12-2025", 35000, "Pagani Zonda", 2019, 125000));

        for (Asset asset : assets) {
            if (asset instanceof House house) {
                System.out.println(house);
            } else if (asset instanceof Vehicle vehicle) {
                System.out.println(vehicle);
            }
//            System.out.println(asset);
        }


    }
}
