package com.udemy.Projects.Section6.P59;

public class TraditionalSwitchChallenge {

    public static void main(String[] args) {

        // change the value to any value in the switch
        char letter = 'B';

        switch (letter){
            case 'A':
                String a = "Able";
                System.out.println(a);
                break;
            case 'B':
                String b = "Baker";
                System.out.println(b);
                break;
            case 'C':
                String c = "Charlie";
                System.out.println(c);
                break;
            case 'D':
                String d = "Dog";
                System.out.println(d);
                break;
            case 'E':
                String e = "Easy";
                System.out.println(e);
                break;
            default:
                System.out.println(letter + " not found!");
        }
    }
}
