package com.udemy;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;

/**
 * The Console class stores all the utility methods.
 */
public class Console {

    /**
     * The Scanner, used to take the user's input.
     */
    static Scanner scanner = new Scanner(System.in);

    /**
     * Prompt for string string.
     *
     * @param prompt the prompt to the user
     * @return the string
     */
    public static String PromptForString(String prompt){
        try{
            System.out.print(prompt);
        } catch (Exception e) {
            System.out.println("Please enter a string input!");
            e.printStackTrace();
        }
        return scanner.nextLine().trim();
    }

    public static void displayDelayedString(String string)  {
        try{
            System.out.println(string);
            Thread.sleep(500);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
            e.printStackTrace();
        }
    }

    public static void displayMoreDelayedString(String string)  {
        try{
            System.out.println(string);
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("got interrupted!");
            e.printStackTrace();
        }
    }

    /**
     * Prompt for string string, without a prompt to the user
     *
     * @return the string
     */
    public static String PromptForString(){
        return scanner.nextLine().trim();
    }

    /**
     * Prompt for yes no boolean.
     *
     * @param prompt the prompt to the user
     * @return the boolean
     */
    public static boolean PromptForYesNo(String prompt){
        String userInput = "";
        try{
            System.out.print(prompt + " ( Y for Yes, N for No ) ?");
            userInput = scanner.nextLine().trim();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return
                (
                        userInput.equalsIgnoreCase("Y")
                                ||
                                userInput.equalsIgnoreCase("YES")
                );

    }

    /**
     * Prompt for short short.
     *
     * @param prompt the prompt to the user
     * @return the short
     */
    public static short PromptForShort(String prompt){
        short userInput = 0;
        try{
            System.out.print(prompt);
            String value = scanner.nextLine();
            userInput = Short.parseShort(value);

        } catch (NumberFormatException e) {
            System.out.println("Please enter a number input!");
            e.printStackTrace();
        }
        return  userInput;
    }

    /**
     * Prompt for int int.
     *
     * @param prompt the prompt to the user
     * @return the int
     */
    public static int PromptForInt(String prompt){
        try{
            System.out.print(prompt);
            String value = scanner.nextLine();
            if(!value.isEmpty() && NumberUtils.isCreatable(value)){
                return Integer.parseInt(value);
            }
        } catch (Exception e) {
            System.out.println("Please enter a number input!");
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Prompt for int int.
     *
     * @return the int
     */
    public static int PromptForInt(){
        try{
            String value = scanner.nextLine();
            if(!value.isEmpty() && NumberUtils.isCreatable(value)){
                return Integer.parseInt(value);
            }
        } catch (Exception e) {
            System.out.println("Please enter a number input!");
            e.printStackTrace();
        }
        return 0;
    }


    /**
     * Prompt for double double.
     *
     * @param prompt the prompt to the user
     * @return the double
     */
    public static double PromptForDouble(String prompt){
        try{
            System.out.print(prompt);
            String value = scanner.nextLine();
            if(!value.isEmpty() && NumberUtils.isCreatable(value)){
                return Double.parseDouble(value);
            }
        } catch (Exception e) {
            System.out.println("Please enter a number input!");
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Prompt for byte byte.
     *
     * @param prompt the prompt to the user
     * @return the byte
     */
    public static byte PromptForByte(String prompt){
        try{
            System.out.print(prompt);
            String value = scanner.nextLine();
            if(!value.isEmpty() && NumberUtils.isCreatable(value)){
                return Byte.parseByte(value);
            }
        } catch (Exception e) {
            System.out.println("Please enter a number input!");
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Prompt for byte byte.
     *
     * @return the byte
     */
    public static byte PromptForByte(){
        try{
            String value = scanner.nextLine();
            if(!value.isEmpty() && NumberUtils.isCreatable(value)){
                return Byte.parseByte(value);
            }
        } catch (Exception e) {
            System.out.println("Please enter a number input!");
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Prompt for float float.
     *
     * @param prompt the prompt to the user
     * @return the float
     */
    public static float PromptForFloat(String prompt){
        try{
            System.out.print(prompt);
            String value = scanner.nextLine();
            if(!value.isEmpty() && NumberUtils.isCreatable(value)){
                return Float.parseFloat(value);
            }
        } catch (Exception e) {
            System.out.println("Please enter a number input!");
            e.printStackTrace();
        }
        return 0;
    }

}
