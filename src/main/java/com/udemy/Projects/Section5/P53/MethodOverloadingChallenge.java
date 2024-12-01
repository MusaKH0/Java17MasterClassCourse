package com.udemy.Projects.Section5.P53;

public class MethodOverloadingChallenge {

    public static void main(String[] args) {

        double convertingInchesToCM = convertToCentimeters(45);
        System.out.println("convertingInchesToCM: " + convertingInchesToCM);
        System.out.println("");

        double convertingFtAndInchesToCM = convertToCentimeters(5, 9);
        System.out.println("convertingFtAndInchesToCM: " + convertingFtAndInchesToCM);
    }

    public static double convertToCentimeters (int heightInInches) {
        // convert inches to cm
        // 1 in = 2.54 cm
        // 1 ft = 12 in

        double inchesToCM = heightInInches * 2.54;
        System.out.println("Your height in inches is: " + heightInInches + ". In Centimeters, that is: " + inchesToCM + ".");
        // return # of cm, as double
        return inchesToCM;
    }


    public static double convertToCentimeters (int heightInFeet, int remainingHeightInInches) {
        // convert ft + in to just inches
        int convertedFeetToInches = heightInFeet * 12;
        int totalInches = remainingHeightInInches + convertedFeetToInches;

        // call first methid to get number of cm
        double result = convertToCentimeters(totalInches);
        System.out.println("Your height in Centimeters is: " + result + ".");
        // return # of cm, as double
        return result;
    }
}
