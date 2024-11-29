package com.udemy.challenges.Section5;

public class C3_MygabytesConverter {

    public static void main(String[] args) {

        // put any number as the argument
        printMegaBytesAndKiloBytes(2987);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes){

        int calculateMBs = kiloBytes / 1024;

        int calculateRemainingKBs = kiloBytes % 1024;

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kiloBytes + " KB = "
                    + calculateMBs + " MB and "
                    + calculateRemainingKBs + " KB");
        }

    }
}
