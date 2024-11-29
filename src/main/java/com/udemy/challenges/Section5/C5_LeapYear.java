package com.udemy.challenges.Section5;

public class C5_LeapYear {

    public static void main(String[] args) {

        // put any number as the argument
        boolean ly = isLeapYear(2054);
        System.out.println(ly);
    }

    public static boolean isLeapYear(int year) {

        if (year <= 1 || year >= 9_999) {
            return false;
        }


        if (year % 4 == 0)
        {
            if (year % 100 != 0)
            {
                return true;
            }
            else
            {
                if (year % 400 == 0)
                {
                    return true;
                }
                else {
                    return false;
                }
            }

        }else {
            return false;
        }
    }
}
