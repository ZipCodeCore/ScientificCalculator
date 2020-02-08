package com.zipcodewilmington.scientificcalculator.Application;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
@SuppressWarnings("resource")
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }
    
    public static void prln(String print) {
    	System.out.println(print);
    }

    public static String getStringInput(String prompt) {
		Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
    	Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        try {
        	return Integer.parseInt(userInput); 
        } catch (NumberFormatException e) { e.printStackTrace(); }
        return 0;
    }

    public static Double getDoubleInput(String prompt) {
    	Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        try {
        	return Double.parseDouble(userInput); 
        } catch (NumberFormatException e) { e.printStackTrace(); }
        return 0.0;
    }
}
