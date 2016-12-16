package com.wolfgang;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("boat", "white", "Bwoooonk, Bwooonk",
                15, 100_000, 35);

        Car car1 = new Car("Car", "red", "Beep Beep",
                10, 25_000, 0, "Ford", "mustang", 6);

        car1.changeGears(3);
        car1.changeGears(-2);

        Convertible convertible1 = new Convertible("Convertible Car", "black", "Honk Honk", 7, 30_000, 0, "Porsche", "Cayenne", 7);
        convertible1.changeGears(1);
        convertible1.openRoof();
    }
}
