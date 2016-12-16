package com.wolfgang;

/**
 * Created by johna on 12/15/2016.
 */
public class Fish extends Animal{
    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private int gills;
    private int eyes;
    private int fins;

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin() {

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
