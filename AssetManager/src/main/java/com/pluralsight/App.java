package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("test house", "05-13-2025", 1234567, "123 Example Street", 1, 750, 350));
        assets.add(new House("test house", "05-13-2025", 1234567, "123 Example Street", 1, 750, 350));
    }
}
