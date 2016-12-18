package com.wolfgang;

public class Main {

    public static void main(String[] args) {
	    Burger burger = new Burger("Basic", "White", "Sausage", 3.56);
	    double price = burger.itemizeBurger();
	    burger.addHamburgerAddition1("Tomato", 0.25);
	    burger.addHamburgerAddition2("Lettuce", 0.50);
	    burger.addHamburgerAddition3("Cheese", 1.12);
//        burger.addHamburgerAddition4("Mushrooms", 0.75);
        System.out.println("Total Burger Price is " + burger.itemizeBurger());

    }
}
