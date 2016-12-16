package com.wolfgang;

/**
 * Created by johna on 12/15/2016.
 */
public class Vehicle {

    private String type;
    private String color;
    private String hornSound;
    private int hornVolume;
    private int price;
    private int speed;

    public Vehicle(String type, String color, String hornSound, int hornVolume, int price, int speed){
        this.type = type;
        this.color = color;
        this.hornSound = hornSound;
        this.hornVolume = hornVolume;
        this.price = price;
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getHornSound() {
        return hornSound;
    }

    public int getHornVolume() {
        return hornVolume;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int accelerationSpeed) {
        this.speed += accelerationSpeed;
        System.out.println("You've accelerated by " + accelerationSpeed);
        System.out.println("You're now going " + this.speed);
    }

    public void decelerate(int decelerationSpeed) {
        this.speed += decelerationSpeed;
        System.out.println("You've decelerated by " + decelerationSpeed);
        System.out.println("You're now going " + this.speed);
    }

    public void move(){
        System.out.println("Your vehicle is on the move!");
    }

    public void honkHorn(String hornSound, int hornVolume){
        System.out.println("You have honked the horn at " + hornVolume + "." + hornSound + "!");
    }
}
