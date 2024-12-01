package com.udemy.Projects.Section6.P62;

public class ForLoopChallenge {

    public static void main(String[] args) {

        int counter = 0;

        for (int i = 10; i <= 50; i++){
            boolean prime = isPrime(i);
            if (prime){
                System.out.println("Number " + i + " is a prime number.");
                counter ++;
            }
            else if (counter == 3) {
                System.out.println("counted 3 prime numbers. Stopping.");
                break;
            }
        }

    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

}
