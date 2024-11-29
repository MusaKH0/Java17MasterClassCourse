package com.udemy.challenges.Section5;

public class C1_PositiveNegativeZero {

    public static void main(String[] args) {

        // put any number as the argument
        checkNumber(6);
    }

    public static void checkNumber (int number){
        if (number > 0){
            System.out.println("positive");
        }
        else if (number < 0){
            System.out.println("negative");
        }
        else if (number == 0){
            System.out.println("zero");
        }
    }

}
