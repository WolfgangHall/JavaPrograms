package com.wolfgang;

public class Main {

    public static void main(String[] args) {
	    Burger burger = new Burger("Basic", "White", "Sausage", 3.56);
	    double price = burger.itemizeBurger();
	    burger.addHamburgerAddition1("Tomato", 0.25);
	    burger.addHamburgerAddition2("Lettuce", 0.50);
	    burger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total Burger Price is " + burger.itemizeBurger());

        HealthyBurger healthyBurger = new HealthyBurger("Beef", 4.30);
        healthyBurger.addHamburgerAddition1("Tomato", 0.25);
        healthyBurger.addHealthAddition1("Lentils", 4.41);
        System.out.println("Total healthy burger price is " + healthyBurger.itemizeBurger());

    }
}
