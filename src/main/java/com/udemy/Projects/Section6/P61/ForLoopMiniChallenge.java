package com.udemy.Projects.Section6.P61;

public class ForLoopMiniChallenge {

    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10_000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        // Mini Challenge starts here
        for (double counter = 7.5; counter <= 10; counter+= 0.25) {
            System.out.println(counter);
        }

        for (double rate = 7.5; rate <= 10; rate+= 0.25) {
            double interestAmount = calculateInterest(100, rate);
            System.out.println("100 at " + rate + "% interest = " + interestAmount);
        }

    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
