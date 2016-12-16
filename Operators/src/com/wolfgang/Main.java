package com.wolfgang;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        result++;
        System.out.println("Result is now: " + result);

        result--;
        System.out.println("Result is now: " + result);

        result +=  2;
        System.out.println("Result is now: " + result);

        result -= 1;
        System.out.println("Result is now: " + result);

        result /=  2;
        System.out.println("Result is now: " + result);

        result *=  2;
        System.out.println("Result is now: " + result);

        // one equal sign is an assignment
        boolean isAlien = false;

        // two equal signs represents equality
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 99;
        if (topScore == 100)
            System.out.println("You've got the high score");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        boolean isCar = false;
        if(isCar)
            System.out.println("This is a car");

        // ternary operator
        boolean wasCar = isCar ? true : false;



        double firstVal = 20d;
        double secondVal = 80d;
        double resultVal = (firstVal + secondVal) * 25d;
        System.out.println(resultVal);
        double remainderVal = resultVal % 40d;
        System.out.println(remainderVal);

        if (remainderVal <= 20)
            System.out.println("Total was over the limit");
    }
}
