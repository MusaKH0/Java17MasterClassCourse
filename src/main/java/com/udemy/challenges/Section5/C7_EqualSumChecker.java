package com.udemy.challenges.Section5;

public class C7_EqualSumChecker {

    public static void main(String[] args) {


        boolean checkSum = hasEqualSum(2,5,8);
        System.out.println(checkSum);
    }

    public static boolean hasEqualSum(int num1, int num2, int sumOfNum1AndNum2) {

        if( num1 + num2 != sumOfNum1AndNum2){
            return false;
        }
        else return true;
    }
}
