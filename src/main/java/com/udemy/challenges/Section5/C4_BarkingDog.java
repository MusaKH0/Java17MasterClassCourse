package com.udemy.challenges.Section5;

public class C4_BarkingDog {

    public static void main(String[] args) {

        // put any number as the argument
        boolean wake = shouldWakeUp(true, 23);
        System.out.println(wake);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){


        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }

        if (barking && hourOfDay < 8 || hourOfDay > 22){
            return true;
        }
        return false;

    }
}
