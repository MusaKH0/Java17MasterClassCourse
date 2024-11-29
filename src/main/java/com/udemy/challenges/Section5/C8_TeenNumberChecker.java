package com.udemy.challenges.Section5;

public class C8_TeenNumberChecker {

    public static void main(String[] args) {


        boolean checkTeen = hasTeen(15, 57, 63) == isTeen(15);

        System.out.println(checkTeen);
    }

    public static boolean hasTeen(int n1, int n2, int n3) {
        if ((n1 >= 13 && n1 <= 19) || (n2 >= 13 && n2 <= 19) || (n3 >= 13 && n3 <= 19)) {
            return true;
        }
        else return false;
    }

    public static boolean isTeen(int n1) {
        if (n1 >= 13 && n1 <= 19) {
            return true;
        }
        else return false;
    }
}
