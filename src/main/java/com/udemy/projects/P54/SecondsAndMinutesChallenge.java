package com.udemy.projects.P54;

public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));

    }

    public static String getDurationString(int seconds){
        // add validation statements
        if (seconds <= 0){
            return "Invalid input for seconds";
        }
        else {
            int minutes = seconds /60;
            return getDurationString(minutes, seconds);
        }
    }

    public static String getDurationString(int minutes, int seconds){
        // add validation statements
        if (minutes < 0 || (seconds < 0 || seconds >=60)){
            return "Invalid input for mins and seconds";
        }
        else{
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            // return String in format "XXh, YYm, ZZs"
            int remainingSeconds = seconds % 60;
            return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        }
    }
}
