package com.wolfgang;

/**
 * Created by johna on 12/15/2016.
 */
public class Convertible extends Car {

    public void openRoof() {
        System.out.println("You have opened the roof up");
    }

    public Convertible(String type, String color, String hornSound, int hornVolume, int price, int speed, String make, String model, int gears) {
        super(type, color, hornSound, hornVolume, price, speed, make, model, gears);
    }
}
