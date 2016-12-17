package com.wolfgang;

public class Main {

    // Encapsulation is the mechanism that allows you to restrict access to certain componenets
    // guards against unauthorized access from classes and code
    // allows you to change things without breaking code elsewhere

    public static void main(String[] args) {
	    Player player = new Player();
	    // because we want to access these fields directly, we have to make changes in multiple places
		// this is no good
		//  we also have no validations on our data
		//  the health can be set to an astronomical number
	    player.fullName = "Wolf";
	    player.health = 20;
	    player.weapon = "Sword";

	    int damage = 10;
	    player.loseHealth(damage);
        System.out.println("Reamining health = " + player.healthRemaining());

        damage = 11;
        // this is dangerous because we can take control over the player class and set
		//    fields here directly -> we want this process controlled
        player.health = 100;
        player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining());


		EnhancedPlayer player2 = new EnhancedPlayer("Matt", 200, "Bow");
		System.out.println("Initial health is " + player2.getHealth());
	}
}
