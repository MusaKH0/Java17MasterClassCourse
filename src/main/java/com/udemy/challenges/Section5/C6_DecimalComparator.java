package com.udemy.challenges.Section5;

public class C6_DecimalComparator {

    public static void main(String[] args) {

        // put any number as the argument
        boolean checkEquality = areEqualByThreeDecimalPlaces(835.099, 835.099);
    }

    public static boolean areEqualByThreeDecimalPlaces (double one, double two) {

        if ((long) (one * 1000) == (long) (two * 1000)){
            return true;
        }
        else return false;


    }
}
