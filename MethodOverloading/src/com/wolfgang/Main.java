package com.wolfgang;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Wolf", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);

        calculateScore();

        double convertedValue = calcFeetAndInchesToCentimeters(1, 2);
        System.out.println(convertedValue);

        double convertedInchesValue = calcFeetAndInchesToCentimers(10);
        System.out.println(convertedInchesValue);

    }

    public static int calculateScore( String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score)
    {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore()
    {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0 || inches > 12)) {
            return -1;
        }

        double inchesToCm = inches * 2.54;

        double feetToCm = (feet * 12) * 2.54;

        double conversionTotal = inchesToCm + feetToCm;

        return conversionTotal;
    }

    public static double calcFeetAndInchesToCentimers(double inches){
        if (inches < 0) {
            System.out.println("invalid feet or inches parameters");
            return -1;
        }

        double inchesToFeet = (int) inches / 12;
        double remainingInches = (int) inches % 12;


        return calcFeetAndInchesToCentimeters(inchesToFeet, remainingInches);
    }
}
