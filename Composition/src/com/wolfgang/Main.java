package com.wolfgang;

public class Main {

    // composition models parts of the greater whole
	// if you're asking yourself "HAS A?" use composition
	// generally want to use composition first but it does depend on the solution
	// if you're asking yourself "IS A?" use inheritance

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);

	    Monitor theMonitor = new Monitor("Chromebook", "Google", 27, new Resolution(2540, 1440));
	    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

	    // created PC class by passing 3 objects into our PC constructor
	    PC thePC = new PC(theCase, theMonitor, theMotherboard);
	    // we can access methods and variable from our various objects by accessing the returned object in our getter
		thePC.powerUp();

    }
}
