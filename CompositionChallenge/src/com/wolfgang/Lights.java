package com.wolfgang;

/**
 * Created by johna on 12/16/2016.
 */
public class Lights {
    private int brightness;
    private String type;
    boolean isOn = false;

    public Lights(int brightness, String type, boolean isOn) {
        this.brightness = brightness;
        this.type = type;
        this.isOn = isOn;
    }

    public void turnOff() {
        if (this.isOn == true ) {
            this.isOn = false;
            this.brightness = 0;
            System.out.println("You've turned the lights off");
        } else {
            System.out.println("The lights are already out");
        }
    }

    public void turnOn() {
        if (this.isOn == false) {
            this.brightness = 5;
            this.isOn = true;
            System.out.println("The lights are now on");
        } else {
            System.out.println("The lights are already on");
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public String getType() {
        return type;
    }

    public boolean isOn() {
        return isOn;
    }
}
