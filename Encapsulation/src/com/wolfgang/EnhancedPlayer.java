package com.wolfgang;

/**
 * Created by johna on 12/16/2016.
 */
public class EnhancedPlayer {
    private String name;
    // sets health to 100 if the if statement in the constructor is not satisfied
    // also called hitPoints, our internal name is different from the ones outsiders will see
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;

        if (this.hitPoints <= 0) {
            System.out.println("The player is knocked out");
            // reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
