package com.udemy.challenges.Section5;

public class C2_SpeedConverter {

    public static void main(String[] args) {

        // put any number as the argument
       double conversion = toMilesPerHour(43);

        printConversion(conversion);
    }

    public static long toMilesPerHour (double kilometersPerHour){

        long value = 0;

        if (kilometersPerHour < 0){
            value = -1L;
        }
        else if (kilometersPerHour > 0){
            //   1 mile per hour is 1.609 kilometers per hour
            value = Math.round(kilometersPerHour / 1.609);
        }
        return value;
    }



    public static void printConversion (double kilometersPerHour){
        long MPH = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour
                    + " km/h = "
                    + MPH
                    + " mi/h");
        }

    }
}
