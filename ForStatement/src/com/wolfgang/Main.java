package com.wolfgang;

public class Main {

    public static void main(String[] args) {

        // for(initialization; termination; increment)


        // String.format() allows you to format the number outcome to avoid the many zeroes
        for (int i = 2; i < 9; i++)
        {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

//        for (int i = 8; i > 1; i--)
//        {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
//        }

        int primeCounter = 0;
        for (int i = 2; i < 20; i++)
        {
            if(isPrime(i))
            {
                primeCounter ++;
                System.out.println(i + " is a prime number!");
                if (primeCounter == 5) {
                    System.out.println("exiting loop");
                    // break exits out of a for loop completely
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n)
    {
        // 1 is not a prime number
        if(n == 1) {
            return false;
        }

        // must start at 2 because prime numbers must be greater than 1
        // we divide n by 2 in order to avoid checking for numbers that we know will not divide evenly, as they are too large
        // if the remainder of that division is 0, it divides equally, meaning its not prime

        // can also be for(int i =2; i <= (long) Math.sqrt(n); i++)
        // optimizes for larger values
        for (int i = 2; i <= n/2; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount * ( interestRate / 100));
    }
}
