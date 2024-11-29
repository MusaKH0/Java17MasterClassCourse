package com.udemy.projects.P39;

public class OperatorPrecedenceAndChallenge {
    public static void main(String[] args) {

        double n1 = 20.00;
        double n2 = 80.00;

        double multiplyNums = (n1 + n2) * 100.00;
        System.out.println("Values total: " + multiplyNums);

        double remainder = multiplyNums % 40.00;
        System.out.println("Remainder is: " + remainder);

        boolean bool = (remainder == 0) ? true : false;

        System.out.println(bool);

        if (!bool){
            System.out.println("got some remainder");
        }
    }
}