package com.wolfgang;

/**
 * Created by johna on 12/15/2016.
 */

// extends allows us to use Animal state and behavior
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat){
        // super keyword allows us to access constructor from the parent/super class
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    // override method from the parent class
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        // calls Animal.eat class
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        // better to call move as opposed to super.move in case of potential override
        // because move method now exists in this class, it uses the Dog class move
        move(5);
    }


    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dpg.moveLegs() was called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
