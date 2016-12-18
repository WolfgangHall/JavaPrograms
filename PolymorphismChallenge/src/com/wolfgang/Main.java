package com.wolfgang;

class Car {
    private String name;
    private boolean hasEngine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.hasEngine = true;
    }

    public String startEngine() {
        return "Engine started";
    }

    public String accelerate() {
        return "Car accelerated";
    }

    public String brake() {
        return "You've hit the brakes";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

}

class Audi extends Car {
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Audi engine started";
    }

    @Override
    public String accelerate() {
        return "Audi accelerated";
    }

    @Override
    public String brake() {
        return "Audi brakes pressed";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Audi audi = new Audi("Audi A4", 10);
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());

        Ford ford = new Ford("Ford Mustang", 10);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
