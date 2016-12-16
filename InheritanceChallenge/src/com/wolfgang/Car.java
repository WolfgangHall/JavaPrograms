package com.wolfgang;

/**
 * Created by johna on 12/15/2016.
 */
public class Car  extends Vehicle{

    private String make;
    private String model;
    private int gears;
    private int currentGear;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getGears() {
        return gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public Car(String type, String color, String hornSound, int hornVolume, int price, int speed, String make, String model, int gears) {
        super(type, color, hornSound, hornVolume, price, 0);
        this.make = make;
        this.model = model;
        this.gears = gears;
        this.currentGear = 0;
    }

    public void changeGears(int gearIncrement) {

        if (gearIncrement + this.currentGear > this.gears) {
            System.out.println("You can't go beyond " + this.gears + " gear(s)");
        }

        if (gearIncrement + this.currentGear < 0) {
            System.out.println("You can't go below 0 gears");
        }

        if (gearIncrement > 0) {
            System.out.println("You have increased your gears");
            super.accelerate(gearIncrement * 20);
            this.gears += gearIncrement;
        } else if (gearIncrement < 0) {
            System.out.println("You have decreased the number of gears");
            super.decelerate(gearIncrement * 20);
            this.gears += gearIncrement;
        } else {
            System.out.println("No gear change");
        }
    }

    @Override
    public void move() {
        System.out.println("Your vehicle is on the road");
    }
}
